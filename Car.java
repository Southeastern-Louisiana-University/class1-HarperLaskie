public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String carMake, String carModel, int carYear, String carColor) {
        make = carMake;
        model = carModel;
        year = carYear;
        color = carColor;
    }
        public String toString () {
            return "Make: " + make + ", Model: " + model + ", Year: " + year + " " + ", Color: " + color;
        }
        public static void main (String[]args){
            Car carA = new Car("Ford ", "Mustang ", 2017 , "Black");
            Car carB = new Car("Honda ", "Accord ", 2012, "Silver");
            Car carHarper = new Car("Nissan ", "Versa ", 2019 , "White ");

            System.out.println(carA);
            System.out.println(carB);
            System.out.println(carHarper);
        }
    }

