public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Mercedes";
        car1.model = "C200";
        car1.year = "2019";
        car1.distance = 0;
        car1.speed = 0;
        String info = car1.getInfo();

        car1.accelerate(100);
        car1.go(100);
        car1.go(50);
        System.out.println(car1.getInfo());
        System.out.println("Time for Car1 is: " + car1.calculateTime());

        Car car2 = new Car();
        car2.make = "Opel";
        car2.model = "Insignia";
        car2.year = "2010";
        car2.distance = 10000;
        car2.speed = 150;
        String info2 = car2.getInfo();

        car2.accelerate(200);
        car2.go(200);
        car2.go(100);
        System.out.println(car2.getInfo());
        System.out.println("Time for Car2 is: " + car2.calculateTime());

    }
}
