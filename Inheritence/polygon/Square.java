package Inheritence.polygon;

/**
 * Created by krishna KC on 11/18/2016.
 */
public class Square extends Rectangle {
    public void area() {
        System.out.println("Area = " + (length * length));
    }
    public void perimeter(){
        System.out.println("Peri= "+(4*length));
    }
}

