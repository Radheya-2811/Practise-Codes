import java.util.Scanner;

public class minTimeToInvade {
    static int count=0;
    public static void main(String[] args) {
        
        int n,m;
        Scanner sc=new Scanner(System.in);
        minTimeToInvade mt=new minTimeToInvade();
        n=sc.nextInt();
        m=sc.nextInt();
        char[][] arr=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='A') mt.markTerr(arr,i,j);
            }
        }
        System.out.println(count);
    }
    public void markTerr(char[][] arr,int i,int j){
        int row_1=i-1,col_1=j;
        int row_2=i,col_2=j+1;
        int row_3=i+1,col_3=j;
        int row_4=i,col_4=j-1;
        boolean change=false;
        if(row_1>=0 && arr[row_1][col_1]!='*'){
            arr[row_1][col_1]='A';
            change=true;
        }
        if(j+1<arr[0].length && arr[row_2][col_2]!='*'){
            arr[row_2][col_2]='A';
            change=true;
        }
        if(row_3<arr.length && arr[row_3][col_3]!='*'){
            arr[row_3][col_3]='A';
            change=true;
        }
        if(col_4>=0 && arr[row_4][col_4]!='*'){
            arr[row_4][col_4]='A';
            change=true;
        }
        if(change) count++;
    }

    
}
