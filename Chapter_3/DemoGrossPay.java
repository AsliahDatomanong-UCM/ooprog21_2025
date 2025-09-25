public class DemoGrossPay{
   public static final double HR = 22.75;
   
   public static void main(String[] args){
   calculateGross(10.0);
   calculateGross(25.0);
   calculateGross(37.5);
   }
   
   public static void calculateGross(double hours) {
      double gross = hours * HR;
      System.out.println(hours + " hours at " + HR + " per hour is $" + gross);
   }
}