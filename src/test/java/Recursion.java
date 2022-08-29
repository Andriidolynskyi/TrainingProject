import org.junit.Test;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(recursive1Factorial(10));


    }

    public static int recursive1Factorial(int num) {
        int result = num;
        if (num == 1) {
            return num;
        } else {
            return num * recursive1Factorial(num - 1);
        }
    }





}
