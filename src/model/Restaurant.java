package model;

public class Restaurant {
	
	CentralReservation central;
	Table table;
	
	public void ajouterTable()
	{
		table = new Table()
	}
	
	private boolean donnerPossibilite(FormulaireRestaurant form)
	{
		return table.donnerPossibilite(form);
	}
	
	private Reservation reserver(FormulaireRestaurant form)
	{
		return table.reserver(form);
	}
	
	
	private static class Table
	{
		CalendrierAnnuel calendrier;
		CalendrierAnnuel calendrierDeuxiemeService;
		
		int nbrChaise;
		
		private Table(CalendrierAnnuel calendrier, int nbrChaise)
		{
			this.calendrier = calendrier;
			this.nbrChaise = nbrChaise;
			
		}
		
		private boolean donnerPossibilite(FormulaireRestaurant form)
		{
			boolean Place = (form.getNombrePersonnes() == nbrChaise || form.getNombrePersonnes() == (nbrChaise+1));
			boolean Dispo = false;
			if(form.getNumService() == 1)
				Dispo = calendrier.estLibre(form.getJour(), form.getMois());
			else
				Dispo = calendrierDeuxiemeService.estLibre(form.getJour(), form.getMois());
			
			return Place && Dispo;
		}
		
		private Reservation reserver(FormulaireRestaurant form)
		{
			if(form.getNumService() == 1)
				calendrier.reserver(form.getJour(), form.getMois());
			else
				calendrierDeuxiemeService.reserver(form.getJour(), form.getMois());
			
			return new ReservationRestaurant(form.getJour(), form.getMois(), form.numService, form.IdentificationEntite);
		}
	}

}
