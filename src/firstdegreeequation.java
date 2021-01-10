import java.util.Scanner;

public class firstdegreeequation {
    public static void main(String[] args) {
        System.out.println("linear Equation Resolver");
        System.out.println("Giver o equation as 'a*x+b=0' please enter constant");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextFloat();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("the solution is: %f !", solution);
        }
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("equation pass with %f!/n", answer);
        } else {
            if (b==0) {
                System.out.print("the solution is all x!");
            }else {
                System.out.print("no solution");
            }
        }
    }
}
