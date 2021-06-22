import java.util.Scanner;

class practise_prgm9 {
           public static void main(String args[]) {
        
           Scanner sc = new Scanner(System.in);
           double principle , rate , time , SI ;
           System.out.println(" enter principle amount : ");
           principle = sc.nextDouble();
           System.out.println(" enter rate of interest : ");
           rate = sc.nextDouble();
           System.out.println(" enter time in years: ");
           time = sc.nextDouble();
           SI = (principle * rate * time )/ 100 ;
           System.out.println("Simple Interest is : " + SI);
}
}
