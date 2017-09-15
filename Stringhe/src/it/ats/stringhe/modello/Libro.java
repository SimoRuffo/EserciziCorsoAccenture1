package it.ats.stringhe.modello;

public class Libro {

	private String codiceIsbn;
	private String titolo;
	private int numPagine;
	private Persona autore;

	public Libro(String codiceIsbn, String titolo, int numPagine, Persona autore) {
		this.codiceIsbn = codiceIsbn;
		this.titolo = titolo;
		this.numPagine = numPagine;
		this.autore = autore;
	}

	public String getCodiceIsbn() {
		return codiceIsbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getNumPagine() {
		return numPagine;
	}

	public Persona getAutore() {
		return autore;
	}

}
