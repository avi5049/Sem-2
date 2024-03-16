import java.util.Scanner;

public class Arithmetic_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number 1 :");
        int a = sc.nextInt();

        System.out.println("Enter any number 2 :");
        int b = sc.nextInt();

        System.out.println("Enter the arithmetic Operation");
        char ch = sc.next().charAt(0);

        switch(ch){
        case('+'):{
            System.out.println(a+b);
            break;
        }
        case('-'):{
            System.out.println(a-b);
            break;
        }
        case('*'):{
            System.out.println(a*b);
            break;
        }
        case('/'):{
            System.out.println(a/b);
            break;
        }
        default:{
            System.out.println("Enter valid Arithmetic Operation");
        }
    }
sc.close();
    }
}
