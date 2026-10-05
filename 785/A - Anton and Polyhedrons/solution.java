import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
 
        int n = sc.nextInt();
        int totalFaces = 0;
 
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s.charAt(0)) {
                case 'T': totalFaces += 4; break;  // Tetrahedron
                case 'C': totalFaces += 6; break;  // Cube
                case 'O': totalFaces += 8; break;  // Octahedron
                case 'D': totalFaces += 12; break; // Dodecahedron
                case 'I': totalFaces += 20; break; // Icosahedron
            }
        }
 
        System.out.println(totalFaces);
    }
}