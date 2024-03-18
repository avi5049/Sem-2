import java.util.Scanner;

public class Maxof3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int a[]= new int[3];

        for(int i=0;i<3;i++){
            System.out.println("Enter any number:");
            a[i]= sc.nextInt(); 
            
        }
        int one=a[0];
        int two=a[1];
        int three=a[2];
        if(one>two){
            if(one>three){
            System.out.println(a[0]);
            }
        }
        else if(two>one){
            if(two>three){
               System.out.println(a[1]);
            }
        }
        else{
            System.out.println(a[2]);
        }
    }
    
}
