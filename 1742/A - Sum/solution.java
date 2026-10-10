import java.util.Scanner;
 
public class sum {
    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
        sc.close();
    }
}