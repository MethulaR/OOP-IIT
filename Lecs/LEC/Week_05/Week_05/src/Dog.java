public class Dog extends Animal {

//    public Dog(){
//        System.out.println("This is Child class constructor");
//    }
//
//    void Eat(){
//        super.Eat();
//        System.out.println("This is eat method in child class");
//    }
    @Override
    void sound(){
        System.out.println("Dogs can bark");
    }
}
