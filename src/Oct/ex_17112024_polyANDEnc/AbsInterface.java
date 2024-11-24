package Oct.ex_17112024_polyANDEnc;

interface Shape{
    //Final and Static Variables
    int length=10;
    int breath=90;
    int height=8;
    //Abstract method defined
    void circle();
    //Default void Square
    default void Square()
    {
        System.out.println("This is Square method");
    }
    //Static method

    static void rectangle()
    {
        System.out.println("This is for Static method");
    }

}
public class AbsInterface implements Shape {

    public void circle() {
        System.out.println("This is Crcle Abstract method");
    }



public static void main(String []args)
{
    AbsInterface a1=new AbsInterface();
    //Abstract method
    a1.circle();

    //Default method
    a1.Square();

    // Calling Static method which can directly access from Interface
    Shape.rectangle();

    Shape s1=new AbsInterface();
    s1.circle();
    s1.Square();
    System.out.println(Shape.length*Shape.breath);


}
}
