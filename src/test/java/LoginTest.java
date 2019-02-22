
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;
import sun.applet.Main;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {
    static MainPage mainPage;
    static ProfilePage profilePage;

    @BeforeAll
    static void beforeAll(){
        mainPage = MainPage.start();
        profilePage = mainPage.gotoProfile();

    }

    @ParameterizedTest
    @CsvSource({
            "13362371136, xxxxxx , 用户名或密码错误",
            "133623711, xxxxxx , 手机号码填写错误",
    })

    public void 密码登录(String username, String password , String expection){
        LoginPage loginPage = profilePage.gotoLogin();
        loginPage.passwordFail(username,password);
        assertThat(loginPage.getMessage(),equalTo(expection));
        profilePage = loginPage.gotpProfile();

    }


}

