import java.util.Scanner;


public class Calculate {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String time = reader.next();
        Time calculate = new Time(time);
        calculate.showTime();


    }
}
