package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.io.IOException;

public class AccesoCoches {

    public static void main(String[] args) {

        try {
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document documento = db.parse("coches.xml");

            Node root = documento.getFirstChild();

            System.out.println("El hijo del nodo documento se debería llamar coches y se llama " + root.getNodeName());

            /* La gracia sería comentar y descomentar la línea
            *  transformer.setOutputProperty(OutputKeys.INDENT ,"yes");
            *  de CrearXML.java para comprobar como cambia el número de nodos
            *  al tomar los de texto que se generan con los espacios en
            *  blanco de las indentaciones
            */

            NodeList nodosCoche = ((Element)root).getElementsByTagName("coche");


            System.out.println("Hay " + nodosCoche.getLength() + " elementos coche");

            NodeList hijosRoot = root.getChildNodes();

            System.out.println("Hay " + hijosRoot.getLength() + " hijos de coches");

            System.out.println("Recordemos los números de las constantes de los tipos de Node");

            System.out.println("Element-> " + Node.ELEMENT_NODE);
            System.out.println("Attribute-> "+ Node.ATTRIBUTE_NODE);
            System.out.println("Text-> " + Node.TEXT_NODE);

            for(int i = 0; i < hijosRoot.getLength(); i++){

                Node nodoActual = hijosRoot.item(i);
                if(nodoActual.getNodeType()!=Node.ELEMENT_NODE)
                    continue;

           //     System.out.println(nodoActual.getNodeType());

                System.out.println(((Element)nodoActual).getAttribute("estado"));
            }

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }

    }

}
