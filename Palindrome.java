import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter any number:");
        int n = sc.nextInt();

        int num=n;
        int temp=0;
	    while(n>0){
		    temp=(temp*10)+(n%10);
		    n=n/10;	
	    }
	
    	if(temp==num){
	    	System.out.println("Number is Palindrome");
	    }
	
	    else{
		    System.out.println("Number is not pelindrome");
	    }

        char ch = sc.next()charAt();
        char ch2= ch;
        while(charAt>0){
            ch2=str.charAt()
        }

    }
}
