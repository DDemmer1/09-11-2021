package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
				// Die Aussage soll wahr sein, wenn die Variablen x und y nicht gleich sind
				// und das Ergebnis von a geteilt durch b gerade ist
		

				//Hier nichts �ndern
				int x = 5;
				int y = 4;

				int a = 9;
				int b = 3;
				
				
				
				//Hier k�nnt ihr euren Ausdruck Eintragen
				boolean bool =  x != y  &&  ((a / b) % 2 == 0);

				System.out.println("Der Ausdruck sollte true sein und ist : " + bool);
				
				
				//############################################
		
				
				double preis = 1.99d;
				
				//wandelt den Preis in einen abgerundeten int wert um
				int abgerundeterPreis = (int) preis;
				
				
				//weist der Variablen "istAbgerundet" das Ergebnis des Vergleichs zwischen "abgerundeterPreis" und 1 zu
				
				boolean istAbgerundet = abgerundeterPreis == 1;
				
				
				System.out.println("Preis abgerundet: " + istAbgerundet);
				
//				//############################################

				char c = 'A';
				
				int ascii = c;
				
				System.out.println(ascii);
				
				//wandelt den char c in seinen ASCII Wert um
				
				
//				//############################################		
				
				
				//Überlegt euch warum man keinen String zu einem char casten kann
				String s = "A";
			
				char gehtNicht = s.charAt(0);
				
//				//############################################

				
				
		
	}

}
