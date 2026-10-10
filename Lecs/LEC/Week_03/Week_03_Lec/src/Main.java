import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 public static void main(String[] args) {
     Test obj1 = new Test();

     obj1.test("ABC");
     obj1.test(20);
     obj1.testMethod("");

     ArrayList<integer> arrayList = new ArrayList<>(10);

     //Insert elemnts
     arrayList.add(10);
     arrayList.add(20);
     arrayList.add(30);

     System.out.println(arrayList);

     //interting elements according to an index

     arrayList.add(0,5);

     System.out.println(arrayList);

     //remove elements from the Arraylist

     arrayList.remove(2);
     System.out.println(arrayList);

     //get the size of the arrayList

     System.out.println(arrayList.size());


     //print the elements in an arraylist

     for(int i =0; i <= arrayList.size(); i++){
         System.out.println(arrayList.get(i));

     }
 }
}


