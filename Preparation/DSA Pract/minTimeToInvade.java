import java.util.*;

public class MinTimeToInvade {
    static class Cell {
        int row, col, time;
        Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            arr[i] = line.toCharArray();
        }

        int result = bfsInvasion(arr, n, m);
        System.out.println(result);
    }

    public static int bfsInvasion(char[][] grid, int n, int m) {
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        // Add all 'A' cells to the queue (multi-source BFS)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'A') {
                    queue.add(new Cell(i, j, 0));
                    visited[i][j] = true;
                } else if (grid[i][j] == '*') {
                    visited[i][j] = true;
                }
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int maxTime = 0;

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();
            maxTime = Math.max(maxTime, curr.time);

            for (int d = 0; d < 4; d++) {
                int newRow = curr.row + dx[d];
                int newCol = curr.col + dy[d];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m &&
                    !visited[newRow][newCol] && grid[newRow][newCol] == 'E') {
                    visited[newRow][newCol] = true;
                    grid[newRow][newCol] = 'A'; // mark as invaded
                    queue.add(new Cell(newRow, newCol, curr.time + 1));
                }
            }
        }

        // Check for any remaining 'E'
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 'E')
                    return -1;

        return maxTime;
    }
}
