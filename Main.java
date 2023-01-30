public abstract class Main {
    public static void main(String[] args) {
        Car volga = new Car("Volga", 100, 1980) {
            @Override
            public void brake() {
            }

            @Override
            public void repair() {
            }
        };
        volga.brake();
        volga.repair();
        volga.gas();
        volga.getMaxSpeed();
        volga.getModel();
        volga.getYearOfManufacture();

        ElectroCar tesla = new ElectroCar("Tesla", 350, 2022) {
            @Override
            public void brake() {
            }

            @Override
            public void repair() {
            }
        };
        tesla.brake();
        tesla.repair();
        tesla.gas();
        tesla.getMaxSpeed();
        tesla.getModel();
        tesla.getYearOfManufacture();

        Zaporozhetz zaporozhetz = new Zaporozhetz("Zaporozhetz", 70, 1975) {
            @Override
            public void brake() {
            }

            @Override
            public void repair() {
            }
        };
        zaporozhetz.brake();
        zaporozhetz.repair();
        zaporozhetz.gas();
        zaporozhetz.getMaxSpeed();
        zaporozhetz.getModel();
        zaporozhetz.getYearOfManufacture();
    }
    RaceCar raceCar = new RaceCar("F1", 450,2020 ){
        @Override
        public void brake() {
        }

        @Override
        public void repair() {
        }
    };
}