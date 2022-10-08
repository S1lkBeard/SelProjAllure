package n3.framework.managers;

import n3.framework.utils.PropsConsts;

import java.util.concurrent.TimeUnit;

public class InitManager {

    private static final PropManager props = PropManager.getInstance();

    private static final DriverManager driverManager = DriverManager.getInstance();

    public static void initFramework() {
        driverManager.getDriver().manage().window().maximize();
        driverManager.getDriver().manage().timeouts().
                pageLoadTimeout(Integer.parseInt(props.getProperty(PropsConsts.IMPLICITLY_WAIT)), TimeUnit.SECONDS);
        driverManager.getDriver().manage().timeouts().
                implicitlyWait(Integer.parseInt(props.getProperty(PropsConsts.PAGE_LOAD_TIMEOUT)), TimeUnit.SECONDS);
    }

    public static void quitFramework() {
        driverManager.quitDriver();
    }
}
