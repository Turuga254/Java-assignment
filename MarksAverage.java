mport java.util.Scanner;

public class MarksAverage {
    public void computeAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Java Programming: ");
        int java = sc.nextInt();
        System.out.print("Enter marks for Networking: ");
        int net = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        double avg = (java + net + maths) / 3.0;

        System.out.println("marks for java programming is: " + java);
        System.out.println("marks for networking is: " + net);
        System.out.println("marks for maths is: " + maths);
        System.out.println("the average is: " + avg);
    }
}
