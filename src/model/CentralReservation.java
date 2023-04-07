package model;

public class CentralReservation <E extends EntiteReservable, F extends Formulaire>{
	EntiteReservable[] entites;
	int nbrEntite;
	
	public CentralReservation(EntiteReservable[] entites, int nbrEntite)
	{
		this.nbrEntite = 0;
		this.entites = new EntiteReservable[nbrEntite];
	}
	
	public int ajouterEntite(EntiteReservable entite)
	{
		entites[nbrEntite] = entite;
		nbrEntite++;
		return nbrEntite;
	}
	
	public int[] donnerPossibilites(F formulaire)
	{
		int nbrVal = 0;
		for (int i = 0; i < nbrEntite; i++) 
		{
			if(entites[i].estLibre(formulaire))
			{
				nbrVal++;
			}
		}
		
		int val[] = new int[nbrVal];
		
		for (int i = 0; i < nbrEntite; i++) 
		{
			if(entites[i].estLibre(formulaire))
			{
				val[i] = entites[i].getIdentifiant();
			}
			else 
			{
				val[i] = 0;
			}
		}
		
		return val;
	}
	
	public Reservation reserver(F formulaire, int num)
	{
		EntiteReservable entite = entites[num-1];
		formulaire.setIdentificationEntite(entite.getIdentifiant());
		return entite.reserver(formulaire)
;		
	}
}
