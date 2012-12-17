//Выполнил студент группы ИВТ-01 Шморин Никита
package ru.shmorin.lab5.main;
import ru.shmorin.lab5.*;
import ru.shmorin.lab5.interfaces.*;
import java.io.*;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Lab5 {
 
    private static ArrayList<EquationOfHyperplane> list;//типизация списка
    
    private static void init(){ // создание и заполнение списка
        list=new ArrayList<>();
        list.add(new Point(3,4));
        list.add(new Point(5,2));
        list.add(new Line(3,4,3));
        list.add(new Plane(5,4,3,6));
        //list.add(new DimensionalPlane(2,8,4,6,2));
        //list.add(new DimensionalPlane(2,4,6,6,1));
        //list.add(new DimensionalPlane(1,8,4,2,2));
        list.add(new Plane(1,4,1,4));
        list.add(new Line(1,7,2));
        list.add(new Line(5,2,3));
        list.add(new Point(6,7));
    }
    
    
public static void main(String[] args)throws IOException   {
  init();
  // подготовка к вводу
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  //далее идет реализация "интерфейса"
  for(;;){ // начинаем бесконечный цикл
        System.out.println();
        System.out.println("Выберите тип сортировки (выйти - пустая строка):");
        System.out.println("--------------------------------------------------");
        System.out.println("1 - по возраcтанию id");
        System.out.println("2 - по убыванию id");
        System.out.println("3 - по возраcтанию имени");
        System.out.println("4 - по убыванию имени");
        System.out.println("5 - по возрастанию размерности пространства");
        System.out.println("6 - по убыванию размерности пространства");
        System.out.println("7 - добавить объект");
        System.out.println("8 - выполнить симметрию");
        System.out.println("9 - выполнить перенос в точку");
        System.out.println("--------------------------------------------------");

        String mode = br.readLine(); // читаем строку из буфера ввода
        if (mode.isEmpty()) break; // прерываем цикл, если строка пустая
        boolean sortUp=false;
        int sortMode=0;
        switch(mode){
                case "1":{sortUp=false; sortMode=0; break;}
                case "2":{sortUp=true; sortMode=0; break;}
                case "3":{sortUp=false; sortMode=1; break;}
                case "4":{sortUp=true; sortMode=1; break;}
                case "5":{sortUp=false; sortMode=2; break;}
                case "6":{sortUp=true; sortMode=2; break;}
                case "7":{  System.out.println("1 - Точка");
                            System.out.println("2 - Прямая");
                            System.out.println("3 - Плоскость");
                            System.out.println("4 - 3D_плоскость");
                            mode = br.readLine();
                            switch(mode){
                                case "1":{ System.out.println("\nВведите первый коэффициент ур-я:");
                                           Scanner sc = new Scanner(System.in);
                                           double x=0;
                                           if(sc.hasNextDouble()) 
                                           x = sc.nextDouble(); 
                                           System.out.println("\nВведите второй коэффициент ур-я:");
                                           double y=0;
                                           if(sc.hasNextDouble()) 
                                           y = sc.nextDouble();                                            
                                           list.add(new Point(x,y));
                                           System.out.println("\nОбъект добавлен!");
                                           break;
                                }
                                case "2":{System.out.println("\nВведите первый коэффициент ур-я:");
                                           Scanner sc = new Scanner(System.in);
                                           double x=0;
                                           if(sc.hasNextDouble()) 
                                           x = sc.nextDouble(); 
                                           System.out.println("\nВведите второй коэффициент ур-я:");
                                           double y=0;
                                           if(sc.hasNextDouble()) 
                                           y = sc.nextDouble(); 
                                           System.out.println("\nВведите третий коэффициент ур-я:");
                                           double z=0;
                                           if(sc.hasNextDouble()) 
                                           z = sc.nextDouble();
                                           list.add(new Line(x,y,z));
                                           System.out.println("\nОбъект добавлен!");
                                           break;
                                }
                                case "3":{System.out.println("\nВведите первый коэффициент ур-я:");
                                           Scanner sc = new Scanner(System.in);
                                           double x=0;
                                           if(sc.hasNextDouble()) 
                                           x = sc.nextDouble(); 
                                           System.out.println("\nВведите второй коэффициент ур-я:");
                                           double y=0;
                                           if(sc.hasNextDouble()) 
                                           y = sc.nextDouble();
                                           System.out.println("\nВведите третий коэффициент ур-я:");
                                           double z=0;
                                           if(sc.hasNextDouble()) 
                                           z = sc.nextDouble();
                                           System.out.println("\nВведите четвертый коэффициент ур-я:");
                                           double f=0;
                                           if(sc.hasNextDouble()) 
                                           f = sc.nextDouble();
                                           list.add(new Plane(x,y,z,f));
                                           System.out.println("\nОбъект добавлен!");
                                           break;    
                                }
                                case "4":{System.out.println("\nВведите первый коэффициент ур-я:");
                                           Scanner sc = new Scanner(System.in);
                                           double x=0;
                                           if(sc.hasNextDouble()) 
                                           x = sc.nextDouble(); 
                                           System.out.println("\nВведите второй коэффициент ур-я:");
                                           double y=0;
                                           if(sc.hasNextDouble()) 
                                           y = sc.nextDouble(); 
                                           System.out.println("\nВведите третий коэффициент ур-я:");
                                           double z=0;
                                           if(sc.hasNextDouble()) 
                                           z = sc.nextDouble();
                                           System.out.println("\nВведите четвертый коэффициент ур-я:");
                                           double f=0;
                                           if(sc.hasNextDouble()) 
                                           f = sc.nextDouble();
                                           System.out.println("\nВведите пятый коэффициент ур-я:");
                                           double e=0;
                                           if(sc.hasNextDouble()) 
                                           e = sc.nextDouble();
                                           list.add(new DimensionalPlane(x,y,z,f,e));
                                           System.out.println("\nОбъект добавлен!");
                                           break;
                                }
                           
                           }                            
             break;}
                        case "8":{System.out.println("\nВведите id объекта:");
                                  Scanner sc = new Scanner(System.in);
                                  int x = sc.nextInt(); 
                                  list.get(x-1).doSymmetry();
                                   break;
                        }
                        case "9":{System.out.println("\nВведите id объекта,который нужно перенести:");
                                  Scanner sc = new Scanner(System.in);
                                  int id = sc.nextInt();
                                  int dm=list.get(id-1).dimension();//получаем размерность объекта
                                  switch(dm){
                                      case 1:{System.out.println("\nВведите координату X новой точки:");                                    
                                               int x = sc.nextInt();
                                               Vector v=new Vector(x);
                                               list.get(id-1).doTranslation(v);
                                               break;
                                      }
                                      case 2:{System.out.println("\nВведите координату X новой точки:");                                    
                                               int x = sc.nextInt();
                                               System.out.println("\nВведите координату Y новой точки:");                                    
                                               int y = sc.nextInt();
                                               Vector v=new Vector(x,y);
                                               list.get(id-1).doTranslation(v);
                                               break;
                                      }
                                      case 3:{System.out.println("\nВведите координату X новой точки:");                                    
                                               int x = sc.nextInt();
                                               System.out.println("\nВведите координату Y новой точки:");                                    
                                               int y = sc.nextInt();
                                               System.out.println("\nВведите координату Z новой точки:");                                    
                                               int z = sc.nextInt();
                                               Vector v=new Vector(x,y,z);
                                               list.get(id-1).doTranslation(v);
                                               break;
                                          
                                      }
                                      case 4:{System.out.println("\nВведите координату X новой точки:");                                    
                                               int x = sc.nextInt();
                                               System.out.println("\nВведите координату Y новой точки:");                                    
                                               int y = sc.nextInt();
                                               System.out.println("\nВведите координату Z новой точки:");                                    
                                               int z = sc.nextInt();
                                               System.out.println("\nВведите координату F новой точки:");                                    
                                               int f = sc.nextInt();
                                               Vector v=new Vector(x,y,z,f);
                                               list.get(id-1).doTranslation(v);
                                               break;
                                          
                                      }
                                  }
                        }
        }
        Collections.sort(list,new SortMode(sortUp,sortMode));
        for(EquationOfHyperplane p:list){
            System.out.println(p);
        }
  
}
}
}
