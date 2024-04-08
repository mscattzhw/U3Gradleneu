package u3;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class HelloPDFWorld {

	/**
	 */
	public static void main(String[] args) throws Exception {
            PDDocument helloPdf = new PDDocument();
            PDPage page = new PDPage(PDRectangle.A4);
            helloPdf.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(helloPdf, page);
            contentStream.beginText();
            contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 36);
            contentStream.newLineAtOffset(10, 100);
            contentStream.showText("PDF von Matteo Schärer!!!");
            contentStream.endText();
            contentStream.close();

            helloPdf.save(new File("Mein.pdf"));
            helloPdf.close();
	}

}
