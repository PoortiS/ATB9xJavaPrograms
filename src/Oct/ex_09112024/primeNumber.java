package Oct.ex_09112024;
import java.util.Scanner;

public class primeNumber {
    public static void main(String []args)
    {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        sc.close();

          if (num > 1)
          {
              for (int i = 1; i <= num; i++)
              {
                  if (i % num == 0)
                      count++;
              }
              if (count == 2) {
                  System.out.println("Number is Prime" + num);

              }
              else
              {
                  System.out.println("Number is not a Prime" + num);
              }

          }
          else
          {
              System.out.println("Entered number is not Prime");
          }


          }
        }

