
package ru.shmorin.lab5;
import ru.shmorin.lab5.interfaces.*;
/**вспомогательный клаас. Он описывает точку в которую мы переносим объект!*/
public class Vector {
   private double x=0,y=0,z=0,f=0; 

    public Vector(double x, double y, double z, double f) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.f = f;
    }

    public Vector(double x) {
        this.x=x;
    }

    public Vector(double x, double y) {
        this.x=x;
        this.y=y;
    }
    
    public Vector(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getF() {
        return f;
    }
  
}
