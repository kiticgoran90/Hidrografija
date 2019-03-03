package hidrografija;

import greske.GNekorektno;

public class Potok extends Vodeni {
	private double kapacitet, koncentracija;
	
	public Potok(String naziv, double kapacitet, double koncentracija) throws GNekorektno {
		super(naziv);
		if(kapacitet < 0 || koncentracija < 0) throw new GNekorektno();
		this.kapacitet = kapacitet;
		this.koncentracija = koncentracija;
	}
	
	@Override
	public double koncentracija() {
		return koncentracija;
	}
	
	@Override
	public double kapacitet() {
		return kapacitet;
	}
}
