package sem4;

public class Circle extends B {
    private double radius;
        Circle(double r) {
        this.radius = r;
        }
   public static void main(String args[]){
   Circle c1=new Circle(2);
   System.out.println("Area "+c1.getArea());
   B b1=new B(2, 2);
   System.out.println("Area "+b1.getArea());
   }
   
    public double getRadius() {
    return radius;
    }
   public double getArea() {
   return radius * radius * Math.PI;
    }
   }
   class B{
   private double length;
   B(double radius, double length) {
    this.length = length;
   }
   public double getArea() {
   return (getArea() * length);
   }
    }
   
