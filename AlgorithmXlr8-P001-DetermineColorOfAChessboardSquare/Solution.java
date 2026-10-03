import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();
        
        char colChar = coordinates.charAt(0);
        int row = coordinates.charAt(1) - '0';
        int col = colChar - 'a' + 1;
        
        if ((col + row) % 2 == 0) {
            System.out.println("Black");
        } else {
            System.out.println("White");
        }
        
        sc.close();
    }
}