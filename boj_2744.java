import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] result = br.readLine().toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] <= 'Z')
                System.out.print((char)(result[i] + 32));
            else
                System.out.print((char)(result[i] - 32));
        }
        System.out.println();
    }

}
