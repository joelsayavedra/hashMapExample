/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashmap;

import java.util.HashMap;

/**
 *
 * @author JEST
 */
public class HashMapExample {
    public static void main(String[] args) {
        String pais = "Peru";

        final Chile paisChile = new Chile();
        final Colombia paisColombia = new Colombia();
        final Peru paisPeru = new Peru();

        HashMap<String, Country> paises = new HashMap<String, Country>();
        paises.put("Chile", paisChile);
        paises.put("Colombia", paisColombia);
        paises.put("Peru", paisPeru);

        paises.get(pais).saluda();
    }
}
