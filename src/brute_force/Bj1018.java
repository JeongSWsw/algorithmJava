package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018 {
    public static int min_global = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        String line;
        for(int i = 0; i < n; i++){
            line = br.readLine();
            for(int j = 0; j < m ; j++){
                arr[i][j] = line.charAt(j);

            }
        }


        for(int i = 0; i < n-7; i++){
            for(int j = 0; j < m-7; j++){
                find(arr, i, j);
            }
        }
        System.out.println(min_global);
    }
    public static void find(char[][] arr, int x, int y){
        int cnt = 0;
        char WB = 'W';
        for(int i = x; i < x+8; i++){
            for(int j = y; j < y+8; j++){
                if(arr[i][j] != WB){
                    cnt++;
                }
                WB = WB=='W'?'B':'W';
            }
            WB = WB=='W'?'B':'W';
        }

        int min_local = Math.min(cnt, 64-cnt);
        min_global = Math.min(min_global, min_local);
    }
}
