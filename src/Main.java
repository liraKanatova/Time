import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int san1 = scanner.nextInt();
        int san2= scanner.nextInt();
        int san3= scanner.nextInt();
      Time time=new Time(san1,san2,san3);
      time.nextSecond();
        System.out.println(time);
        time.previousSecond();
        System.out.println(time);
    }
}