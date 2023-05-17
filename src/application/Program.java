package application;

import java.util.Locale;

import entities.Truck;
import entities.Truckload;
import entities.Truckload.CriticalityLevel;
import utilities.MyStack;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		MyStack<Truck> stack = new MyStack<>();
		
		Truckload load = new Truckload("A", 1000.0);
		Truck truck = new Truck("NIT - 0001", load);
		
		Truckload load2 = new Truckload("B", 2000.0, CriticalityLevel.MEDIUM);
		Truck truck2 = new Truck("NIT - 0002", load2);
		
		Truckload load3 = new Truckload("C", 3000.0, CriticalityLevel.HIGH);
		Truck truck3 = new Truck("NIT - 0003", load3);
		
		stack.push(truck);
		stack.push(truck2);
		stack.push(truck3);
		
		stack.pop();
		
		System.out.println(stack);
	}
}
