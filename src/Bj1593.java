import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1593 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int g = Integer.parseInt(stringTokenizer.nextToken());
        int s = Integer.parseInt(stringTokenizer.nextToken());
        String W = bufferedReader.readLine();
        String S = bufferedReader.readLine();

        int W_arr_length =0;
        for(int i = W.length(); i > 0; i--) {
            W_arr_length *= W.length();
        }
        String[] W_arr = new String[W_arr_length];
        for(int i = 0; i < W_arr.length; i++){
//            for(int j = 0; j < W_)
        }
        int answer = 0;
        for(int i = 0; i < W_arr.length; i++) {
            if(S.contains(W_arr[i])){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
