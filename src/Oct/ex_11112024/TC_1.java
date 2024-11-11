package Oct.ex_11112024;

public class TC_1 extends BaseClass{
    public TC_1()
    {   super();
        System.out.println("Default Constructor of TC_1");
    }

    public void startTC()
    {
        openBrowser("Chrome");
        closeBrowser();

    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }
}
