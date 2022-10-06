package lukegoll.gutachten_autocomplete.main;

import java.io.IOException;

import lukegoll.gutachten_autocomplete.fall.Kunde;
import lukegoll.gutachten_autocomplete.itextpdf.AufnahmebogenServiceImpl;
import net.sourceforge.tess4j.TesseractException;

public class Main {

	public static void main(String[] args) throws Exception {
		AufnahmebogenServiceImpl a1=new AufnahmebogenServiceImpl();
		Kunde k1=new Kunde();
		a1.writeKundenData(k1);
		a1.writeKundenMail(k1);
		a1.writeKundenTel(k1);
	}

}
