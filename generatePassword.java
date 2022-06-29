import java.util.*;
import java.util.Scanner;

public class generatePassword{
//public static int length;
static Scanner input= new Scanner(System.in);

    public static void main(String[]args){
        int Numbers;
        int answer;
        int length;
        System.out.println(" Enter the number");
        
        Scanner scan = new Scanner(System.in);
        length = Scanner.nextInt();
        
        String CapitalCaseLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String LowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
        String SpecialCharacters ="@#$";

        String CombinedChar = CapitalCaseLetter + LowerCaseLetter +SpecialCharacters + Numbers;
        Random rand = new Random(); // generate random numbers.
        
        answer = rand.nextInt(8);
        char[] password = new char[length];
        password[0] = LowerCaseLetter.charAt(rand.nextInt(LowerCaseLetter.length()));
        password[1] = CapitalCaseLetter.charAt(rand.nextInt(CapitalCaseLetter.length()));
        password[2] = SpecialCharacters.charAt(rand.nextInt(SpecialCharacters.length()));
        password[3] = SpecialCharacters.charAt(rand.nextInt(SpecialCharacters.length()));

        for(int i = 1;i<length;i++);
        {
            password[i]= CombinedChar.charAt(rand.nextInt(CombinedChar.length()));
        }
        System.out.println(password);
      
    }
}