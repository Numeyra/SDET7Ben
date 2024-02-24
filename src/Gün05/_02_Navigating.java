package Gün05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

    driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//navigate().to ile aayni,history icin kullanilir,ileri-geri icin
        WebElement element= driver.findElement(By.id("alerttest"));
   element.click();
        MyFunc.Bekle(3);
        System.out.println("driver.getTitle()="+driver.getTitle());//gecerli title
        System.out.println("driver.getCurrentUrl()="+driver.getCurrentUrl());//gecerli url

        driver.navigate().back(); //bir önceki sayfaya dön
        MyFunc.Bekle(3);
        System.out.println("driver.getTitle()="+driver.getTitle());
        System.out.println("driver.getCurrentUrl()="+driver.getCurrentUrl());


        driver.navigate().forward();//bir sonraki sayfaya git(daha once gittigin)
        System.out.println("driver.getTitle()="+driver.getTitle());
        System.out.println("driver.getCurrentUrl()="+driver.getCurrentUrl());




       BekleKapat();












    }}
