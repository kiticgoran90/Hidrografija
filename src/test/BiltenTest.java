package test;

import hidrografija.Bilten;
import hidrografija.Potok;
import hidrografija.Reka;

public class BiltenTest {

	public static void main(String[] args) {
		try {
			Bilten b = new Bilten("Izvestaj", 6);
			Potok p1 = new Potok("Gorski", 0.3, 0);
			Potok p2 = new Potok("Gradski", 0.4, 0.003);
			Reka r1 = new Reka("Vrbas").dodaj(p1).dodaj(p2);
			Potok p3 = new Potok("Bistri", 0.7, 0);
			Potok p4 = new Potok("Kozarski", 0.7, 0.001);
			Reka r2 = new Reka("Sava").dodaj(r1).dodaj(p3);
			
			b.dodaj(p1).dodaj(p2).dodaj(p3).dodaj(r1).dodaj(r2).dodaj(p4);
			System.out.println(b);
		}catch(Exception g) {System.out.println(g);}
	}
}
