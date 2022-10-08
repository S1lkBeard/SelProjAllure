package n3.framework.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.junit4.AllureJunit4;
import n3.framework.managers.DriverManager;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class AlluresListener extends AllureJunit4 {

    @Override
    public void testFailure(final Failure failure) {
        getScreenshot();
        super.testFailure(failure);
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] getScreenshot() {
        return ((TakesScreenshot)  DriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
