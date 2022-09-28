package lukegoll.gutachten_autocomplet.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import lukegoll.gutachten_autocomplet.filechooser.FileChooser;

public class PdfReader {
	private File fileToRead;
	private String filePath;
	private String pathToSave;
	private PDDocument pdfToRead;
	private PDFTextStripper pdfStripper;
	private String textFromFile;
	private FileChooser fileChooser = new FileChooser();

	public PdfReader() {
		this.fileToRead = fileChooser.chooseFile();
		this.filePath = this.fileToRead.getAbsolutePath();

	}

	public void readPdfFile() throws IOException {
		try {
			pdfToRead = PDDocument.load(fileToRead);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fehler");
		}
	}

	public void closePdfFile() throws IOException {
		try {
			this.pdfToRead.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void strippPdf() throws IOException {
		try {
			pdfStripper = new PDFTextStripper();
			textFromFile = pdfStripper.getText(pdfToRead);
			System.out.println(textFromFile);
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
