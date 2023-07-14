package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj11726 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        /** new int[n+1] 로 하면  런타임 에러(ArrayIndexOutOfBounds) 발생 new int[1001]로 바꿔줌 */
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i = 3; i < x+1; i++){
            dp[i] = (dp[i-2] + dp[i-1])%10007;
            /** 마지막에만 %10007 연산을 해줄 시 중간에 저장되는 값들이 int값을 넘어서므로 오버플로우가 발생하기 때문 */
        }
        System.out.println(dp[x]);
    }
}
