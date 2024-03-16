import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius: ");
        double cel= sc.nextDouble();
        double fer=((5/9.0)*cel)+32.0;
        System.out.println("Temperature in Farenheit:");
        System.out.println(fer);
    }
    
}
