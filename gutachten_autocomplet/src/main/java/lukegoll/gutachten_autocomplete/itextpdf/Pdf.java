package lukegoll.gutachten_autocomplete.itextpdf;

import java.io.File;
import java.io.IOException;

import com.itextpdf.kernel.exceptions.PdfException;
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
	private PdfDocument pdfToRead;
	private FileChooser fileChooser = new FileChooser();

	public Pdf() {
		this.fileToRead = fileChooser.chooseFile();
		this.filePath = this.fileToRead.getAbsolutePath();

	}

	public Pdf(String string) {
		// TODO Auto-generated constructor stub
	}

	public void readPdfFile() throws PdfException {
		StringBuffer buff = new StringBuffer();
		try {
			PdfReader reader = new PdfReader(fileToRead);
			pdfToRead = new PdfDocument(reader);

			int num = pdfToRead.getNumberOfPages();
			for (int i = 0; i < num; i++) {
				String str = PdfTextExtractor.getTextFromPage(pdfToRead.getPage(i));
				buff.append(str + "/n");

			}
			textFromFile = buff.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closePdfFile() throws PdfException {
		try {
			pdfToRead.close();
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

	/**
	 * @return the pdfToRead
	 */
	public PdfDocument getPdfToRead() {
		return pdfToRead;
	}

	/**
	 * @param pdfToRead the pdfToRead to set
	 */
	public void setPdfToRead(PdfDocument pdfToRead) {
		this.pdfToRead = pdfToRead;
	}

}
