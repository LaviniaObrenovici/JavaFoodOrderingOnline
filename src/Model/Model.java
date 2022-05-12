/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author lavin
 */
public class Model {
    
    public LinkedList citireFisier(String nume) {
        LinkedList L1 = new LinkedList();
        try {
            /* instantierea unui obiect de tip "FileInputStream" ce va permite citirea
                    * din fisierul al carui nume este dat de parametru constructorului */
            FileInputStream f = new FileInputStream(nume);
            /* instantierea unui stream de intrare auxiliar prin intermediul caruia
                    * se va realiza citirea din fisier */
            ObjectInputStream s = new ObjectInputStream(f);
            // se memoreaza continutul din stream-ul de intrare in containerul generic
            L1 = (LinkedList) s.readObject();
            // se inchide stream-ul de intrare
            s.close();
        } catch (IOException e1) {
            System.out.println("Eroare " + e1);
        } catch (ClassNotFoundException e1) {
            System.out.println("Eroare " + e1);
        }
        return L1;
    }
    
    public void scriereFisier(String numeFisier, LinkedList L1) {
        try {
            /* instantierea unui obiect de tip "FileOutputStream" ce va permite scrierea
                    * in fisierul al carui nume este dat de parametru constructorului */
            FileOutputStream f = new FileOutputStream(numeFisier);
            /* instantierea unui stream de iesire auxiliar prin intermediul caruia
                    * se va realiza scrierea in fisier */
            ObjectOutputStream s = new ObjectOutputStream(f);
            // se reinitializeaza continutul stream-ului de iesire 
            s.flush();
            // se adauga continutul containerului generic la stream-ul de iesire
            s.writeObject(L1);
            // se inchide stream-ul de iesire
            s.close();
        } catch (IOException e1) {
            System.out.println("Eroare " + e1);
        }
    }
    
    public LinkedList stergereElementLinkedList(LinkedList L, String selectie) {
        Iterator<Comanda> it = L.listIterator();
        // se parcurge lista de concurenti prin intermediul iteratorului
        while (it.hasNext()) {
            // se acceseaza obiectul curent si se afiseaza la iesirea standard informatii despre acesta
            Comanda p = it.next();
            if (p.afisare().equals(selectie)) {
                L.remove(p);
                break;
            }

        }
        return L;
        
    }
    
    public void adaugareComandaFisier(Comanda p) {

        LinkedList L1 = new LinkedList();
        L1 = citireFisier("comanda.dat");
        L1.add(p);
        scriereFisier("comanda.dat", L1);
    }
    
     public Comanda getElementLinkedList(LinkedList L, int index) {

        Comanda p = new Comanda();
        p = (Comanda) L.get(index);
        return p;
    }
    
}
