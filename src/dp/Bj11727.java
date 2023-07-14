package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj11727 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1]=1;
        dp[2]=3;
        for(int i = 3; i < x+1; i++){
            dp[i] = (dp[i-1] + dp[i-2] * 2) % 10007;
        }
        System.out.println(dp[x]);
    }
}
