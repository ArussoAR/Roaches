public class RoachSimulation {

public static void main(String[] args) {

	
	//construct new Roach population with 10 roaches
RoachPopulation bugs = new RoachPopulation(20);
	int y  = 10;
	System.out.println("The Initial Roach Population is: " + y);
	
	RoachPopulation newBug = new RoachPopulation(10);	
	
	//breed roaches to double population
	newBug.breed(.50);
	System.out.println("The Roach population after cycle 1 breeding is " +newBug.getRoaches());

	//spray roaches to reduce number
	bugs.spray(.50);
	System.out.println("The Roach population after cycle 1 50 percent spraying is: "+bugs.getRoaches());
	
	
	
	
RoachPopulation bugs2 = new RoachPopulation(20);
RoachPopulation newBug2 = new RoachPopulation(10);
	//
	newBug2.breed(.60);
	System.out.println("The Roach population after cycle 2 breeding is " +newBug2.getRoaches());
	

	//spray roaches to reduce number
		bugs2.spray(.60);
		System.out.println("The Roach population after cycle 2 60 percent spraying is: "+bugs2.getRoaches());
		
		
		
RoachPopulation bugs3 = new RoachPopulation(5);
RoachPopulation newBug3 = new RoachPopulation(8);
		newBug3.breed(.70);
		System.out.println("The Roach population after cycle 3 breeding is " +newBug3.getRoaches());

		//spray roaches to reduce number
				newBug3.spray(.70);
				System.out.println("The Roach population after cycle 3 70 percent spraying is: "+bugs3.getRoaches());
		
				
				
RoachPopulation bugs4 = new RoachPopulation(10);
RoachPopulation newBug4 = new RoachPopulation(5);

		newBug4.breed(.80);
			System.out.println("The Roach population after cycle 4 breeding is " +newBug4.getRoaches());
			
				//spray roaches to reduce number
				bugs4.spray(.80);
				System.out.println("The Roach population after cycle 4 80 percent spraying is: "+bugs4.getRoaches());
}

}