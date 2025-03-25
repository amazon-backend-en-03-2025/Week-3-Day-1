public class Computer implements Startable {


    public void start() {
        System.out.println("Welcome to Windows 11");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off");
    }
}
