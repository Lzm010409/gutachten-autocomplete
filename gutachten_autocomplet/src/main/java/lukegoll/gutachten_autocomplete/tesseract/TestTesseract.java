package lukegoll.gutachten_autocomplete.tesseract;

import net.sourceforge.tess4j.Tesseract;

public class TestTesseract {
	public TestTesseract() {

	}

	public static Tesseract getTesseract() {
		Tesseract instance = new Tesseract();
		instance.setDatapath(
				"/Users/lukegollenstede/git/gutachten-autocomplete/gutachten_autocomplet/src/main/ressources/deu-2.traineddata");
		instance.setLanguage("deu");
		return instance;
	}
}
