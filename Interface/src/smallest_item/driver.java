package smallest_item;

public class driver {

	public static Comparable find_smallest_item(Comparable [] items) {
		 
		//Find the smallest in any array of items of any types that implements Comparable
		
		Comparable smallest_item = items[0];
		for(int k = 1; k < items.length; k++) {
			if(items[k].compareTo(smallest_item) < 0)
				smallest_item = items[k];
		}
		return smallest_item;
	}
	
	
	public static void main(String[] args) {
	
		Car c1 = new Car("BMW M3 Sedan", 2016, 50000.0);
		Car c2 = new Car("Toyota Lexus", 2017, 25000.0);
		Car c3 = new Car("Lincoln", 2014, 39000.0);
		Car c4 = new Car("Mazda", 2015, 25000.0);
		Car c5 = new Car("Ford", 2019, 32000.0);
		Car c6 = new Car("Honda", 2017, 25000.0);
		
		
		Car[] carArray = {c1,c2,c3,c4,c5,c6};
		Car cheapest = (Car) find_smallest_item(carArray);
		System.out.println("Cheapest car: " + cheapest);
		
		
		Double[] number = {2.0, 2.3, 3.5, 5.4, 4.2, 1.0};
		double smallest = (Double) find_smallest_item(number);
		System.out.println("Smallest number: " + smallest);
		
		String[] names = {"Max", "Luna", "Bella", "Lucky"};
		String alphabetically = (String) find_smallest_item(names);
		System.out.println("First name alphabetically: " + alphabetically);
		
		

	}

}
