package demo;

public class Flight {
	
	// For simplicity, all fields are public so we dont need getters/setters

	public static int totalNumberOfFlights; // Note: this is static, the others aren't

	public String airlineName;
	public double cost;
	public String destination;

	public Flight(String airlineName, double cost, String destination) {
		this.airlineName = airlineName;
		this.cost = cost;
		this.destination = destination;

		totalNumberOfFlights++;
	}
}
