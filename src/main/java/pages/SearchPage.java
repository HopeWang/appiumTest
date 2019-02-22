package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SearchPage extends BasePage{
    By searchinput = By.id("search_input_text");

    public SearchPage search(String keyword){
        find(By.className("android.widget.EditText")).sendKeys(keyword);
        return this;

    }

    public MainPage cancel(){
        find(By.id("action_close")).click();
        return new MainPage();
    }

    public SearchPage getByStock(String keyword){
        return this;

    }

    public ArrayList<String> getAll(){
        ArrayList<String> array = new ArrayList<String>();
        for(WebElement e: Driver.getCurrentDriver().findElements(By.id("stockName"))){
            array.add(e.getText());

        }

        return array;

    }

    public ArrayList<String> addSelected(){
        ArrayList<String> array = new ArrayList<String>();
        WebElement select = find(By.xpath("//*[contains(@resource-id, 'follow') and contains(@resource-id, '_btn')]"));
        //array.add(select.getAttribute("resource-id"));
        select.click();
        WebElement select2 = find(By.xpath("//*[contains(@resource-id, 'follow') and contains(@resource-id, '_btn')]"));
        //array.add(select2.getAttribute("resource-id"));
        return array;

    }

    public SearchPage removeSelected(){
        return this;

    }

}
