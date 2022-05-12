/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LogIn;
import View.Meniu;
import View.Restaurant;
import Model.Model;
import Model.Comanda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JTextField;

/**
 *
 * @author lavin
 */
public class Controller 
{
   

    private Restaurant view;
    private Model model;

    public Controller(Restaurant view, Model model) {
        this.view = view;
        this.model = model;
        this.view.EvenimentButon(new Eveniment());

    }

    class Eveniment implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == view.getAdaugareButon()) {
                String n, adr, cmd;
                int tel = 0;

                n = view.getNume().getText();
                adr = view.getAdresa().getText();
                cmd = view.getComanda().getText();
                
                if (n.isEmpty() || adr.isEmpty() || cmd.isEmpty() || tel == 0) {
                    view.afiseazaMesaj("Nu ati introdus datele corect");
                } else 
                {
                    Comanda p = new Comanda(n, adr, cmd);
                    model.adaugareComandaFisier(p);
                    view.afiseazaMesaj("Adaugare efectuata");
                    view.resetareJTextField(view.getNume());
                    view.resetareJTextField(view.getTel());
                    view.resetareJTextField(view.getAdresa());
                    view.resetareJTextField(view.getComanda());
                    

                }
            }  else if (e.getSource() == view.getVizualizareButon()) {
                LinkedList<Comanda> L = model.citireFisier("Comanda.dat");
                view.getLista().removeAll();
                Comanda p = new Comanda();
                for (int i = 0; i < L.size(); i++) {
                    p = model.getElementLinkedList(L, i);
                    view.getLista();

                }
                
} else if (e.getSource() == view.getStergereButon()) {
                LinkedList L1 = new LinkedList();
                L1 = model.citireFisier("comanda.dat");
                String selectie = view.getLista().getSelectedItem();
                int selectat = view.getLista().getSelectedIndex();

                // se trateaza cazul cand s-a selectat o inregistrare din componenta grafica de tip lista
                if (selectat >= 0) {
                    L1 = model.stergereElementLinkedList(L1, selectie);
                    model.scriereFisier("comanda.dat", L1);
                    view.getLista().removeAll();
                    LinkedList<Comanda> L = model.citireFisier("Comanda.dat");
                    Comanda p = new Comanda();
                    for (int i = 0; i < L.size(); i++) 
                    {
                        p = model.getElementLinkedList(L, i);
                        view.getLista().add(p.toString());

                    }
                    
                }
                
}
            
        }
        
    }
    
}

    