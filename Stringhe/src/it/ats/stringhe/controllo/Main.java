package it.ats.stringhe.controllo;

import java.util.Date;

import it.ats.stringhe.modello.Automobile;
import it.ats.stringhe.modello.Libro;
import it.ats.stringhe.modello.Persona;

public class Main {

	public static void main(String[] args) {
		String nome = "Giovanni";
		String nomeDue = "Giovanni";

		// Restituisce "I nomi sono uguali" poiché 
		// associa il riferimento sempre alla stessa istanza
		if (nome == nomeDue) {
			System.out.println("I nomi sono uguali");
		} else {
			System.out.println("I nomi sono diverso");
		}

		String nomeTre = new String("Pippo");
		String nomeQuattro = new String("Pippo");

		// Qui scrive "I nomi sono diversi" poiché il metodo new
		// restituisce ogni volta una nuova istanza della stringa
		if (nomeTre == nomeQuattro) {
			System.out.println("I nomi sono uguali");
		} else {
			System.out.println("I nomi sono diversi");
		}

		
		// Con equals confronto direttamente il valore
		// e non i riferimenti (non l'indirizzo puntato)
		if (nomeTre.equals(nomeQuattro)) {
			System.out.println("I nomi sono uguali");
		} else {
			System.out.println("I nomi sono diverso");
		}

		/*********************************************************************************/

		// Creiamo due automobili utilizzando new Automobile(.....)...
		Automobile fiatUno = new Automobile("Uno", "bianca", "Fiat", "MN245VB", 1450, new Date());
		Automobile fiatPunto = new Automobile("Punto", "rossa", "Fiat", "VN535CB", 1450, new Date());

		if (fiatUno == fiatPunto) {
			System.out.println("Le auto sono uguali");
		} else {
			System.out.println("le auto sono diverse");
		}

		if (fiatUno.equals(fiatPunto)) {
			System.out.println("Le auto sono uguali");
		} else {
			System.out.println("le auto sono diverse");
		}
		
		// Genera delle stringhe modificabili....
		StringBuilder stringBuilder = new StringBuilder("ciao");
		stringBuilder.append(" mondo");  // Append concatena la parola alla fine della stringa
		
		// Alternativa simile a StringBuilder c'è StringBuffer....
		StringBuffer Stringa = new StringBuffer("ciao");
		Stringa.append(" mondo");
		
		
		/**********************************************************************************/
		
		// Creiamo una nuova persona...
		Persona marioRossi = new Persona("FTGG432FDRG5", "Mario", "Rossi", 'M', 27);
		Automobile fiatPunto2 = new Automobile("Fiat", "Punto", "Blue", "NM435JH", 1450, new Date());
		
		fiatPunto2.setAutista(marioRossi);
		System.out.println("L'autista dell'auto è " + fiatPunto2.getAutista().getNome());
		
		/*************************************************************************************/
		
		Libro libroEspiazione = new Libro("1231jd", "Espiazione", 300, marioRossi);
		
		
	}
}
