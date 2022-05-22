// JEAN MUJURU R183432H


class Shape{
    public static String doPrint(){
        return "This is a shape";
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(){
        length = 8;
        width = 6;
    }
    public static String doPrint(){
        return "This is a rectangular shape";
    }
    public double getPerimeter(){
        return length + width + length + width;
    }
    public double getArea(){
        return length * width;
    }
    class Square{
        public String doPrint(){
            return "Square is a rectangle";
        }
        public double getArea(){
            return length * length;
        }
    }
} 
class Circle extends Shape{
    double radius;
    Circle(){
        radius = 4.5;
    }
    public static String doPrint(){
        return "This is a circular shape";
    }
    public double getArea(){
        return 3.14 * radius*radius;
    }
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
}

public class Question1{
    public static void main(String[] args){

        Rectangle recObj = new Rectangle();
        Circle cirObj = new Circle();
        Rectangle.Square squObj = recObj.new Square();

        System.out.println(recObj.doPrint());
        System.out.println(recObj.getArea());
        System.out.println(recObj.getPerimeter());

        System.out.println(cirObj.doPrint());
        System.out.println(cirObj.getArea());
        System.out.println(cirObj.getPerimeter());

        System.out.println(squObj.doPrint());
        System.out.println(squObj.getArea());
    }
}