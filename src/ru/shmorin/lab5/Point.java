package ru.shmorin.lab5;
import ru.shmorin.lab5.interfaces.*;
public class Point extends EquationOfHyperplane {
                 
    public Point(double a, double b){ // первый конструктор
		setA(a);
		setB(b);
		setName("Точка");	
    }
    @Override//реализуется метод симметрии относительно начала координат
    public void doSymmetry(){
    this.setB(-this.getB());
    }
    @Override//реализуется метод смещения
    public void doTranslation(Vector v){
        
      this.setA(v.getX());
    }
    @Override
    public int dimension(){ // метод возвращает размерность пространства
		return 1;
    }

    @Override
    public String toString(){
		return "id="+getId()+", "+getName()+", уравнение: "+getA()+"X+"+getB()+"=0"+", размерность="+this.dimension();
    } 
}
