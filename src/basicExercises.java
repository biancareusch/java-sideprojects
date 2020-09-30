import java.util.Scanner;
import java.lang.Math;

public class basicExercises {
    public static void main(String[] args) {
//        W3 Java Basic Programming Exercises
//
        // 1
        System.out.print("Hello");
        System.out.print("\nBianca Reusch");

        //2
        int sum = 74 + 36;
        System.out.print("\n" + sum);

        //3
        int division = 50/3;
        System.out.print("\n" + division);

        //4
        int first = -5 + 8 * 6;
        System.out.print("\n" + first);
        int second = (55 + 9) % 9;
        System.out.print("\n" + second);
        int third = 20 + 3 * 5 / 8;
        System.out.print("\n" + third);
        int fourth = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.print("\n" + fourth);

        //5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("\nThis program will let you input two numbers and return the product of these numbers");
//        System.out.print("\n First number: ");
//        int firstPro = sc.nextInt();
//        System.out.print("\n Second number: ");
//        int secondPro = sc.nextInt();
//        int product = firstPro * secondPro;
//        System.out.format("\n" + firstPro + " x " + secondPro + " = " + product );

        //6
//        Scanner scan = new Scanner(System.in);
//        System.out.print("\nThis program will let you input two numbers and add, subtract, multiply, divide and give you the remainder of these numbers");
//        System.out.print("\n First number: ");
//        int firstNum = scan.nextInt();
//        System.out.print("\n Second number: ");
//        int secondNum = scan.nextInt();
//        int addition = firstNum + secondNum;
//        System.out.format("\n" + firstNum + " + " + secondNum + " = " + addition);
//        int subtraction = firstNum - secondNum;
//        System.out.format("\n" + firstNum + " - " + secondNum + " = " + subtraction);
//        int productNum = firstNum * secondNum;
//        System.out.format("\n" + firstNum + " x " + secondNum + " = " + productNum );
//        int divisionNum = firstNum / secondNum;
//        System.out.format("\n" + firstNum + " / " + secondNum + " = " + divisionNum);
//        int remainder = firstNum % secondNum;
//        System.out.format("\n" + firstNum + " mod " + secondNum + " = " + subtraction);

        //7
//        Scanner multiplier = new Scanner(System.in);
//        System.out.println("\nThis programm will take in a number and give you its multiplication table up to 10");
//        System.out.println("Input your number here: ");
//        int multiplierNum = multiplier.nextInt();
//        for(int i = 0; i < 11;i++){
//            System.out.format("\n" + multiplierNum + " x " + i +" = " + (multiplierNum * i));
//        }

        //8
//        System.out.print("\n");
//        System.out.println("     J       a       v       v       a");
//        System.out.println("     J     a   a      v     v      a   a");
//        System.out.println("J    J    aaaaaaa      v   v      aaaaaaa");
//        System.out.println(" JJJJ    a       a       V       a       a");

        //9
//        double express = ((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5));
//        System.out.print("\n" + express);
//
//        //10
//        double specific = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        System.out.format("\n" + specific);

        //11
//        double pi = 3.14159;
//        double radius = 7.5;
//        double perimeter = 2 * pi * radius;
//        double area = pi * Math.pow(radius,2) ;
//        System.out.format("\n\nArea: " + area + "\nPerimeter: " + perimeter);

        //12
//        Scanner averageSC = new Scanner(System.in);
//        System.out.println("\n\nThis program will take in three number and print out the average.");
//        System.out.println(" Number one: ");
//        int numberOne = averageSC.nextInt();
//        System.out.println(" Number two: ");
//        int numberTwo = averageSC.nextInt();
//        System.out.println(" Number three: ");
//        int numberThree = averageSC.nextInt();
//        int average = (numberOne + numberTwo + numberThree) / 3;
//        System.out.println("Here's your average: " + average);

        //15
//        int a, b, temp;
//        a = 50;
//        b = 10;
//        System.out.println("\n Before swapping variables: a,b = " + a + "," + b);
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println(" After swapping variables: a,b = " + a + "," + b);

        //16 Add binary numbers
        long binary1, binary2;
        int i = 0;
        int remain = 0;
        //declare Array with int[], new int [20] declares array length
        int[] sumArray = new int [20];

        //get input
//        Scanner in = new Scanner(System.in);
//        System.out.print("\n\nThis program will print the sum of two binary numbers");
//        System.out.print("\nInput first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input second binary number: ");
//        binary2 = in.nextLong();
//
//        //example binary1: 0000101
//        //example binary2: 0001001
//
//        while(binary1 != 0 || binary2 != 0){
//            //narrowing casting to (int) binaries lose their leading zero's so binary1 = 101, binary2 = 1001
//            //sum array indexof 1=(101 %10 = 1  + (1001 %10=)1 +  0)    % 2 = 0
//            sumArray[i++] = (int)((binary1 % 10 + binary2 % 10 + remain)% 2);
//            System.out.print("\nsumArray index" + sumArray[i]);
//            //remain =    ((101 %10 =) 1 + (1001 %10=)1 +  0      / 2 = 1
//            remain = (int)((binary1 % 10 + binary2 % 10 + remain) / 2);
//            binary1 = binary1 /10;
//            binary2 = binary2 / 10;
//        }
////
//        if(remain != 0){
//            sumArray[i++] = remain;
//            System.out.print(remain);
//        }
//        --i;
//
//        System.out.print("Sum of two binary numbers: ");
//        while(i >= 0){
//            System.out.print(sumArray[i--]);
//        }
//        System.out.print('\n');

        //other solution:
        String b1, b2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st binary number: ") ;
        b1 = scanner.next();
        System.out.print("Enter 2nd binary number: ") ;
        b2 = scanner.next();
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);
        int sumUp = n1 + n2;
        String result = Integer.toBinaryString(sumUp);
        System.out.println("Sum of two binary numbers: " + result);



        //32
        Scanner scan = new Scanner(System.in);
        System.out.print("\nThis program will take in two numbers and compare them");
        System.out.print("\nFirst number: ");
        int compare1 = scan.nextInt();
        System.out.print("\nSecond number: ");
        int compare2 = scan.nextInt();
        if(compare1 < compare2){
            System.out.print("\n" + compare1 + " < " + compare2);
        }
        if(compare1 <= compare2){
            System.out.print("\n" + compare1 + " <= " + compare2);
        }
        if(compare1 > compare2){
            System.out.print("\n" + compare1 + " > " + compare2);
        }
        if(compare1 >= compare2){
            System.out.print("\n" + compare1 + " >= " + compare2);
        }
        if(compare1 == compare2){
            System.out.print("\n" + compare1 + " = " + compare2);
        }
        if(compare1 != compare2){
            System.out.print("\n" + compare1 + " != " + compare2);
        }
    }
}