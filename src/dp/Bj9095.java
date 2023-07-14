package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj9095 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i = 4; i < dp.length; i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        for(int i = 0 ; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(dp[x]);
        }
    }
}
