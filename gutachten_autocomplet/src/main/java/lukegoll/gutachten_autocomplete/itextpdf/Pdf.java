package lukegoll.gutachten_autocomplete.itextpdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
import com.itextpdf.kernel.pdf.canvas.parser.filter.TextRegionEventFilter;
import com.itextpdf.kernel.pdf.canvas.parser.listener.FilteredTextEventListener;
import com.itextpdf.kernel.pdf.canvas.parser.listener.LocationTextExtractionStrategy;

import lukegoll.gutachten_autocomplete.filechooser.FileChooser;

public class Pdf {
	private File fileToRead;
	private String filePath;
	private String pathToSave;
	private String textFromFile;
	private FileChooser fileChooser = new FileChooser();

	public Pdf() {
		this.fileToRead = fileChooser.chooseFile();
		this.filePath = this.fileToRead.getAbsolutePath();

	}

	public Pdf(String string) {
		// TODO Auto-generated constructor stub
	}

	public void readPdfFile() throws IOException {
		StringBuffer buff = new StringBuffer();
		try {

			PdfReader reader = new PdfReader("/Users/lukegollenstede/Aufnahmebogen Kopie Kopie.pdf");
			PdfDocument doc = new PdfDocument(reader);
			Rectangle rec = new Rectangle(0, 650, 100, 100);
			TextRegionEventFilter filter = new TextRegionEventFilter(rec);
			FilteredTextEventListener eventlist = new FilteredTextEventListener(new LocationTextExtractionStrategy(),
					filter);

			int num = doc.getNumberOfPages();
			String str = PdfTextExtractor.getTextFromPage(doc.getPage(1), eventlist);
			System.out.println(str);
			System.out.println(doc.getPage(1).getPageSize());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the fileToRead
	 */
	public File getFileToRead() {
		return fileToRead;
	}

	/**
	 * @param fileToRead the fileToRead to set
	 */
	public void setFileToRead(File fileToRead) {
		this.fileToRead = fileToRead;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @return the pathToSave
	 */
	public String getPathToSave() {
		return pathToSave;
	}

	/**
	 * @param pathToSave the pathToSave to set
	 */
	public void setPathToSave(String pathToSave) {
		this.pathToSave = pathToSave;
	}

	/**
	 * @return the pdfToRead
	 */
	public PDDocument getPdfToRead() {
		return pdfToRead;
	}

	/**
	 * @param pdfToRead the pdfToRead to set
	 */
	public void setPdfToRead(PDDocument pdfToRead) {
		this.pdfToRead = pdfToRead;
	}

	/**
	 * @return the textFromFile
	 */
	public String getTextFromFile() {
		return textFromFile;
	}

	/**
	 * @param textFromFile the textFromFile to set
	 */
	public void setTextFromFile(String textFromFile) {
		this.textFromFile = textFromFile;
	}

}
