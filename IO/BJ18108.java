package IO;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        int year = Integer.parseInt(str);

        System.out.println(year - 543);
    }
}
