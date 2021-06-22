import java.util.Scanner;

class practise_prgm8 {
           public static void main(String args[]) {
        
           Scanner sc = new Scanner(System.in);
           double principle , rate , time , CI , X ;
           System.out.println(" enter principle amount : ");
           principle = sc.nextDouble();
           System.out.println(" enter rate of interest : ");
           rate = sc.nextDouble();
           System.out.println(" enter time in years: ");
           time = sc.nextDouble();
           X = principle * ( Math.pow(( 1 + rate / 100 ) , time));
           CI = X - principle;
           System.out.println("Compound Interest is : " + CI);
}
}
