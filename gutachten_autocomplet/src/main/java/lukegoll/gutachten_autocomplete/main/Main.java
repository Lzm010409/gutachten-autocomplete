package lukegoll.gutachten_autocomplete.main;

import java.io.IOException;

import lukegoll.gutachten_autocomplete.fall.Fahrzeug;
import lukegoll.gutachten_autocomplete.fall.Kunde;
import lukegoll.gutachten_autocomplete.itextpdf.AufnahmebogenServiceImpl;
import lukegoll.gutachten_autocomplete.itextpdf.ReadCoordinates;
import net.sourceforge.tess4j.TesseractException;

public class Main {

	public static void main(String[] args) throws Exception {
		AufnahmebogenServiceImpl a1 = new AufnahmebogenServiceImpl();
		Kunde k1 = new Kunde();
		Fahrzeug f1 = new Fahrzeug();
		/*a1.writeKundenData(k1);
		a1.writeKundenMail(k1);
		a1.writeKundenTel(k1);
		a1.writeFahrzeugData(f1);
		
		
		System.out.println(f1.getKennzeichen());
		f1.universalSetter("abc", 0);
		System.out.println(f1.universalGetter(0));
		System.out.println(f1.getKennzeichen());*/
		
		System.out.println(a1.readFileWithReturn(ReadCoordinates.FALLGZUSTAND));
		
	}

}
