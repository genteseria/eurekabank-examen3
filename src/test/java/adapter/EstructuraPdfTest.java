/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import entidades.Sucursal;
import java.io.File;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author deerfox@debian
 */

public class EstructuraPdfTest {
    
    ArrayList<Sucursal> lista = new ArrayList();
    
    public EstructuraPdfTest() {
    }
    
    @AfterAll
    public static void tearDownClass() {
        new File("documento.pdf").delete();
    }

    /**
     * Test of llenarInformacionPDF method, of class EstructuraPdf.
     */
    @Test
    public void testLlenarInformacionPDF() {
        System.out.println("Llenando Informacion PDF...");
        ArrayList<Sucursal> lista = this.lista;
        EstructuraPdf instance = new EstructuraPdf();
        instance.llenarInformacionPDF(lista);
    }

    /**
     * Test of crearDocumentoPDF method, of class EstructuraPdf.
     */
    @Test
    public void testCrearDocumentoPDF() {
        System.out.println("Creando Documento PDF...");
        EstructuraPdf instance = new EstructuraPdf();
        instance.llenarInformacionPDF(lista);
        boolean result = instance.crearDocumentoPDF();
        assertTrue(result);
    }

    /**
     * Test of escribirDocumentoPDF method, of class EstructuraPdf.
     */
    @Test
    public void testEscribirDocumentoPDF() {
        System.out.println("Escribiendo Documento PDF...");
        EstructuraPdf instance = new EstructuraPdf();
        instance.llenarInformacionPDF(lista);
        instance.escribirDocumentoPDF();
    }

    /**
     * Test of abrirPdf method, of class EstructuraPdf.
     */
    @Test
    public void testAbrirPdf() {
        System.out.println("Abriendo PDF...");
        EstructuraPdf instance = new EstructuraPdf();
        instance.llenarInformacionPDF(lista);
        instance.crearDocumentoPDF();
        instance.escribirDocumentoPDF();
        boolean result = instance.abrirPdf();
        assertTrue(result);
    }

    /**
     * Test of imprimirPDF method, of class EstructuraPdf.
     */
    @Test
    public void testImprimirPDF() {
        System.out.println("imprimirPDF");
        EstructuraPdf instance = new EstructuraPdf();
        instance.imprimirPDF();
    }
    
}
