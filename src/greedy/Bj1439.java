package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] ch = str.toCharArray();
        int n = ch.length;
        int count_zero = 0;
        int count_one = 0;
        char lastCh = ch[0];

        for(int i = 1; i<n; i++){
            if(lastCh != ch[i]){
                if(lastCh=='0'){
                    count_zero++;
                    // 중요!
                    lastCh = ch[i];
                }
                else {
                    count_one++;
                    // 중요!
                    lastCh = ch[i];
                }
            }
        }
        if(lastCh=='0') count_zero++;
        else count_one++;
        System.out.println(Math.min(count_zero, count_one));
    }

}
