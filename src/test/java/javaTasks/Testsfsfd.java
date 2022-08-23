package javaTasks;

import org.junit.Test;

public class Testsfsfd {

    @Test
    public void fibonachi(){

        int a = 0;
        int b = 1;
        int c = 0;


        for (int i = 0; i < 100; i++) {
            a=b;
            b=c;
            c = a + b;
            System.out.println(b);

        }
    }

    @Test
    public void swapTwoNumbers(){
        int num1 = 25;
        int num2 = 13;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);


    }



}
