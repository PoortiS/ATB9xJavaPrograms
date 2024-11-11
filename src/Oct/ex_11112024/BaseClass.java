package Oct.ex_11112024;

public class BaseClass {
    private String browser;

    BaseClass(String b) {
        System.out.println("CC-BaseClass");
    }

    BaseClass() {
        System.out.println("DC-BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth)
        {
            this.browser = browser;
        } else
        {
            System.out.println("Not Allowed");
        }
    }
    void openBrowser()
    {
        System.out.println("Opening Browser");
    }
    public void openBrowser(String browserName)
    {
        System.out.println("Open Browser" + browserName);
    }
    void closeBrowser()
    {
        System.out.println("Opening Browser");
    }
}