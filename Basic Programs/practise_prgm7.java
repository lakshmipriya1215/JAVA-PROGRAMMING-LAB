import java.io.*;
import java.util.Scanner;
  
public class practise_prgm7 {
    static void Vowel_Or_Consonant(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y =='A' ||   y =='E' ||y =='I'  ||  y =='O'||  y =='U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }
  
    // The Driver code
    static public void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);
        Vowel_Or_Consonant(ch);
    }
}