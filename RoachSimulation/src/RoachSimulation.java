public class RoachSimulation {

public static void main(String[] args) {

	
	//create object called bugs
	RoachPopulation bugs = (RoachPopulation) new RoachSimulation();

	//construct new Roach population with 10 roaches
	((RoachSimulation) bugs).newRoaches(10);

	//breed roaches to double population
	((RoachSimulation) bugs).breed();

	//spray roaches to reduce number
	((RoachSimulation) bugs).spray(50);
	((RoachSimulation) bugs).spray(60);
	((RoachSimulation) bugs).spray(70);
	((RoachSimulation) bugs).spray(80);
	
	//print number of roaches before and after spraying
	((RoachSimulation) bugs).getRoaches();
}

private void newRoaches(int i) {
	// TODO Auto-generated method stub
	
}

private void breed() {
	// TODO Auto-generated method stub
	
}

private void spray(int i) {
	// TODO Auto-generated method stub
	
}

private void getRoaches() {
	// TODO Auto-generated method stub
	
}
}
