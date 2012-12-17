package ru.shmorin.lab5;
import ru.shmorin.lab5.interfaces.*;
import java.util.Comparator;

public class SortMode implements Comparator<EquationOfHyperplane> {
      private boolean sortUp=false;
      private int sortMode=0;  
      public SortMode(boolean sortUp, int sortMode) {
          this.sortUp = sortUp;
          this.sortMode = sortMode;
      }
@Override
public int compare(EquationOfHyperplane p1, EquationOfHyperplane p2) {
int res=0;
if (sortMode==0){
    if (p1.getId()>p2.getId()) res=1;
    else if (p1.getId()<p2.getId()) res=-1;
}
else if (sortMode==1){
     res=p1.getName().compareTo(p2.getName());
}
else {
    if (p1.dimension()>p2.dimension()) res=1;
    else if (p1.dimension()<p2.dimension()) res=-1;
}
if (sortUp) res*=(-1);
return res;
}

}
