import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       do {
           System.out.println("");

           int year = scanner.nextInt();

           if (year % 4 == 0) {
               if (year % 100 == 0) {
                   if (year % 400 == 0) {
                       System.out.printf("%d là năm nhuận ", year);
                   } else {
                       System.out.printf("%d k là năm nhuận ", year);
                   }
               } else {
                   System.out.printf("%d  là năm nhuận ", year);
               }
           } else {
               System.out.printf("%d k là năm nhuận ", year);
           }
       }while (true);
    }
}
