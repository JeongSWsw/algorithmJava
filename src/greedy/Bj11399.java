package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int prev = 0;	// 이전까지의 대기시간 누적합
        int sum = 0;	// 사람별 대기시간 총합

        for(int i = 0; i < n; i++) {
            // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
            sum += prev + arr[i];

            // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
            prev += arr[i];
        }
        System.out.println(sum);
    }
}