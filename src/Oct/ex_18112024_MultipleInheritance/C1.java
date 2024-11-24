package Oct.ex_18112024_MultipleInheritance;

public class C1 extends C2 implements M1,M2
{
    public void m1()
    {
        System.out.println("This is for Abstract Method m1()");
        System.out.println(x);
    }

    public void m2()
    {
        System.out.println(y);

    }

    public static void main(String []args)
    {
        C1 obj1=new C1();
        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
}
