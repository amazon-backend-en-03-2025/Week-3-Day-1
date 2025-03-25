public abstract class Vehicle {

    private String gasolineType;

    public void refillTank() {
        System.out.println("Tank is being refilled...");
    }

    abstract void checkTank();
}
