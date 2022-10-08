package tests.n3;

import org.junit.Test;
import tests.n3.base.BaseTests;

public class Task03 extends BaseTests {

    @Test
    public void test() {
        pageManager.getAuthPage()
                .fillField("Логин", "Taraskina Valeriya")
                .fillField("Пароль", "testing")
                .clickField()
                .checkHeader()
                .clickField()
                .clickBusinessTrip()
                .checkHeader()
                .choiseDiv()
                .choiseOrg()
                .choiseCheckbox()
                .choiseCity("Россия, Москва", "Россия, Москва")
                .choiseDate("29.10.2022", "30.10.2022")
                .clickSaveAndExit()
                .checkErrorMsg();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
