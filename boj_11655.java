import java.io.*;

public class boj_11655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 13);
                if (arr[i] > 'Z')
                    arr[i] = (char)(arr[i] - 26);
            }
            else if ('a' <= arr[i] && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] + 13);
                if (arr[i] > 'z')
                    arr[i] = (char)(arr[i] - 26);
            }
        }
        System.out.println(arr);
    }

}
