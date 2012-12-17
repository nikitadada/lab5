package ru.shmorin.lab5;
import ru.shmorin.lab5.interfaces.*;
public class Plane extends EquationOfHyperplane {
    private double c;
    private double d;
    public Plane(double a, double b, double c, double d){
		setA(a);
		setB(b);
		this.c=c;
		this.d=d;
		setName("Плоскость");
	} 
	 @Override
    public int dimension(){
		return 3;
    }
             
     @Override
    public String toString(){
		return "id="+getId()+", "+getName() +",  уравнение: "+getA()+"x+"+getB()+"y+"+c+"z+"+d+"=0, "+" размерность="+this.dimension();

    }
      @Override
     public void doSymmetry(){
        this.c=-this.c;
     }
      @Override
     public void doTranslation(Vector v){
          double zx0y0=(-this.d-this.getA()*v.getX()-this.getB()*v.getY())/this.c;
          double deltaZ=v.getZ()-zx0y0;
          this.d+=deltaZ;
      }
}
