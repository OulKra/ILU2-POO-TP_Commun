package model;

public class ReservationSpectacle extends Reservation
{
	int numZone;
	int numChaise;
	
	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour, mois);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}
	
	public String toString()
	{
		return "Le " + jour + "/" + mois + " : Le spectacle dans la zone" + numZone + " à la place " + numChaise + " est réservé";
	}
}
