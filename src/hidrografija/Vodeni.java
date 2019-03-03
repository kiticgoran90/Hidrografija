package hidrografija;

public abstract class Vodeni implements Tok {
	private String naziv;
	
	public Vodeni(String naziv) {
		this.naziv = naziv;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public abstract double koncentracija();  //mg/m^3
	
	public boolean bezbedno() {
		return koncentracija() < 0.001;
	}

	@Override
	public String toString() {
		return naziv + "(" + kapacitet() + "|" + bezbedno() + ")";
	}
	
	@Override
	public Vodeni clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
