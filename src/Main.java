import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//   find angles of triangle if two angles are given
        Scanner scanner = new Scanner(System.in);
        System.out.println("# Question 3");
        System.out.print("Enter the angle A of the triangle: ");
        int angleA = scanner.nextInt();

        System.out.print("Enter the angle C of the triangle: ");
        int angleC = scanner.nextInt();

        int angleB = 180 - (angleA + angleC);

        System.out.println("The angle C is : " + angleB + "\n");

        scanner.close();
        }
    }
