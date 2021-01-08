import java.util.Arrays;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        width = scanner.nextFloat();
        System.out.println("enter ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("area" + area);
    }
}
