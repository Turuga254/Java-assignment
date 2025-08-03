package java_methods;

import java.util.Scanner;

public class Methods {
    public static void findLargestAndSmallest() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int largest = num1;
        int smallest = num1;

        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " smallest number.");
    }

    public static void main(String[] args) {
        findLargestAndSmallest();
    }
}
