package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {
	protected String tekst;
	
	public Tekst () {	
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
	}
	
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		String string = "TEKST" + "\n" + id + "\n" 
						+ bruker + "\n" + dato + "\n" 
						+ likes + "\n" + tekst + "\n";
		return string;
	}
	
	public String toHTML() {		
		throw new UnsupportedOperationException(TODO.method());			
	}
}
