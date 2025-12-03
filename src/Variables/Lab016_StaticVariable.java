package Variables;

public class Lab016_StaticVariable {
    //Static Variable: Declared with static keyword; shared across all objects of the class.

    //Use case: Base URL, Global Wait Time, Environment Name
    //    (these values are same for entire framework)

    public class Config {

        // Static Variables
        static String baseUrl = "https://app.com";
        static int implicitWait = 10;
        static String environment = "QA";
    }


    //Used anywhere without creating object:

          //  driver.get(Config.baseUrl);
          //  driver.manage().timeouts().implicitlyWait(Config.implicitWait);
}
