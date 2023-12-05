/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accesosax;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author luis
 */
class AccesoXMLSAX {
    private SAXParser parser;
    
    public int parsearXMLconLibrosSaxHandler(File f){
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            LibrosSaxHandler librosSaxHandler = new LibrosSaxHandler();
            parser.parse(f, librosSaxHandler);
            return 0;
        }catch (ParserConfigurationException e){
            System.err.println("Error de configuración del parser: " + e.getMessage());
            return -1;
        } catch (SAXException | IOException ex) {
            Logger.getLogger(AccesoXMLSAX.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
