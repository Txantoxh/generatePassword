import java.util.*;
import java.util.Scanner;

public class generatePassword{
    public static void main(String[]args){
        //int answer;
        int length;
        System.out.println(" Enter the two digits numbers");
        
        
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        
        String CapitalCaseLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String LowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
        String SpecialCharacters ="@#$";
        String Numbers ="1234567890";

        String CombinedChar = CapitalCaseLetter + LowerCaseLetter +SpecialCharacters + Numbers;
        Random rand = new Random(); // generate random numbers.
        
        //answer = rand.nextInt(8);
        char[] password = new char[length];

        password[0] = LowerCaseLetter.charAt(rand.nextInt(LowerCaseLetter.length()));
        password[1] = CapitalCaseLetter.charAt(rand.nextInt(CapitalCaseLetter.length()));
        password[2] = SpecialCharacters.charAt(rand.nextInt(SpecialCharacters.length()));
        password[3] = Numbers.charAt(rand.nextInt(Numbers.length()));

        for(int i = 0;i<length;i++)
        {
        password[i]= CombinedChar.charAt(rand.nextInt(CombinedChar.length()));
        }
        System.out.println(password);
      
    }
}