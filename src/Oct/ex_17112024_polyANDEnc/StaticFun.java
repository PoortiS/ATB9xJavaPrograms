package Oct.ex_17112024_polyANDEnc;

public class StaticFun {
    static int a = 10;    //static Var 1

    int b = 90;// non Static Var 2

    static void m1() {
        System.out.println("This is Static Method");
    }

    void m2() {
        System.out.println("This is Non-Static Method");
    }

    // Non Static method can also access everything directly
    void m() {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

}
