package Oct.ex_19102024;
import java.util.*;
class StringReversal {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=str.nextLine();
        String rev = "";
        int len= str1.length();
        for(int i=len-1;i>=0;i--) {
            rev = rev + str1.charAt(i);

        }
        System.out.println("Reversed String is :" + rev);
}}