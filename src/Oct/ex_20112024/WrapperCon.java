package Oct.ex_20112024;

public class WrapperCon {

    void Wrapper() {
        //Interger Parsing
        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.valueOf(s1) + Integer.valueOf(s2));
        //System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
    }

    public static void main(String[] args) {
        WrapperCon w1 = new WrapperCon();
        w1.Wrapper();
        System.out.println(w1);
    }

}





