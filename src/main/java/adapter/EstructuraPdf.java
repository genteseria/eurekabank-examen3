/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entidades.Sucursal;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jsmith
 */
public class EstructuraPdf {

    private ArrayList<Sucursal> lista;

    public void llenarInformacionPDF(ArrayList<Sucursal> lista) {
        this.lista = lista;
    }

    public boolean crearDocumentoPDF() {
        boolean estado = false;
        try {

            if (new File("documento.pdf").exists()) {
                new File("documento.pdf").delete();
            }
            estado = true;
        } catch (Exception e) {
        }
        return estado;
    }

    public void escribirDocumentoPDF() {
        try {
            String ruta = "documento.pdf";
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));

            Image header = Image.getInstance("src/main/res/pdfheader.png");
            header.scaleToFit(600, 900);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte generado por EurekaBank Manager v0.0.2 \n\n");
            parrafo.setFont(FontFactory.getFont("Sitka Text", 16, Font.BOLD, BaseColor.RED));
            parrafo.add("Lista de sucursales \n\n");
            parrafo.add("\n");
            documento.open();

            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabla.setWidthPercentage(100);
            //Datos del ancho de cada columna.
            tabla.setWidths(new float[]{12, 16, 15, 30, 14, 14});

            tabla.addCell(new Paragraph("CÓDIGO", FontFactory.getFont("Sitka Text", 12, Font.BOLD, BaseColor.BLACK)));
            tabla.addCell(new Paragraph("NOMBRE", FontFactory.getFont("Sitka Text", 12, Font.BOLD, BaseColor.BLACK)));
            tabla.addCell(new Paragraph("CIUDAD", FontFactory.getFont("Sitka Text", 12, Font.BOLD, BaseColor.BLACK)));
            tabla.addCell(new Paragraph("DIRECCION", FontFactory.getFont("Sitka Text", 12, Font.BOLD, BaseColor.BLACK)));
            tabla.addCell(new Paragraph("CUENTAS", FontFactory.getFont("Sitka Text", 12, Font.BOLD, BaseColor.BLACK)));
            tabla.addCell(new Paragraph("EMPLEADOS", FontFactory.getFont("Sitka Text", 12, Font.BOLD, BaseColor.BLACK)));

            for (int i = 0; i < lista.size(); i++) {
                tabla.addCell(lista.get(i).getCodigo());
                tabla.addCell(lista.get(i).getNombre());
                tabla.addCell(lista.get(i).getCiudad());
                tabla.addCell(lista.get(i).getDireccion());
                tabla.addCell(String.valueOf(lista.get(i).getEmplcont()));
                tabla.addCell(String.valueOf(lista.get(i).getContcuenta()));
            }

            documento.add(tabla);
            documento.close();
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
            System.err.println("Error en el documento");
        }

    }

    public boolean abrirPdf() {
        boolean estado = false;
        try {
            JOptionPane.showMessageDialog(null, "Abriendo pdf...", "Mensaje", 1);
            String url = "documento.pdf";
            ProcessBuilder p = new ProcessBuilder();
            if (System.getProperty("os.name").contains("Windows")) {
                p.command("cmd.exe", "/c", url);
            } else if (System.getProperty("os.name").contains("Mac")) {
                p.command("open", url);
            } else {
                p.command("xdg-open", url);
            }
            p.start();
            estado = true;
        } catch (HeadlessException | IOException e) {
            System.err.println("Error al abrir el pdf");
        }
        return estado;
    }

    public void imprimirPDF() {
        System.out.println("*se imprime*");
    }

}
