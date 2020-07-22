package designpatters.STructural;

interface Shape {
	   void draw();
	}

class Rectangle implements Shape {

	   public void draw() {
	      System.out.println("Shape: Rectangle");
	   }
	}
class Circle implements Shape {

	
	public void draw() {
	      System.out.println("Shape: Circle");
	   }
	}

abstract class ShapeDecorator implements Shape {
	   protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	
	}
class BlueShapeDecorator extends ShapeDecorator {

	   public BlueShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      fillBlue(decoratedShape);
	   }

	   private void fillBlue(Shape decoratedShape){
	      System.out.println("Shape Color: Blue");
	   }
}
class Decorator {
	   public static void main(String[] args) {

		      Shape circle = new Circle();

		      Shape BlueCircle = new BlueShapeDecorator(new Circle());

		      Shape BlueRectangle = new BlueShapeDecorator(new Rectangle());
		      System.out.println("Circle with normal border");
		      circle.draw();

		      System.out.println("\nCircle of blue color ");
		     BlueCircle.draw();

		      System.out.println("\nRectangle of blue color");
		      BlueRectangle.draw();
		   }
		}
	
	
	
	


