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

		// Con equals confronto direttamente le parole 
		if (nomeTre.equals(nomeQuattro)) {
			System.out.println("I nomi sono uguali");
		} else {
			System.out.println("I nomi sono diverso");
		}

		/***************************************************************************/

		// Creiamo due automobili utilizzando new Automobile(.....)...
		Automobile fiatUno = new Automobile(1450, "Uno", "bianca", "Fiat", "MN245VB", new Date());
		Automobile fiatPunto = new Automobile(1450, "Punto", "rossa", "Fiat", "VN535CB", new Date());

		if (fiatUno == fiatPunto) {
			System.out.println("Le auto sono uguali");
		} else {
			System.out.println("le auto sono diverse");
		}

	}

}
