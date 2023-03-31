package model;

public class ReservationHotel extends Reservation
{
	int nbrLitSimple;
	int nbrLitDouble;
	int numeroChambre;
	
	public ReservationHotel(int jour, int mois, int nbrLitSimple, int nbrLitDouble, int numeroChambre) {
		super(jour, mois);
		this.nbrLitDouble = nbrLitDouble;
		this.nbrLitSimple = nbrLitSimple;
		this.numeroChambre = numeroChambre;
	}
	
	public String toString()
	{
		return "Le " + jour + "/" + mois + " : chambre n°" + numeroChambre + " avec " + nbrLitSimple + " lit.s simple.s et " + nbrLitDouble +" lit.s double.s";
	}

}
