package ru.shmorin.lab5;
import ru.shmorin.lab5.interfaces.*;
public class Line extends EquationOfHyperplane {
      private double c;
      public Line(double a, double b, double c){ // первый конструктор
   	      setName("Прямая");
		  setA(a);
		  setB(b);
		  this.c=c;
      }
   
      @Override
      public int dimension(){
		  return 2;
      }
    
      @Override
      public String toString(){
		  return "id="+getId()+", "+getName() +",  уравнение: "+getA()+"x+"+getB()+"y+"+c+"=0"+", размерность="+this.dimension();
      }
      @Override//реализация метода симметрии
     public void doSymmetry(){
        this.setA(-this.getA());
        c=-c;
     }

    @Override//реализация метода переноса
    public void doTranslation(Vector v) {
      double yx0=(-this.c-this.getA()*v.getX())/this.getB();
      double deltaY=v.getY()-yx0;
      this.c-=deltaY;
    }

}
