import java.util.Scanner;

public class CompareStrings{
   public static void main(String[] args){
      String predefinedString = "Carmen";
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String n_1 = scanner.nextLine();
      
      if (n_1.equals(predefinedString)){
         System.out.println(predefinedString + " equals " + n_1);
      } else {
         System.out.println(predefinedString + " does not equal " + n_1);
      
      }
   }
}
