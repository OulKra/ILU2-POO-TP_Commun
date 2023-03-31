package model;

public class ReservationRestaurant extends Reservation
{
	int numService;
	int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString()
	{
		if(numService ==1)
			return "Le " + jour + "/" + mois + " : table n°" + numTable + " pour le premier service.\n";
		else
			return "Le " + jour + "/" + mois + " : table n°" + numTable + " pour le deuxième service.\n";
	}
	
}
