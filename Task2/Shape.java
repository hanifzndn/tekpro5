package Task2;
/**
 *
 * @author muhammad hanif
 */
public class Shape {
    String color;
    private boolean filled;
    private boolean isFilled;

    public Shape(){
        color = "red";
        filled = true;
    }
    
    public Shape (String color, boolean filled ){
        this.color = color;
        this.filled = filled;
    }
     public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
     public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    
    @Override
    public String toString(){
        return "Shape[color= " + color + " filled=" + filled + "]";
    }
    
}

