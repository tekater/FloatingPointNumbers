import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);

        float f = 0.0f;
        double d = 0.0f;

        /*float input = scanner.nextFloat();
        double input1 = scanner.nextDouble();
        double input2 = (double) scanner.nextInt();*/
        //double input3 = Double.parseDouble(scanner.nextLine()); // 100.0 (с точкой) работает в Locale.US

        double input3 = scanner.nextDouble(); // 100,0 (с запятой) работает в Locale.France напрямую через nextDouble

        System.out.println(input3);


    }
}