public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Airplane airplane = new Airplane();
        Computer computer = new Computer();

        start(airplane);
        start(computer);


        Car car = new Car();


    }


    public static void start(Startable startable) {
        startable.start();
    }


}
