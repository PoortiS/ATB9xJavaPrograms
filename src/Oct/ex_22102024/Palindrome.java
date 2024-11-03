package Oct.ex_22102024;

import java.util.*;


public class Palindrome {

    public static void main (String[] args)
    {
        String Original = "";
        String Reverse  = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String of your choice");
        Original = input.nextLine();
        int len = Original.length();
        for (int i = len - 1; i > 0; i--)
        {
            Reverse = Reverse + Original.charAt(i);
        }

        if (Original.equals(Reverse))
        System.out.println("String are Same");
        else
        System.out.println("Strings are not same");
    }


    }
