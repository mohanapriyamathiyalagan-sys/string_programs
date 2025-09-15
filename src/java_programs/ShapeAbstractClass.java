package java_programs;

public abstract class ShapeAbstractClass {
   public abstract void draw();

   public void message(){
       System.out.println("Drawing shape");
   }

   public static class Circle extends ShapeAbstractClass{

       @Override
       public void draw() {
           System.out.println("Circle drawing");
       }
   }

}
