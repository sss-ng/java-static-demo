package demo;

public class Main {

	public static void main(String[] args) {

		Flight[] flights = new Flight[5];

		System.out.println("Total flight count: " + Flight.totalNumberOfFlights);
		flights[0] = new Flight("Southwest", 100, "Texas");
		flights[1] = new Flight("Delta", 200, "Mexico");
		flights[2] = new Flight("British Airways", 150, "New York");
		
		System.out.println("Total flight count: " + Flight.totalNumberOfFlights);
		flights[3] = new Flight("American Airlines", 199, "Germany");
		flights[4] = new Flight("United", 700, "Hawaii");
		
		System.out.println("Total flight count: " + Flight.totalNumberOfFlights);

		System.out.println("Here are the individual flights:");
		for (int i = 0; i < flights.length; i++) {
			Flight f = flights[i];
			System.out.println("Flight: " + f.airlineName + ", " + f.destination + ", " + f.cost);
		}
	}
}
