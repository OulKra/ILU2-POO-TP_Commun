package model;

public class FormulaireHotel extends Formulaire{

	int nbrLitSimple;
	int nbrLitDouble;
	public int getIdentificationEntite() {
		return IdentificationEntite;
	}
	@Override
	public void setIdentificationEntite(int numChambre) {
		IdentificationEntite = numChambre;
	}
	public int getNbrLitSimple() {
		return nbrLitSimple;
	}
	public int getNbrLitDouble() {
		return nbrLitDouble;
	}
	public FormulaireHotel(int jour, int mois, int nbrLitSimple, int nbrLitDouble) {
		super(jour, mois);
		this.nbrLitSimple = nbrLitSimple;
		this.nbrLitDouble = nbrLitDouble;
		// TODO Auto-generated constructor stub
	}

}
