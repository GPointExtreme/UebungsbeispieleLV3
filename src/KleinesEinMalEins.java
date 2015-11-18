
public class KleinesEinMalEins {

	public static void main(String[] args) {
		// Multiplikator 1-10
		for(int z = 1; z <= 10; z++) {
		
		// Zahl die angibt welche Reihe gerechnet wird + Ausgabe mit \t damit es in Spalten dargestellt wird
		for(int i = 1; i <= 10; i++) {
			System.out.print((z*i)+"\t");
		}
		System.out.println();
		}

	}

}
