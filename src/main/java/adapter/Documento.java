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
 * @author HP
 */
public interface Documento {
    
    public void llenarInformacion(ArrayList<Sucursal> lista);
    public boolean crearDocumento();
    public boolean abrirDocumento();
    public boolean imprimir();
    
}
