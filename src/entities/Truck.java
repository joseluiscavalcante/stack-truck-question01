
package entities;

public class Truck {
	private String licensePlate;
	private Truckload load;
	private boolean isLoaded;
	private double weightTransported;
	
	public Truck(String licensePlate) {
		this.licensePlate = licensePlate;
		isLoaded = false;
		load = null;
		weightTransported = 0.0;
	}
	
	public Truck(String licensePlate, Truckload load) {
		this.licensePlate = licensePlate;
		this.load = load;
		this.weightTransported = load.getWeight();
		isLoaded = true;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Truckload getLoad() {
		return load;
	}

	public void setLoad(Truckload load) {
		this.load = load;
	}

	public boolean isLoaded() {
		return isLoaded;
	}

	public void setLoaded(boolean isLoaded) {
		this.isLoaded = isLoaded;
	}

	public double getWeightTransported() {
		return weightTransported;
	}

	public void unloadTruck() {
		load = null;
		isLoaded = false;
	}
	
	@Override
	public String toString() {
		return "License Plate: " + licensePlate + ", Load: " + load.getLoadContent() + ", Load criticality level: " + load.getCriticalityLevel();
	}
	
	
	
}
