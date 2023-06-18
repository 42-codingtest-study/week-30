import java.io.*;

public class boj_27866 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine());

        if (0 < idx && idx <= str.length())
            System.out.println(str.charAt(idx - 1));
    }
}
