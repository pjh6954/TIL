import java.util.Scanner;

public class problem2029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("#"+(i+1)+" "+(a/b)+" "+(a%b));
        }

    }
}
