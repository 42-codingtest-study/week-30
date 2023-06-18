import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        if (cnt < 1)
            return ;
        StringBuilder sb = new StringBuilder(br.readLine());

        for (int i = 0; i < cnt - 1; i++) {
            String str2 = br. readLine();

            if (sb.equals(str2))
                continue;
            for (int j = 0; j < sb.length(); j++)
            {
                if (sb.charAt(j) != str2.charAt(j)) {
                    sb.setCharAt(j, '?');
                }
            }
        }
        System.out.println(sb);
    }
}
