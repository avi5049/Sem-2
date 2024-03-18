import java.util.Scanner;

public class Prime {

    public static void main(String[]args){

        Scanner prime = new Scanner(System.in);

        System.out.println("Enter any number:");
        int a = prime.nextInt();

        int i=2;
        int c=0;
        while(i<(a/2)){
            if(a%i==0){
                c++;    
            }
            i++;
        }
        if(c==0){
            System.out.println("Number is Prime");
        }
        
        else{
            System.out.println("Number is not prime.");
        }
    
    }
    
}
