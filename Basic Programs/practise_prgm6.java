import java.util.Scanner;

class practise_prgm6 {
           public static void main(String args[]) {
        
           Scanner sc = new Scanner(System.in);
           int num;
           System.out.println("enter the year :");
           num = sc.nextInt();
           if( num % 4 == 0)
           	System.out.println(num + " is a leap year ");
   	   else
		System.out.println(num + " is not a leap year ");
}
}
