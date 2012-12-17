package ru.shmorin.lab5;
import ru.shmorin.lab5.interfaces.*;
public class DimensionalPlane extends EquationOfHyperplane {
    private double c;
    private double d;
    private double f;
    public DimensionalPlane(double a, double b, double c, double d, double e){
	setA(a);
	setB(b);
	this.c=c;
	this.d=d;
	f=e;
        setName("3D_плоскость");
    } 
	@Override
    public int dimension(){
        return 4;
    }
    
        @Override
    public String toString(){
        return "id="+getId()+", "+getName() +",  уравнение: "+getA()+"x+"+getB()+"y+"+c+"z+"+d+"f+"+f+"=0, "+" размерность="+this.dimension();
    } 
        @Override
    public void doSymmetry(){
    d=-d; 
    }

        @Override
    public void doTranslation(Vector v) {
        double fx0y0z0=(this.getA()*v.getX()+this.getB()*v.getY()+c+v.getZ()+f)/d;
        double deltaF=v.getF()-fx0y0z0;
        f+=deltaF;
    }
}
