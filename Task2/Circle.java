package Task2;
/**
 *
 * @author muhammad hanif
 */
public class Circle extends Shape{
    private double radius;

    
    public Circle(){
        radius = 1.0;
    }
    
    
    public Circle (double radius){
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
     public void setRadius(double radius) {
        this.radius = radius;
    }
     
    public double getArea(){
        return (Math.PI * radius * radius);
    }
    
    public double  getPerimeter(){
        return (2 * Math.PI * radius);
    } 
    
    @Override
   public String toString() {
       String filled = super.isFilled() ? "Filled" : "Not Filled";
        return "A Shape with color of " + color+ " and "+filled;
    }
}
