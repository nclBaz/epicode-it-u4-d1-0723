import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

/*		System.out.println("Hello world!");
		System.out.println("Ciao");*/

	/*	boolean x = true;
		x = false;

		// --------------------------- NUMERI INTERI ------------------------------

		byte numeroPiccolo = 100;
		short numeroNonProprioPiccolo = 1000;
		int numeroIntero = 40000;
		long numeroGrande = 1232132131;

		numeroIntero = numeroPiccolo; // ESEMPIO DI CASTING IMPLICITO (La conversione la fa JAVA)
		System.out.println("Numero intero : " + numeroIntero);

		numeroPiccolo = (byte) numeroGrande; // ESEMPIO DI CASTING ESPLICITO (La conversione la forziamo noi) <-- ATTENZIONE!! Può portare a possibili perdite di dati!!
		System.out.println("Numero piccolo : " + numeroPiccolo);

		// --------------------------- NUMERI DECIMALI ------------------------------
		double numeroDecimale = 0.5;
		float altroNumeroDecimale = 0.5f;
		// Sia i double che i float rappresentano numeri decimali. Come regola generale
		// meglio usare sempre i double per questioni di rapidità nell'esecuzione sui processori moderni.

		System.out.println(numeroDecimale);

		// ------------------------------ STRINGHE ----------------------------------
		char singoloCarattere = 'M';
		String stringa = "Hello World";
		// stringa = String.valueOf(2); // Da numero a stringa

		System.out.println(stringa);
		System.out.println("La lunghezza della stringa è: " + stringa.length());
		System.out.println("Il primo carattere della stringa è: " + stringa.charAt(0));
		System.out.println(stringa.replaceAll("World", "Mondo"));


		// ------------------------------- ARRAYS ------------------------------------
		String[] arrayDiStringhe = {"ciao", "a", "tutti"}; // Array di 3 elementi già inizializzato
		// String[] arrayDiStringhe = new String[3]; // Array di 3 elementi non inizializzato (gli elementi sono null)
		int[] arrayDiInteri = {1, 2, 3, 4, 5, 6};

		System.out.println("Il primo elemento è: " + arrayDiStringhe[0]);
		System.out.println("Il secondo elemento è: " + arrayDiStringhe[1]);
		System.out.println("Il terzo elemento è: " + arrayDiStringhe[2]);
		// System.out.println("Il terzo elemento è: " + arrayDiStringhe[3]); <-- Attenzione a non uscire dai limiti dell'array!

		for (int i = 0; i < arrayDiStringhe.length; i++) {
			System.out.println("Elemento corrente: " + arrayDiStringhe[i]);
			System.out.println("Indice corrente: " + i);
		}*/

		// ---------------------------------- METODI -------------------------------------
/*
		int risultato = sum(2, 5);
		System.out.println("La somma è: " + risultato);
		printSum(2, 7);
		String risultatoStringa = sumAsString(3, 7);
		System.out.println("La somma è: " + risultatoStringa);
*/


		// ---------------------------------- SCANNER -------------------------------------
		Scanner scanner = new Scanner(System.in); // Inizializzazione Scanner, strumento utile per richiedere degli input agli utenti
		// System.in vuol dire leggi gli input dal terminale

		System.out.println("Caro utente, per favore inserisci il tuo nome seguito dal tasto invio");
		String name = scanner.nextLine(); // Attendo che l'utente scriva il proprio nome, una volta fatto salverò tale valore in una variabile di tipo String
		System.out.println("Hai inserito " + name);
		System.out.println("Ora inserisci un numero intero");
		// int numero1 = scanner.nextInt(); // Sconsiglio di mixare nextLine con nextInt
		int numero1 = Integer.parseInt(scanner.nextLine()); // Attendo che l'utente inserisca un numero, quando lo inserisce lo converto in intero e lo salvo in una variabile di tipo int
		System.out.println("Ora inserisci un secondo numero intero");
		int numero2 = Integer.parseInt(scanner.nextLine());
		System.out.println("La somma è: " + sum(numero1, numero2));

		scanner.close(); // è sempre bene ricordarsi di chiudere lo scanner appena si finisce di usare

	}

	public static int sum(int num1, int num2) { // Questo metodo dovrà tornare un int
		return num1 + num2;
	}

	public static void printSum(int num1, int num2) { // Questo metodo invece non torna niente (void)
		System.out.println("La somma è: " + (num1 + num2));
	}

	public static String sumAsString(int num1, int num2) {
		return "" + (num1 + num2);
	}
}