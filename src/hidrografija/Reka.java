package hidrografija;

import java.util.Iterator;
import java.util.LinkedList;

public class Reka extends Vodeni {
	LinkedList<Vodeni> tokovi = new LinkedList<Vodeni>();

	public Reka(String naziv) {
		super(naziv);
	}
	
	public Reka dodaj(Vodeni v) {
		tokovi.add(v);
		return this;
	}
	
	@Override
	public double kapacitet() {
		double kapacitet = 0;
		Iterator<Vodeni> i = tokovi.iterator();
		while(i.hasNext()) {
			kapacitet += i.next().kapacitet();
		}
		return kapacitet;
	}
	
	@Override
	public double koncentracija() {
		double koncentracija = 0;
		Iterator<Vodeni> i = tokovi.iterator();
		while(i.hasNext()) {
			koncentracija = i.next().koncentracija();
		}
		return koncentracija;
	}
}
