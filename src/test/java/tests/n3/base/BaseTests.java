package tests.n3.base;

import n3.framework.managers.DriverManager;
import n3.framework.managers.InitManager;
import n3.framework.managers.PageManager;
import n3.framework.managers.PropManager;
import n3.framework.utils.PropsConsts;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseTests {

    private DriverManager driverManager = DriverManager.getInstance();
    private PropManager propManager = PropManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();

    @BeforeClass
    public static void BeforeClass() {
        InitManager.initFramework();
    }

    @Before
    public void before() {
        driverManager.getDriver().get(propManager.getProperty(PropsConsts.BASE_URL));
    }

    @AfterClass
    public static void AfterClass() {
        InitManager.quitFramework();
    }
}
