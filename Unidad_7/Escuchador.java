package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Escuchador extends DefaultHandler {

    int caloriasTotales = 0;
    String texto;
   // String qnameActual;
    @Override
    public void startDocument() throws SAXException {
     //   System.out.println("Empieza el documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
     //   System.out.println("Elemento encontrado: <" + qName );

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        texto = new String(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if(qName.equals("calories")){

            int calorias = Integer.parseInt(texto);
            caloriasTotales += calorias;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Las calorias totales son " + caloriasTotales);
    }
}
