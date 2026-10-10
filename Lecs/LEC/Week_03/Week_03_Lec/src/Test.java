import java.sql.SQLOutput;

public class Test <t>{

    public void test(String name){

        System.out.println("This is test method 01");
    }

    public void test(int age){

        System.out.println("This is test method 02");
    }


    //Type Casting

    public void testMethod(Object a){
        Double number = (Double)a; // Type casting
        System.out.println(number);


        int num1 = 10;
        Integer value = num1; //auto boxing

        int num2 = value; //unboxing

    }

    //Temporary value

    public void testMethod2(t b){
        t number = (t) b;
        System.out.println(number);


    }
}
