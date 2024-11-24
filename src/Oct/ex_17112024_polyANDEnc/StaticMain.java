package Oct.ex_17112024_polyANDEnc;

public class StaticMain {
    public static void main(String[] args) {
        //Static method can access static stuff directly
        System.out.println(StaticFun.a);
        StaticFun.m1();
        //Static method can access non-static stuff only through object
        StaticFun s1 = new StaticFun();
        {
            System.out.println(s1.b);
            s1.m2();

        }
    }
}