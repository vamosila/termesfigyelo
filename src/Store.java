/*
* File: Store.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: I-N
* Date: 2025-03-03
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public ArrayList<Termes> readFile() {

        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            return null;
        }
    }
    private ArrayList<Termes> tryReadFile() throws FileNotFoundException {
        ArrayList<Termes> termesLista = new ArrayList<>();
        File file = new File("termes.txt");
        try(Scanner sc = new Scanner(file, "utf8")){
            sc.nextLine();
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                // System.out.println(line);
                String[] arr = line.split(":");
                Termes termes = new Termes();
                termes.setId(Integer.parseInt(arr[0]));
                termes.setNev(arr[1]);
                termes.setDulo(arr[2]);
                termes.setMennyiseg(Integer.parseInt(arr[3]));
                termes.setVege(LocalDate.parse(arr[4]));
                termesLista.add(termes);

                // System.out.println(termes.getId());
                // System.out.println(termes.getDulo());
                // System.out.println(termes.getMennyiseg());
                // System.out.println(termes.getVege());
            }
        }
        return termesLista;
    }
}
