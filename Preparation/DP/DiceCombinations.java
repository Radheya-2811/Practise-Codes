public class DiceCombinations {
    /*Q1 your task is to count the number of ways to construct sum n by throwing a dice 
     one or more times.Each throw produces an outcome between 1 and 6.*/
    
    // public static int countWaysToProduceNum(){
    //     int resutl=1;

    //     return result;
    // }
    public static void main(String[] args) {
        int n=3;
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(j<=i)dp[i]=dp[i]+dp[i-j];
            }
        }
        System.out.println(dp[n]);
    }
}
