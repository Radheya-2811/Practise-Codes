public class fibonaci {
    //************USINGMEMORIZARION*************
    public static int findF(int n,int[] dp){
        if(n<=2) return 1;
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=findF(n-1, dp)+findF(n-2, dp);
        return dp[n];
    }
   // public static int findFIterative(int n)
    public static void main(String[] args) {
       // System.out.println(findFib(5));
       int n=5;
        int[] dp=new int[100];
       for(int i=3;i<10;i++){
        System.out.println(findF(i, dp));
       }
    }
   // public static int findFib(int n){
   //     if(n<=1) return 1;
    //    return findFib(n-2)+findFib(n-1);
   // }

   
}
