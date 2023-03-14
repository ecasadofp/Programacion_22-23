package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.ArrayList;

public class CrearXML {
    public static void main(String[] args) {

    ArrayList<Coche> coches = new ArrayList<>();

    coches.add(new Coche("Ford", "Mustang", 500, "nuevo"));
    coches.add(new Coche("Chevrolet", "Camaro", 600, "usado"));
    coches.add(new Coche("Toyota", "Corolla", 150, "chatarra"));


        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.newDocument();
            Node root = documento.createElement("coches");
            documento.appendChild(root);

            for(Coche c:coches){

                Node coche = documento.createElement("coche");
                Node marca = documento.createElement("marca");
                Node modelo = documento.createElement("modelo");
                Node cv = documento.createElement("cv");

                System.out.println("Vamos con un coche");

                root.appendChild(coche);

                //Añadimos un atributo al coche. Solo se puede añadir a Element, no a node

                ((Element)coche).setAttribute("estado", c.getEstado());
                coche.appendChild(marca);
                marca.appendChild(documento.createTextNode(c.getMarca()));
                coche.appendChild(modelo);
                modelo.appendChild(documento.createTextNode(c.getModelo()));
                coche.appendChild(cv);
                cv.appendChild(documento.createTextNode(String.valueOf(c.getCv())));

                TransformerFactory tf = TransformerFactory.newInstance();
                Transformer transformer = tf.newTransformer();

                transformer.setOutputProperty(OutputKeys.INDENT ,"yes");

                transformer.transform(new DOMSource(documento),new StreamResult("coches.xml"));
            }

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
