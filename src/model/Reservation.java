package model;

public abstract class Reservation 
{
	int jour;
	int mois;
	
	protected Reservation(int jour, int mois)
	{
		this.jour = jour;
		this.mois = mois;
	}
}
