package lukegoll.gutachten_autocomplete.pdf;

import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;

public class PdfAnalyser {
	private PDDocument pdfToAnalyse = new PDDocument();
	private PdfReader pdfReader = new PdfReader();

	public PdfAnalyser() {

	}

	public void alignText() {
		String temptext = pdfReader.getTextFromFile();
		Scanner scanner = new Scanner(temptext);
		String alignedText = "";
		while (scanner.hasNext()) {
			alignedText += scanner.next();
		}
		System.out.println(alignedText);
	}

	/**
	 * @return the pdfToAnalyse
	 */
	public PDDocument getPdfToAnalyse() {
		return pdfToAnalyse;
	}

	/**
	 * @param pdfToAnalyse the pdfToAnalyse to set
	 */
	public void setPdfToAnalyse(PDDocument pdfToAnalyse) {
		this.pdfToAnalyse = pdfToAnalyse;
	}

	/**
	 * @return the pdfReader
	 */
	public PdfReader getPdfReader() {
		return pdfReader;
	}

	/**
	 * @param pdfReader the pdfReader to set
	 */
	public void setPdfReader(PdfReader pdfReader) {
		this.pdfReader = pdfReader;
	}
}
