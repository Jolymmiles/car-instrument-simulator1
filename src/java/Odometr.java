package car;

public class Odometr {
	private int distance;
	private FuelGauge fg;
	private int MAX_DISTANCE = 999999;
	
	public Odometr() {
		this.distance = 0;
		this.fg = new FuelGauge();
	}
	
	public Odometr(int distance, double fuelGauge) {
		this.distance = distance;
		this.fg = new FuelGauge(fuelGauge);
	}
	
	public int distanceNow() {
		return this.distance;
	}
	
	public void move() {
		try {
			addDistance();
		} catch ( IllegalArgumentException e) {
			System.out.println("Превышен километраж, одометр сброшен");	
		}
	}
	
	
	private void addDistance () {
		this.distance++;
		System.out.println("Топливо: " + String.format("%6.1f",fg.getFuelValueNow()) + " Расстояние: " + distanceNow());
		fg.minusOneLetre();
		
		if (this.distance > MAX_DISTANCE) {
			this.distance = 0;
			throw new IllegalArgumentException();
		}
	}

}
