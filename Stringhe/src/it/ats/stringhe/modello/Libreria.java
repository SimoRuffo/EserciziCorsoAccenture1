package it.ats.stringhe.modello;

public class Libreria {

	// Qui effettueremo una aggregazione
	private String nome;
	private String indirizzo;
	private Libro[] salaUno;
	private Libro[] salaDue;
	
	
	public Libreria(String nome, String indirizzo) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.salaUno = new Libro[1000];
		this.salaDue = new Libro[1000];
	}

	
	public void aggiungiLibroInSalaUno(Libro libro) {
		
		for (int i = 0; i < salaUno.length; i++) {
			if(this.salaUno[i] ==null) {
				this.salaUno[i] = libro;
			    break;
			}
		}
	}
	

	public String getNome() {
		return nome;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public Libro[] getSalaUno() {
		return salaUno;
	}


	public Libro[] getSalaDue() {
		return salaDue;
	}


	@Override
	public String toString() {
		return "Libreria [nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}	
	
}
