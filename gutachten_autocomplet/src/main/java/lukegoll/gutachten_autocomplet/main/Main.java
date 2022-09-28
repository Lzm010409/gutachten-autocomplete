package lukegoll.gutachten_autocomplet.main;

import java.io.IOException;

import lukegoll.gutachten_autocomplet.pdf.PdfAnalyser;
import lukegoll.gutachten_autocomplet.pdf.PdfReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		PdfReader pdf=new PdfReader();
		pdf.readPdfFile();
		pdf.strippPdf();
		
		PdfAnalyser pdfa=new PdfAnalyser();
		
		pdfa.setPdfReader(pdf);
		pdfa.alignText();
		

	}
}
