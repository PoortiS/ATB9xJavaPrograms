package Oct.ex_17112024_polyANDEnc;

public class EncMain {
    public static void main(String []args)
    {
        Enc a1=new Enc();
        a1.setAccNo(122);
        a1.setAccholderName("POORTI");
        a1.setAmount(9000);

        System.out.println(a1.getAccNo());
        System.out.println(a1.getAccholderName());
        System.out.println(a1.getAmount());
    }
}
