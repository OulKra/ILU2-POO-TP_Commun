package model;

public abstract class Formulaire 
{
	int jour;
	int mois;
	int IdentificationEntite;
	protected Formulaire(int jour, int mois)
	{
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getJour()
	{
		return jour;
	}
	
	public int getMois()
	{
		return mois;
	}
	
	public int getIdentificationEntite()
	{
		return IdentificationEntite;
	}
	
	public void setIdentificationEntite(int id)
	{
		IdentificationEntite = id;
	}
}