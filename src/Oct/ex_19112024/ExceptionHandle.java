package Oct.ex_19112024;
import java.util.*;

public class ExceptionHandle {
    public static void main(String []args)
    {
        System.out.println("Starting of Program");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc1.nextInt();

        try{
            System.out.println(100/n);

        } catch (Exception e)
        {
            System.out.println("Invalid Data");
            System.out.println(e.getMessage());
        }
        System.out.println("Program is completed");
        System.out.println("Program is Exited");

    }
}
