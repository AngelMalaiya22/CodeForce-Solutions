import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            boolean[] printed = new boolean[n + 1];
            int[] stack = new int[n + 1];
            int top = 0;
            for (int i = 1; i <= n; i++) {
                char c = s.charAt(i - 1);
                if (c == '1') {
                    stack[top++] = i;
                } else if (c == '2') {
                    if (top > 0) {
                        printed[stack[--top]] = true;
                    } else {
                        printed[i] = true;
                    }
                } else {
                    printed[i] = true;
                }
            }
            int cnt = 0;
            StringBuilder line = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (!printed[i]) {
                    cnt++;
                    line.append(i).append(" ");
                }
            }
            sb.append(cnt).append("
").append(line.toString().trim()).append("
");
        }
        System.out.print(sb);
    }
}