package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] changes = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            changes[i] = Integer.parseInt(br.readLine());
        }
        for(int i = n-1; i >=0; i--){
            if(target>=changes[i]){
                count += target / changes[i];
                target %= changes[i];
            }
        }
        System.out.println(count);
    }
}
