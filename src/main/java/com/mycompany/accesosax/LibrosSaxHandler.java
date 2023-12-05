/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accesosax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author luis
 */
public class LibrosSaxHandler extends DefaultHandler{
    private int contador=0;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        String car = new String(ch, start, length).trim();
        car = car.replaceAll("\t", ""); // quita todos los tabuladores
        car = car.replaceAll("\n", "");
        System.out.print(car);
     
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
        if (qName.equals("Libro")) {
            System.out.println("\n-----------------------");
        }      
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
        if (qName.equals("Libros")){
            System.out.println("Listado de libros:");
            System.out.println("\n-----------------------");
        }
        else if (qName.equals("Libro")) {
            contador++;
            System.out.println("Libro "+contador);
            System.out.println("Publicado en: " + attributes.getValue(attributes.getQName(0)));//extrae el primer atributo

        } else if (qName.equals("Titulo")) {
            System.out.print("\n " + "El titulo es: ");//aún no sabemos cúales el título, eso lo sabremos en el evento characters
        } 
        if (qName.equals("Autor")) {
            System.out.print("\n " + "El autor es: ");
        }
    }
}
