package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());

        int bong = 0;
        while(true){
            if(sum%5==0){
                bong += sum / 5;
                System.out.println(bong);
                break;
            }
            else{
                sum -= 3;
                bong++;
            }
            if(sum<0){
                System.out.println(-1);
                break;
            }
        }
//        int five = 0;
//        int three = 0;
//
//        five = sum / 5;
//        sum %= 5;
//        three = sum / 3;
//        sum %= 3;
//        if(sum != 0)
//            System.out.println(-1);
//        else
//            System.out.println(five+three);


    }
}
