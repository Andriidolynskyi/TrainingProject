package step_definitions.api_stepDefs.lessonsTraining_stepDefs;

import org.junit.Test;

import java.sql.*;
import java.util.*;

public class Testing {
    public static void main(String[] args) {


    }

    @Test
    public void missingNumber() {

        int[] numbers = {1, 2, 6, 9, -10, 10, 14};
        Arrays.sort(numbers);

        int count = numbers[0];
        int index = 0;
        while (count != numbers[numbers.length - 1]) {
            if (numbers[index] == count) {
                index++;
                count++;
            } else {
                System.out.println(count);
                count++;
            }
        }
    }

    @Test
    public void printOnlyNumbers() {
        String str = "I5 a3m an Soft9ware 2 Develop3rs i Test";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }
        System.out.println(sum);
    }

    @Test
    public void removeDuplicated() {
        int[] num = {20, 20, 5, 9, 20, 11, 20, 4};
        Arrays.sort(num);
        int biggest = num[0];
        int secondBiggest = num[1];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > biggest) {
                biggest = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > secondBiggest && num[i] < biggest) {
                secondBiggest = num[i];
            }
        }
        System.out.println(secondBiggest);
    }

    @Test
    public void javaIsFan() {

        String str = "javaisfun";
        String empty = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
                    count++;
                }
            }
            if (!empty.contains(str.charAt(i) + "")) {
                empty += str.charAt(i);
                System.out.println(str.charAt(i) + ": " + count);
            }
        }
    }

    @Test
    public void sortArray() {
        int[] arr = {5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754};

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void iterateYourName() {

        String name = "NURLAN";
        String nums = "1234";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "");
            if (i < nums.length()) {
                System.out.print(nums.charAt(i));
            }
        }
    }

    @Test
    public void endWith() {
        int range = 25;
        for (int i = 1; i <= range; i++) {
            if (i % 10 == 3) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void removeCommon() {

        String s1 = "java";
        String s2 = "apple";
        String empty = s1;

        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains(String.valueOf(s1.charAt(i)))) {
                empty = s1.replace(String.valueOf(s1.charAt(i)), "");
                s2 = s2.replace(s1.charAt(i) + "", "");
            }
        }
        System.out.println(empty + s2);
    }

    @Test
    public void printAllDuplicates() {

        int[] nums = {1, 2, 5, 15, 3, 1, 5, 3, 9};
        String unique = "";

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > 1 && !unique.contains(nums[i] + "")) {
                unique += nums[i] + ",";
            }
        }
        System.out.println(unique.substring(0, unique.length() - 1));
    }

    @Test
    public void anagram() {

        String s1 = "lips".toLowerCase();
        String s2 = "Slip".toLowerCase();

        boolean check = true;

        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains(String.valueOf(s1.charAt(i)))) {
                check = false;
                break;
            }
            s2 = s2.replaceFirst(String.valueOf(i), "");
        }
        if (check) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }


    @Test
    public void reboot() {

        String[] str = {"Capital one", "Bank of America", "Bank of America", "GP Morgan", "Fifth Bank", "GP Morgan"};

        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(str));

        int count = 1;

        for (String s : set1) {
            System.out.println(count++ + ": " + s);
        }

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(str));

        count = 1;
        for (String s : set2) {
            System.out.println(count++ + " set2: " + s);
        }

        for (int i = 0; i < set2.size(); i++) {
            System.out.println(i + " : " + set2);
        }

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            list.remove(i);
//        }
        System.out.println(list);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testingMAP() {

        Map<String, Integer> mp1 = new HashMap<>();
        mp1.put("A", 1);
        mp1.put("B", 2);
        mp1.put("C", 3);
        mp1.put("D", 4);
        mp1.put("A", 5);
        mp1.put("E", 1);
        mp1.put(null, 1);

        System.out.println(mp1);

        for (Map.Entry s : mp1.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }

        for (int s : mp1.values()) {
            System.out.println(s);
        }
        for (String s : mp1.keySet()) {
            System.out.println(s);
        }


    }

    @Test
    public void testDependencies() throws SQLException {

        String url = "jdbc:oracle:thin:@techtorialacademy.cewvxnnnahzx.us-east-1.rds.amazonaws.com:1521:ORCL";
        //port : 1521
        //SID: ORCL
        String username = "techtorial";
        String passsword = "techtorialbatch12";

        Connection connection;
        Statement statement;

        Map<String, String> map1 = new HashMap<>();

        try {
            connection = DriverManager.getConnection(url, username, passsword);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery("select * from employees");

            ResultSetMetaData metaData = resultSet.getMetaData();

            System.out.println(metaData.getColumnCount());

            while (resultSet.next()){
            }

            System.out.println("Connection successful");

            connection.close();
            statement.close();
            resultSet.close();


        } catch (SQLException e) {
            System.out.println("Connection failed");
        }
    }

    @Test
    public void declaration(){





    }


}
