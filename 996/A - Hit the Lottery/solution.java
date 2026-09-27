import java.util.Scanner;
 
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        
        // Greedy approach: always pick the largest available denomination
        count += n / 100;
        n %= 100;
        
        count += n / 20;
        n %= 20;
        
        count += n / 10;
        n %= 10;
        
        count += n / 5;
        n %= 5;
        
        count += n; // remaining $1 bills
        
        System.out.println(count);
        
        sc.close();
    }
}