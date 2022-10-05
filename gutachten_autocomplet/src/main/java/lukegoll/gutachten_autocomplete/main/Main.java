package lukegoll.gutachten_autocomplete.main;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
import com.itextpdf.kernel.pdf.canvas.parser.filter.TextRegionEventFilter;
import com.itextpdf.kernel.pdf.canvas.parser.listener.FilteredTextEventListener;
import com.itextpdf.kernel.pdf.canvas.parser.listener.LocationTextExtractionStrategy;

import lukegoll.gutachten_autocomplete.itextpdf.Coordinates;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Main {

	public static void main(String[] args) throws IOException, TesseractException {
		Coordinates behvorschaden = Coordinates.BEHVORSCHADEN;
		PdfReader reader = new PdfReader("/Users/lukegollenstede/Aufnahmebogen Kopie Kopie.pdf");
		PdfDocument doc = new PdfDocument(reader);
		Rectangle rec = new Rectangle(behvorschaden.getFirst(), behvorschaden.getSecond(), behvorschaden.getThird(),
				behvorschaden.getFourth());
		TextRegionEventFilter filter = new TextRegionEventFilter(rec);
		FilteredTextEventListener eventlist = new FilteredTextEventListener(new LocationTextExtractionStrategy(),
				filter);

		String result = PdfTextExtractor.getTextFromPage(doc.getPage(1), eventlist);
		System.out.println(result);

	}

}
