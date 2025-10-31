import java.util.Scanner;

    public class Characterinfo {
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter a character: ");
            char Chara = input.next().charAt(0);
            
            System.out.println("\nThe character is " + Chara);
            
            if (Character.isUpperCase(Chara)){
                System.out.println(Chara + " is uppercase.");
            }else{
                System.out.println(Chara + " is not uppercase.");
            }
            
            if (Character.isLowerCase(Chara)){
                System.out.println(Chara + " is lowercase.");
            }else{
                System.out.println(Chara + " is not lowercase.");
            }
            
            System.out.println("After toLowerCase(), aChar is " + Character.toLowerCase(Chara));
            System.out.println("After toUpperCase(), aChar is " + Character.toUpperCase(Chara));
                
            if (Character.isLetterOrDigit(Chara)){
                System.out.println(Chara + " is a letter or digit.");
            }else{ 
                System.out.println(Chara + " is neither a letter or digit.");
            }
            
            if (Character.isWhitespace(Chara)){
                System.out.println(Chara + " is whitespace.");
            }else{
                System.out.println(Chara + " is not whitespace.");
            }
            
            input.close();
        }
    }