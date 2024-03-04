public class Main {
	public static void main(String[] args) {

/*		System.out.println("Hello world!");
		System.out.println("Ciao");*/

		boolean x = true;
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
		

	}
}