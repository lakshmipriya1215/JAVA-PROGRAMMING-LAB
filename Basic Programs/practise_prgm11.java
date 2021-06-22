import java.util.Scanner;

class practise_prgm11 {
           public static void main(String args[]) {
        
           Scanner sc = new Scanner(System.in);
           int num, power ;
           System.out.println("enter the  number");
           num = sc.nextInt();
           System.out.println("enter the  power");
           power = sc.nextInt();
           double res = Math.pow(num , power);
           System.out.println("result is : " + res);
}
}
