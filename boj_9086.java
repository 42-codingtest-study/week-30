import java.io.*;

public class boj_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            if (str.length() != 0)
                System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
        }
    }
}
