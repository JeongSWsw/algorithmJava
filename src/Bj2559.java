import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr_length = Integer.parseInt(st.nextToken());
        int check_length = Integer.parseInt(st.nextToken());
        int[] arr = new int[arr_length];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int sum = 0;
        int window_size = 0;
        int start = 0;
        boolean isInitial = true;
        for(int i = 0 ; i<arr.length; i++){
            sum += arr[i];
            window_size++;
            if (window_size == check_length) {
                if(isInitial){
                    max = sum;
                    isInitial = false;
                }
                if(max < sum){
                    max = sum;
                }
                sum -= arr[start];
                start++;
                window_size--;
            }
        }

        System.out.println(max);

    }
}
