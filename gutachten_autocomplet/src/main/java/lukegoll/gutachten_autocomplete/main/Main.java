package lukegoll.gutachten_autocomplete.main;

import java.io.IOException;

import lukegoll.gutachten_autocomplete.fall.Kunde;
import lukegoll.gutachten_autocomplete.itextpdf.Aufnahmebogen;
import net.sourceforge.tess4j.TesseractException;

public class Main {

	public static void main(String[] args) throws Exception {
		Aufnahmebogen a1=new Aufnahmebogen();
		Kunde k1=new Kunde();
		a1.writeInformationToKunde(k1);
	}

}
