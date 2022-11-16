package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	protected Innlegg[] innleggtabell;
	protected int nesteledig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i <= getAntall(); i++) {
			if (this.getSamling()[i].getId() == innlegg.getId()) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if(getAntall() > 0) {
			for(int i = 0; i < getAntall(); i++) {
				if(getSamling()[i].getId() == innlegg.getId()) {
					return true;
				}
			}
		}
		
		return false;
	}

	public boolean ledigPlass() {
		if(getAntall() < getSamling().length) {
			return true;
		} else {
			return false;
		}
	}

	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg)) {
			getSamling()[getAntall()] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
	}

	public String toString() {
		String string = "";
		
		string += getAntall() + "\n";
		for(int i = 0; i < getAntall(); i++) {
			string += getSamling()[i].toString();
		}
		return string;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}