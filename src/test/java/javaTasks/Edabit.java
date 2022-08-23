package javaTasks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Edabit {

    @Test
    public void howManySolution() {
        int num = 12;
        int length = 4;
        int[] nums = new int[length];

        for (int i = 1; i <= length; i++) {
            nums[i - 1] = num * i;
        }
    }

    @Test
    public void warOfNumber() {
        int[] nums = {2, 8, 7, 5};

        for (int i = 0; i < nums.length; i++) {

        }
    }

    public static void main(String[] args) {

    }

    @Test
    public void secondMaximus() {
        int[] ar = new int[]{900, 999, 781, 8, 99, 103, 999, 12, 4};

        int max = ar[0];
        int secondMax = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
            if (ar[i] < secondMax) {
                secondMax = ar[i];
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (secondMax < ar[i] && ar[i] != max) {
                secondMax = ar[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }

    @Test
    public void secondMinimum() {
        int[] ar = new int[]{900, 999, 781, 8, 99, 103, 999, 12, 4};

        int min = ar[0];
        int secondMinimum = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i < ar.length; i++) {
            if (secondMinimum > ar[i] && ar[i] != min) {
                secondMinimum = ar[i];
            }
        }
        System.out.println(secondMinimum);
    }

    @Test
    public void lists() {

        List value = new ArrayList();

        value.add(12);
        value.add("Bla");

        System.out.println(value);

        int num = Integer.parseInt(value.get(0).toString());

        System.out.println(num);


    }

    @Test
    public void testAPI() {

        int l = 2;
        int r = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 5; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        System.out.println(list);

    }


    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }

    //bon half
    //min - 4 people, 27 max people
    //roal list 1/3 from remaining half
    //coa remaining
    //age 18+
    //differences between bon and roaln is 3 or less, napoleon arrives on turn 4 otherwise on 5
    // if coa can be evanly divided by roy substract 1 turn from nap arrival
    // if time is less than 2 hrs nap arrives on turn 3 dosent matter how many players



}
