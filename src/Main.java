import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);

//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//        String message = "hello world";
//        System.out.println(message.replace('e','f'));
//        //parameters - oldChar, newChar / arguments - 'e', 'f'
//        System.out.println(message); //Strings are immutable; any methods that modify a string returns a new string

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers));
//        //OR
//        int[] numbers1 = { 2, 3, 5, 1, 4 };
//        Arrays.sort(numbers1);
//        System.out.println(Arrays.toString(numbers1));

//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        System.out.println(Arrays.deepToString(numbers));
//        //OR
//        int[][] numbers1 = { { 1, 2, 3}, { 4, 5, 6} };
//        System.out.println(Arrays.deepToString(numbers1));

//        // Implicit casting
//        // byte > short > int > long > float > double
//        short x = 1;
//        int y = 2;
//        int result = x + y;
//        System.out.println(result);
//        // Explicit casting
//        int a = 2;
//        long b = 4;
//        int result = a + (int)b;
//        System.out.println(result);

        // round, ceil, floor, max, min, random
//        int result = Math.round(1.1f);
//        System.out.println(result);
//        int rand = (int) Math.round(Math.random() * 100);
//        System.out.println(rand);

        // Formatting numbers
        // (abstract classes cannot be instantiated) -> NumberFormat currency = new NumberFormat()
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
//        System.out.println(result);

//        Scanner scanner = new Scanner(System.in);
//        byte age = scanner.nextByte();
//        System.out.println("You're " + age); //Implicit conversion of age

//        // Building a mortgage calculator (my attempt)
//        Scanner scanner = new Scanner(System.in);
//        String principal = scanner.nextLine();
//        Scanner scanner1 = new Scanner(System.in);
//        String interestRate = scanner1.nextLine();
//        Scanner scanner2 = new Scanner(System.in);
//        String period = scanner2.nextLine();
//
//        int mortgage = (float)principal * (float)interestRate * Math.pow((1+interestRate), period * 12) / (Math.pow((1+interestRate), period * 12) - 1);
//                System.out.println("Mortgage: " + mortgage);

//        // Building a mortgage calculator (solution)
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Principal: ");
//        int principal = scanner.nextInt();
//
//        System.out.println("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.println("Period (Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);

//        //Logical operators
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecords = true;
//        System.out.println((hasHighIncome || hasGoodCredit) && !hasCriminalRecords);

//        //If statements
//        int temp = 32;
//        if (temp > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        }
//        else if (temp > 20)
//            System.out.println("Beautiful day");
//        else
//            System.out.println("Cold day");

//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);

//        //FizzBuzz
//        System.out.println("What?: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0 && number % 3 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (number % 5 == 0) {
//            System.out.println("Buzz");
//        } else if (number % 3 == 0) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println(number);
//        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        }



    }
}