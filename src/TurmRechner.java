
public class TurmRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Startzahl = 2;
		int Ergebnis;
		int counter = 0;
		
		for (int i = 2; i <= 9; i++) {
			Ergebnis=Startzahl*i;
			System.out.println(Ergebnis);
			counter++;
			Startzahl=Ergebnis;
		}
		for (int i = 2; i <= 9; i++) {
			Ergebnis=Startzahl/i;
			System.out.println(Ergebnis);
			counter++;
			Startzahl=Ergebnis;
		}
		System.out.println("Es wurden " + counter + " Rechnungen gemacht!");

	}

}
