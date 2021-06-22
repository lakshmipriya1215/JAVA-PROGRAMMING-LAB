import java.util.Scanner;

class practise_prgm10 {
           public static void main(String args[]) {
        
           Scanner sc = new Scanner(System.in);
           int number , divisor , quo , rem;
           System.out.println("enter the number / dividend :");
           number = sc.nextInt();
	   System.out.println("enter the divisor :");
           divisor = sc.nextInt();
           rem = number % divisor ;
           System.out.println("reminder is :" + rem);
	   quo = number / divisor ;
	   System.out.println("Quotient is :" + quo);
}
}
