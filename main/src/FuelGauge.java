public class FuelGauge {
    private double fuelValue;
    final double MAX_VALUE = 50;

    public FuelGauge() {
        this.fuelValue = 0;
    }

    public FuelGauge(double fuelGauge) {
        this.fuelValue = fuelGauge;
    }

    public double getFuelValueNow() {
        return this.fuelValue;
    }

    private void refuel() {
        try {
            addOneLitre();
        } catch (IllegalArgumentException e) {
            System.out.println("Переполнение бака, лишнее слито.");
        }

    }

    private void addOneLitre() {
        this.fuelValue += 1;

        if (this.fuelValue > MAX_VALUE) {
            this.fuelValue = MAX_VALUE;
            throw new IllegalArgumentException();
        }

    }

    public void minusOneLetre() {
        if (this.fuelValue > 0.1) {
            fuelValue -= 0.1;
        } else {
            System.out.println("Закончилось топливо, остановка и заправка");
            refuel();
        }
    }


}
