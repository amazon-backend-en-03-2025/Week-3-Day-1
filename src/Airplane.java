public class Airplane implements Startable, Landable {


    @Override
    public void start() {
        System.out.println("Be ready to fly");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off");
    }

    @Override
    public void lands(String city) {
        System.out.println("Is landing at " + city);
    }
}
