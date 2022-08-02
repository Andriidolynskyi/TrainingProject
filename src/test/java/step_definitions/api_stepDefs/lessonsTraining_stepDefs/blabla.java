package step_definitions.api_stepDefs.lessonsTraining_stepDefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class blabla {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        while (list.size() != 5) {
            int num = random.nextInt(70) + 1;
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
        System.out.println(new Integer(random.nextInt(25) + 1));
    }


}
