import java.util.*;
import java.util.Collection;
 import  java.util.ArrayList;

public class MultidimetionalAarry {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
      mainlist.add(list);
      ArrayList<Integer> list2= new ArrayList<>();
      list2.add(4);
      list2.add(5);
      list2.add(6);

      for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer>currentlist=mainlist.get(i);

        for(int j=0;i<currentlist.size();j++){
            System.out.print(currentlist.get(j));

        }
        System.out.println();
      }

        
    }
}
