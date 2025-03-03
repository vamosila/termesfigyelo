/*
* File: Solution.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: I-N
* Date: 2025-03-03
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/


import java.util.ArrayList;

public class Solution {

    Store store = new Store();
    ArrayList<Termes> termesLista = store.readFile();
    
    public void kiirBuza() {

        int szamlalo = 0;
        for( Termes termes : termesLista ) {
            if(termes.getNev().equals("búza")) {
                szamlalo++;
            }
        }
        System.out.printf("Hányszor szerepel a búza: %d \n", szamlalo);

    }

    public void kiirBuzaMennyiseg() {
        
        int osszeg = 0;
        for( Termes termes : termesLista ) {
            if(termes.getNev().equals("búza")) {
                osszeg = osszeg + termes.getMennyiseg();
            }
        }
        System.out.printf("Hányszor q búza: %d \n", osszeg);

    }
     
}
