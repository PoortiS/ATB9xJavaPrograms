package Oct.ex_30102024;

import java.util.Scanner;

public class StarLHS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value for N");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int k =N-1; k>=i; k--) {
                System.out.print(" ");
            }
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }

                        System.out.println();

            }
        }
    }