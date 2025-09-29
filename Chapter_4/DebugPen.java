public class DebugPen{
   private String color;
   private String point;
   
   public DebugPen()
   {
      this.color = "black";
      this.point = "fine";
   }
   
      public DebugPen(String color, String point)
      {
         this.color = color;
         this.point = point;
      }
      
      public String getColor()
      {
         return color;
      }
      
      public String getPoint()
      {
         return point;
      }
      
      public static void main(String[] args)
{      
      DebugPen defaultPen = new DebugPen();
         System.out.println("Default Pen -> Color: " + defaultPen.getColor() + ", Point: " + defaultPen.getPoint());
         
}

}
