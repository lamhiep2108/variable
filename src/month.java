import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print(" tháng ");
            int month = scanner.nextInt();

            switch (month) {
                case 2:
                    System.out.println("tháng "+month+" có 28 hoặc 29 ngày");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println( month + "có 31 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.print( + month + " có 30 days!");
                    break;
                default:
                    System.out.println("invalid input");

            }
        }while (true);
    }
}
