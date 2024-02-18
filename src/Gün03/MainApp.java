package Gün03;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://techno.study/tr");

      try {
          Thread.sleep(3000);
      }catch(InterruptedException e) {
          throw new RuntimeException(e);
      }

        MyFunc.Bekle(3);
    //bekleme
    driver.quit();
    }
}
