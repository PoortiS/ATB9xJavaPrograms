package Oct.ex_30102024;

import java.util.Scanner;

public class StarpatternReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for N");
        int N = sc.nextInt();
        for (int i = N; i>=0; i--)
        {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}