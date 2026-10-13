import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();
            int placeValue = 1;
            
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    roundNumbers.add(digit * placeValue);
                }
                n /= 10;
                placeValue *= 10;
            }
            
            // Print count of round numbers (k)
            System.out.println(roundNumbers.size());
            
            // Print the round numbers separated by spaces
            for (int i = 0; i < roundNumbers.size(); i++) {
                System.out.print(roundNumbers.get(i) + (i == roundNumbers.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        
        sc.close();
    }
}