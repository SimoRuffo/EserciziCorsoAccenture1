package it.ats.stringhe.controllo;

import java.util.Date;

import it.ats.stringhe.modello.Automobile;

public class Main {

	public static void main(String[] args) {
		String nome = "Giovanni";
		String nomeDue = "Giovanni";

		if (nome == nomeDue) {
			System.out.println("I nomi sono uguali");
		} else {
			System.out.println("I nomi sono diverso");
		}

		String nomeTre = new String("Pippo");
		String nomeQuattro = new String("Pippo");

		if (nomeTre == nomeQuattro) {
			System.out.println("I nomi sono uguali");
		} else {
			System.out.println("I nomi sono diverso");
		}

		// Con equals confronto direttamente il valore
		if (nomeTre.equals(nomeQuattro)) {
			System.out.println("I nomi sono uguali");
		} else {
			System.out.println("I nomi sono diverso");
		}

		/***************************************************************************/

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
	}
}
