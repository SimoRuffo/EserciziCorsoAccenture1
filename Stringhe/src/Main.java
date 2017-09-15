
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

	}

}
