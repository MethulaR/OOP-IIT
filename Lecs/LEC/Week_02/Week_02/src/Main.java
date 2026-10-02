//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

        //Setters
        car1.SetBrand("Merc");
        car1.SetColor("Black");
        car1.SetNumOfSteats(7);

        //Getters
       String Brand = car1.getBrand();
        String Color = car1.getColor();
        int number = car1.getNumOfSteats();

        System.out.println("Brand: " + Brand);
        System.out.println("Color: " + car1.getColor());


    }
}
