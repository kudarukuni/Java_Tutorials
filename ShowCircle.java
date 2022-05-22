//JEAN MUJURU R183432H

class Circle{
   	private double radius;
   	private String color;
   	
   	public Circle(){
    	radius = 4.5;
    	color = "green";
   	}
   
  	public Circle(double r){
      radius = r;
      color = "red";
   	}
   	
   	public double getRadius(){
    	return radius; 
   	}
   
   	public double getArea(){
    	return 3.14*radius*radius;
   }
}

public class ShowCircle{
	public static void main(String[] args){
    Circle obj = new Circle();
    Circle obj2 = new Circle(2.0);
    System.out.println("The circle has radius of " + obj.getRadius() + " and area of " + obj.getArea());
    System.out.println("The circle has radius of " + obj2.getRadius() + " and area of " + obj2.getArea());
   }
}