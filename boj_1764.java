import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj_1764 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet list1 = new HashSet(d);
        HashSet list2 = new HashSet(b);

        for (int i = 0; i < d; i++){
            list1.add(new String(br.readLine()));
        }
        for (int i = 0; i < b; i++){
            list2.add(new String(br.readLine()));
        }
        list1.retainAll(list2);
        ArrayList res_list = new ArrayList(list1);
        Collections.sort(res_list);

        long cnt = res_list.size();
        System.out.println(cnt);
        for (long i = 0; i < cnt; i++){
            System.out.println(res_list.get((int)i));
        }
    }
}
