package areaCalculate;

public class AreaCalculator {
    public static void main(String[] args) {
        int len_wid = 50;
        int height = 60;
        int side = 60;
        AreaCalculator Triangle = new AreaCalculator();
        int TriangleArea = Triangle.TriangleAreaCalculator(side, height);

        AreaCalculator Square = new AreaCalculator();
        int SquareArea = Square.SquareAreaCalculator(side);

        AreaCalculator Rectangle = new AreaCalculator();
        int RectangleArea = Rectangle.RectangleAreaCalculator(len_wid, height);
        System.out.println("Triangle area is: "+TriangleArea);
        System.out.println("Square area is: "+SquareArea);
        System.out.println("Rectangle area is: "+RectangleArea);

    }

    private int TriangleAreaCalculator(int base, int height){
        int Triangle = (base*height)/2;
        return Triangle;
    }
    private int SquareAreaCalculator(int side){
        int Square = side*side;
        return Square;
    }
    private int RectangleAreaCalculator(int height, int width){
        int Rectangle = width*height;
        return Rectangle;
    }
}
