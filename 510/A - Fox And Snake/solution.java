import java.util.Scanner;
 
public class Fox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int r = 1; r <= n; r++) {
            if (r % 2 != 0) {
                // Odd rows: full line of '#'
                for (int c = 0; c < m; c++) {
                    sb.append('#');
                }
            } else {
                // Even rows: '#' at the right for row % 4 == 2, at the left for row % 4 == 0
                if (r % 4 == 2) {
                    for (int c = 0; c < m - 1; c++) {
                        sb.append('.');
                    }
                    sb.append('#');
                } else {
                    sb.append('#');
                    for (int c = 0; c < m - 1; c++) {
                        sb.append('.');
                    }
                }
            }
            sb.append('
');
        }
        
        System.out.print(sb.toString());
        sc.close();
    }
}