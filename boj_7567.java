import java.io.*;

public class boj_7567 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 10;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1))
                sum += 5;
            else
                sum += 10;
        }
        System.out.println(sum);
    }
}
