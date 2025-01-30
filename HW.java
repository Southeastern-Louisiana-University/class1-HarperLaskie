// Harper Laskie
// CMPS 2800

import java.util.Scanner;

public class HW
        {
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number grade (0-100):  ");
    int grade = input.nextInt();
    String letter;

    if (grade >= 90) {
        letter = "A";
    }
    else if (grade >= 80) {
        letter = "B";
    }
    else if (grade >= 70) {
        letter = "C";
    }
    else if (grade >= 60) {
        letter = "D";
    }
    else {
        letter = "F";
    }

    System.out.println("Your letter grade is: " + letter);
    }
}
