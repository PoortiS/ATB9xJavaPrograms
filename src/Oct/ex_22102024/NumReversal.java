package Oct.ex_22102024;
import java.util.*;

public class NumReversal
{
    public static void main (String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = in.nextInt();
    while(num>0)
    {
      int rem = num % 10;
      int rev = (rem*10)+rem;
      num = num/10;
      System.out.print(rem);

    } }






}

