package LESSON.lesson3;

import java.util.ArrayList;

public class ArrayListManipulator {
     // private field only can access in the class
    private ArrayList<String> arrayList;

public ArrayListManipulator(){ // constructor
    arrayList = new ArrayList<>();
 }

 public void addElement(String element){ //add value to array
     arrayList.add(element);
 }

 public void removeByElement(String element){ // remove value from array by element 
    arrayList.remove(element);
 }

 public void removeByIndex(int i){ // remove value from array by index
    arrayList.remove(i);
 }

 public void SortArray(){  // Sort array
    arrayList.sort(null);
 }

 public void display(){
    for(String element:this.arrayList){
        System.out.printf("%s",element);
    }
    System.out.println();
 }

 public static void main(String[] args) {
    
    ArrayListManipulator arrayListManipulator = new ArrayListManipulator();
    arrayListManipulator.addElement(" Hello ");
    arrayListManipulator.addElement(" And");
    arrayListManipulator.addElement(" Good");
    arrayListManipulator.addElement(" Morning ");

    arrayListManipulator.display();
    arrayListManipulator.removeByElement(" Morning ");
    arrayListManipulator.display();
    arrayListManipulator.removeByIndex(1);
    arrayListManipulator.display();
    arrayListManipulator.SortArray();
    arrayListManipulator.display();


 }

}
