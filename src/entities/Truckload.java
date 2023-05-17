package entities;

public class Truckload {
	public enum CriticalityLevel{
		HIGH,
		MEDIUM,
		LOW
	}
	
	private String loadContent;
	private double weight;
	private CriticalityLevel criticalityLevel;
	
	public Truckload(String loadContent, double weight) {
		this.setLoadContent(loadContent);
		this.weight = weight;
		criticalityLevel = CriticalityLevel.LOW;
	}
	
	public Truckload(String loadContent, double weight, CriticalityLevel criticalityLevel) {
		this.setLoadContent(loadContent);
		this.weight = weight;
		this.criticalityLevel = criticalityLevel;
	}

	public String getLoadContent() {
		return loadContent;
	}

	public void setLoadContent(String loadContent) {
		this.loadContent = loadContent;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
    public CriticalityLevel getCriticalityLevel() {
        return criticalityLevel;
    }

}
