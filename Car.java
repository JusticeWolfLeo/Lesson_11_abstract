public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;
    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void gas() { //...газ
    }

    public abstract void brake();

    public abstract void repair();

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

}
