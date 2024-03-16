import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle: ");
        int r = sc.nextInt();

        System.out.println("Area of circle is");
        System.out.println(Math.PI*r*r);
    }
    
}
