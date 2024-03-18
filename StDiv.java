import java.util.Scanner;

public class StDiv{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int marks [] = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter the marks of subject:");
            marks[i] = sc.nextInt();
            sum+= marks[i];
        }

        double per=(sum/5.0)*100;

        if(per>=60){
            System.out.println("First Division");
        }
        else if(per>50){
            System.out.println("Second Division");
        }
        else if(per>40){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }
}

   

