/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.accesosax;

import java.io.File;

/**
 *
 * @author luis
 */
public class UsaAccesoXmlSax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("Libros.xml");
        AccesoXMLSAX accesoXMLSAX = new AccesoXMLSAX();
        try {
            accesoXMLSAX.parsearXMLconLibrosSaxHandler(f);
        } catch (Exception e) {
        }
    }
    
}
