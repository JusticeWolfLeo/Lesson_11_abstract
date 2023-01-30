public class ElectroCar extends Car {
    private int timeRecharge;

    public ElectroCar(String model, int maxSpeed, int yearOfManufacture) {
        super("Sovershenstvo", maxSpeed, yearOfManufacture);
        this.timeRecharge = 128;
    }

    @Override
    public void brake() {
        System.out.println("Тесла тормозит");
    }

    @Override
    public void repair() {
        System.out.println("Ремонт теслы");
    }

    public void ElectroFuel() {
        System.out.println("Электричества кушает много а толку мало");
    }
}
