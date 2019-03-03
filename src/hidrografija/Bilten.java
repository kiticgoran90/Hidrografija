package hidrografija;

import greske.GBiltenPun;

public class Bilten implements Cloneable {
	private String naziv;
	private Vodeni[] tokovi;
	private int n;		//broj tokova u nizu tokovi
	
	public Bilten(String naziv, int kap) {
		this.naziv = naziv;
		tokovi = new Vodeni[kap];
	}
	
	public Bilten dodaj(Vodeni v) throws GBiltenPun {
		if(n == tokovi.length) throw new GBiltenPun();
		tokovi[n++] = v;
		return this;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(naziv).append("\n");
		for(Vodeni v: tokovi)
			sb.append(v).append("\n");
		return sb.toString();
	}
	
	public Bilten clone() {
		try {
			Bilten b = (Bilten)super.clone();
			b.tokovi = tokovi.clone();
			return  b;
		}catch(CloneNotSupportedException g) {return null;}
	}
}
