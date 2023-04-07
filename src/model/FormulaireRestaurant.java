package model;

public class FormulaireRestaurant extends Formulaire{

	int nbrPersonne;
	int numService;
	public int getIdentificationEntite() {
		return IdentificationEntite;
	}
	@Override
	public void setIdentificationEntite(int numTable) {
		IdentificationEntite = numTable;
	}
	public int getNombrePersonnes() {
		return nbrPersonne;
	}
	public int getNumService() {
		return numService;
	}
	public FormulaireRestaurant(int jour, int mois, int nbrPersonne, int numService) {
		super(jour, mois);
		this.nbrPersonne = nbrPersonne;
		this.numService = numService;
	}

}
