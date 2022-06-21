/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21hugopdf;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
/**
 *
 * @author Lecona
 */
public class G4s21HugoLeconaPDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PdfWriter pdfwriter = null;
        // TODO code application logic here
        String nombrearch = "HugoLEcona.pdf";
        File file = new File(nombrearch);
        pdfwriter = new PdfWriter(file);
        String cadena = "Chappie11";
        PdfDocument pdfDocument = new PdfDocument(pdfwriter);
        Document document = new Document(pdfDocument);
        Paragraph paragraph = new Paragraph("");
        document.add(paragraph);
        paragraph = new Paragraph(cadena);
        document.add(paragraph);
        PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
        cadena = paragraph +
                "Hola Soy Alumno del Teso \n" = new Paragraph(cadena);
        paragraph.setFont(font);
        Color myColor = new DeviceRgb (200, 100, 10);
        paragraph.setFontColor(myColor);
        paragraph.setFirstLineIndent(100);
        paragraph.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
        document.add(paragraph);
        pdfDocument.close();
        pdfwriter.close(); 
        
    
    }
    
}
