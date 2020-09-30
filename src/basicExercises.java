import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        System.out.print("\nThis program will let you input two numbers and add, subtract, multiply, divide and give you the remainder of these numbers");
        System.out.print("\n First number: ");
        int firstNum = scan.nextInt();
        System.out.print("\n Second number: ");
        int secondNum = scan.nextInt();
        int addition = firstNum + secondNum;
        System.out.format("\n" + firstNum + " + " + secondNum + " = " + addition);
        int subtraction = firstNum - secondNum;
        System.out.format("\n" + firstNum + " - " + secondNum + " = " + subtraction);
        int productNum = firstNum * secondNum;
        System.out.format("\n" + firstNum + " x " + secondNum + " = " + productNum );
        int divisionNum = firstNum / secondNum;
        System.out.format("\n" + firstNum + " / " + secondNum + " = " + divisionNum);
        int remainder = firstNum % secondNum;
        System.out.format("\n" + firstNum + " mod " + secondNum + " = " + subtraction);

        //7
        Scanner multiplier = new Scanner(System.in);
        System.out.print("\nThis programm will take in a number and give you its multiplication table up to 10");
        System.out.print("\nInput your number here: ");
        int multiplierNum = multiplier.nextInt();
        for(int i = 0; i < 11;i++){
            System.out.format("\n" + multiplierNum + " x " + i +" = " + (multiplierNum * i));
        }

    }
}