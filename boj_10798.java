import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();
        int maxLength = Math.max(Math.max(Math.max(Math.max(str1.length(), str2.length()), str3.length()), str4.length()), str5.length());

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < maxLength; j++) {

            if (j < str1.length())
                sb.append(str1.charAt(j));
            if (j < str2.length())
                sb.append(str2.charAt(j));
            if (j < str3.length())
                sb.append(str3.charAt(j));
            if (j < str4.length())
                sb.append(str4.charAt(j));
            if (j < str5.length())
                sb.append(str5.charAt(j));
        }
        System.out.println(sb);
    }
}
