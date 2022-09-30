package lukegoll.gutachten_autocomplete.main;

import java.io.File;
import java.io.IOException;

import lukegoll.gutachten_autocomplete.tesseract.TestTesseract.*;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Main {

	public static void main(String[] args) throws IOException, TesseractException {

		/*
		 * PdfReader pdf=new PdfReader(); pdf.readPdfFile(); pdf.strippPdf();
		 * 
		 * PdfAnalyser pdfa=new PdfAnalyser();
		 * 
		 * pdfa.setPdfReader(pdf); pdfa.alignText();
		 */

		Tesseract tes = lukegoll.gutachten_autocomplete.tesseract.TestTesseract.getTesseract();
		File image = new File("/Users/lukegollenstede/foto.png");
		String result = tes.doOCR(image);
		System.out.println(result);

	}
}
