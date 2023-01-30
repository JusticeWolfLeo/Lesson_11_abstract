public class RaceCar extends Car {
    protected RaceCar(String model, int maxSpeed, int yearOfManufacture) {
        super(model, 100500, yearOfManufacture);
    }

    @Override
    public void brake() {
        System.out.println("Гоночное тормозит");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт на питстопе занимает пару секунд");
    }

    protected void pitStop() {
        System.out.println("Питстоп питстопов");
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("Слишком быстро");
        return 0;
    }
}