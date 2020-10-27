
public class RoachPopulation {




	// the size of the initial roach population
	private double roachPop;
	
	public RoachPopulation(int amount) {
		roachPop = amount;
	}
	public void breed(double d) {
	
	roachPop = roachPop*2;
	}
	/**
	 * 
	 * @param sprayAmount is the amount of bug spray in a percentage
	 * @return is the amount of spray that is accepted
	 */

	public void spray(double sprayAmount) {
	//decrease the roach population  
	roachPop = roachPop-(roachPop*sprayAmount);
	}

	public double getRoaches() {
		return roachPop;
	
		}
}

