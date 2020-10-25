
public class RoachPopulation {

	// the size of the initial roach population
	private double roachPop;


	// the roach population multiplier

	private double popMulti = 2;

	//the percentage of bug spray used

	private double sprayPct;

	//the roach population after being sprayed

	private double roachPopAfter;

	// amount of roach breeding cycles

	private int breedCyc = 0;

	
	//simulates a period in which the roaches breed

	private void breed() {
	if(breedCyc > 0) 
	{
	roachPop = roachPopAfter;
	}

	breedCyc ++;

	//this double roach population by using the multiplier
	roachPop *= popMulti;
	}

	/**
	 * 
	 * @param sprayAmount is the amount of bug spray in a percentage
	 * @return is the amount of spray that is accepted
	 */

	public double bugSpray(double sprayAmount) {
	sprayPct = sprayAmount;

	//decrease the roach population  
	roachPopAfter = -Math.floor(roachPop*(1.0-sprayPct/100.0));

	return sprayAmount;

	}

	private void getRoaches() {
	
	System.out.println("Roach population after cycle " + breedCyc + "of breeding is " + (int)roachPop + ".");

	System.out.println("Roach population after cycle" + breedCyc + "of breeding and spraying " + (int)sprayPct + "% is" + (int)roachPopAfter );
	}
}


