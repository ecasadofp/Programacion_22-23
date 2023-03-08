package org.example;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class AccesoDOM {
    public static void main(String[] args) {

        ArrayList<Desayuno> menuDesayunos = leeDesayunos();
        for(Desayuno d:menuDesayunos )
            System.out.println(d);

    }

    public static ArrayList<Desayuno> leeDesayunos(){

        ArrayList<Desayuno> leidos = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse("src/main/resources/desayunos.xml");

            NodeList desayunos = documento.getElementsByTagName("food");
            System.out.println("Hay " + desayunos.getLength() + " desayunos distintos");
            for(int i = 0 ; i < desayunos.getLength(); i++){

                Node food = desayunos.item(i);
                NodeList hijos = food.getChildNodes();

                String nombre = hijos.item(1).getFirstChild().getNodeValue();
                String strPrecio =hijos.item(3).getFirstChild().getNodeValue();
                String descripcion = hijos.item(5).getFirstChild().getNodeValue();
                String strCalorias =hijos.item(7).getFirstChild().getNodeValue();

                double precio = Double.parseDouble(strPrecio.substring(1));
                int calorias = Integer.parseInt(strCalorias);

               leidos.add(new Desayuno(nombre, precio, descripcion, calorias));

            }

        } catch (ParserConfigurationException | SAXException e) {
            System.out.println("Problema de parseo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return leidos;
    }
}