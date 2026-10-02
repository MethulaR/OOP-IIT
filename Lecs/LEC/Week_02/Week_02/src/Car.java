public class Car {

        String brand;
    String color;
        int numOfSteats;


        //Contructor

        //Default Constructer method
        public Car(){
            this.brand = "BMW";
            this.color = "White";
            this.numOfSteats = 5;
        }

        //Parameterized Constructor
        public Car(String brand, String color, int numOfSteats){
            this.brand = brand;
            this.color = color;
            this.numOfSteats = numOfSteats;
        }

        //getters

        public String getColor() {
            return color;

        }

        public String getBrand() {
            return brand;

        }

        public int getNumOfSteats() {
            return numOfSteats;

        }

        //setter

        public void SetBrand(String brand){
            this.brand = brand;
        }
        public void SetColor(String color){
            this.color = color;
        }

        public void SetNumOfSteats(int numOfSteats){
            this.numOfSteats = numOfSteats;
        }


    //Instance Method

        public void drive(int x){
            System.out.println("This is drive method");
        }
        public void drive(String x){

        System.out.println("This is drive method");

        }

        public void park(){
            System.out.println("This is park method");

        }

        public void park(String x){
            System.out.println("This is park method");

        }


    }


