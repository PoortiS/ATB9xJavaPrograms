package Oct.ex_22102024;

import java.util.*;


public class Palindrome {

    public static void main (String[] args)
    {
        String Original = "";
        String Reverse  = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String of your choice");
        Original = in.nextLine();
        int length = Original.length();
        for (int i = length - 1; i > 0; i--)
        {
            Reverse = Reverse + Original.charAt(i);
        }

        if (Original.equals(Reverse))
        System.out.println("String are Same");
        else
        System.out.println("Strings are not same");
    }


    }
