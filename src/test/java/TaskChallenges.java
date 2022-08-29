import cucumber.api.java.sl.In;
import org.junit.Test;

import java.util.*;


public class TaskChallenges {

    @Test
    public void fibonacci() {

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < 100; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    //Write a program to find sum of each digit of a given number using recursion
    @Test
    public void recursion() {

    }

    @Test
    public void armstrongNumber() {
//        int num = 8208;
//        int sum = 0;
//        for (int i = 0; i < Integer.toString(num).length(); i++) {
//            int temp = Integer.parseInt(Integer.toString(num).charAt(i) + "");
//            for (int j = 0; j < Integer.toString(num).length()-1; j++) {
//                temp *= Integer.parseInt(Integer.toString(num).charAt(i) + "");
//            }
//            sum += temp;
//        }
//        System.out.println(sum);

        int num = 153;
        int originalNumber = num;
        int remainder = 0;
        int result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += ((int) Math.pow(remainder, String.valueOf(num).length()));
            originalNumber /= 10;
        }
        System.out.println(result);
    }

    @Test
    public void reverseWithoutString() {
        int num = 153;
        int result = 0;

        while (num != 0) {
            result *= 10;
            result += num % 10;
            num /= 10;
        }
        System.out.println(result);
    }

    @Test
    public void distinctWords() {

        String str = "Nazar has a game today with Andrii and Nazar";
        String empty = "";

        String[] arrStr = str.split(" ");

        for (int i = 0; i < arrStr.length; i++) {
            int countWords = 0;
            for (int j = 0; j < arrStr.length; j++) {
                if (arrStr[i].equalsIgnoreCase(arrStr[j])) {
                    countWords++;
                }
            }
            int countChar = 0;
            for (int j = 0; j < arrStr[i].length() - 1; j++) {
                if (Integer.toString(arrStr[i].charAt(j)).equalsIgnoreCase(Integer.toString(arrStr[i].charAt(j + 1)))) {
                    countChar++;
                }
            }
            if (countWords == 1 && countChar < 1) {
                empty += arrStr[i] + " ";
            }
        }
        System.out.println(empty.trim());
    }

    @Test
    public void pangram() {
        String str = "Ar23nN$";

        String empty = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                empty += str.charAt(i);
            }
        }
        System.out.println(empty);
    }

    @Test
    public void factorialNumber() {
        int num = 10;
        int result = 1;

        while (num != 0) {
            result *= num;
            num--;
        }
        System.out.println(result);
    }

    @Test
    public void primeNumbers() {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " ");
            }
        }
    }

    @Test
    public void secondBiggest() {
        int[] arr = {100, 100, 100, 100, 3, 4, 5, 98, 32, 54, 100};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

    @Test
    public void swapNumbers() {
        int num1 = 45;
        int num2 = 15;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);
    }

    @Test
    public void removeDuplicate() {
//
        int[] arr = {1, 2, 4, 5, 6, 3, 5, 4, 1, 7, 8, 9, 10};
//
//        int size = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                size++;
//            }
//        }
//        System.out.println(size);
//        int[] newArr = new int[size];
//
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr));

        //Using list
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if (count == 1){
//                list.add(arr[i]);
//            }
//        }
//        System.out.println(list);

        //Using Set
//        Set<Integer> set = new HashSet<>();
//
//        for(int v: arr){
//            set.add(v);
//        }
//        System.out.println(set);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }


}
