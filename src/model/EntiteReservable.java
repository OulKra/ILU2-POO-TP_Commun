package model;

public abstract class EntiteReservable {

	CalendrierAnnuel carnet;
	int identifiant;
	
	protected EntiteReservable(CalendrierAnnuel carnet, int id)
	{
		this.carnet = carnet;
		this.identifiant = id;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	public <T extends Formulaire> boolean estLibre(T form)
	{
		return carnet.estLibre(form.getJour(), form.getMois());
	}
	
	public abstract <T extends Formulaire> boolean compatible(T form);
	
	public abstract <T extends Formulaire> Reservation reserver(T form);
}
