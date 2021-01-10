import java.util.Scanner;

public class cdtt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("");
        float rate= 23000;
        float USD = scanner.nextFloat();
        float vietnam = USD*rate;
        System.out.println(vietnam);

    }
}
