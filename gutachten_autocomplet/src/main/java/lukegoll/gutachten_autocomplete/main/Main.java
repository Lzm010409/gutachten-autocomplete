package lukegoll.gutachten_autocomplete.main;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lukegoll.gutachten_autocomplete.pdf.PdfAnalyser;
import lukegoll.gutachten_autocomplete.pdf.PdfReader;
import net.sourceforge.tess4j.TesseractException;

public class Main {
	private final static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws IOException, TesseractException {

		PdfReader pdf = new PdfReader();
		pdf.readPdfFile();
		pdf.strippPdf();

		PdfAnalyser pdfa = new PdfAnalyser();

		pdfa.setPdfReader(pdf);
		pdfa.findName();

	}

}
