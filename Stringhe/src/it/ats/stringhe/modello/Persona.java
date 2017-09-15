package it.ats.stringhe.modello;

public class Persona {

	private String CF;
	private String nome;
	private String cognome;
	private char sesso;
	private int eta;
	
	public Persona(String cF, String nome, String cognome, char sesso, int eta) {
		super();
		CF = cF;
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.eta = eta;
	}

	public String getCF() {
		return CF;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public char getSesso() {
		return sesso;
	}
	public int getEta() {
		return eta;
	}
	
	@Override
	public String toString() {
		return "Persona [CF=" + CF + ", nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", eta=" + eta
				+ "]";
	}
}
