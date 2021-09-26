/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adapter;

import entidades.Sucursal;
import java.util.ArrayList;

/**
 *
 * @author Jsmith
 */
public class DocumentoPdf implements Documento{
    protected EstructuraPdf estructuraPdf = new EstructuraPdf();
    
    @Override
    public void llenarInformacion(ArrayList<Sucursal> lista) {
        estructuraPdf.llenarInformacionPDF(lista);
    }

    @Override
    public boolean crearDocumento() {
        boolean estado;
        estado = estructuraPdf.crearDocumentoPDF();
        estructuraPdf.escribirDocumentoPDF();
        return estado;
    }

    @Override
    public boolean abrirDocumento() {
        return estructuraPdf.abrirPdf();
    }

    @Override
    public boolean imprimir() {
        return true;
    }



}
