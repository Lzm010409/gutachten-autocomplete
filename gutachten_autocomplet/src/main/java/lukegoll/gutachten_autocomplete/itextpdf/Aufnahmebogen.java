package lukegoll.gutachten_autocomplete.itextpdf;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.List;

import lukegoll.gutachten_autocomplete.fall.Kunde;

public class Aufnahmebogen extends UniversalDatei {

	public Aufnahmebogen() {
		// this.fileToRead = fileChooser.chooseFile();
		// this.filePath = this.fileToRead.getAbsolutePath();
	}

	public void writeInformationToKunde(Kunde kunde) throws Exception {
		try {

			readFile(ReadCoordinates.AS);
			String tempString = textFromFile;
			String[] asArr = tempString.split("\\r?\\n");
			for (int i = 0; i < asArr.length; i++) {
				System.out.println(asArr[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
