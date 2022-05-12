/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Lavin
 */
public class Comanda implements Serializable
{
    private String nume,adresa, comanda;
    private int tel;

    public Comanda() 
    {
        nume="";
        tel=0;
        adresa="";
        comanda="";
    }

    public Comanda(String nume, int tel, String adresa, String comanda) 
    {
        this.nume = nume;
        this.tel = tel;
        this.adresa = adresa;
        this.comanda = comanda;
    }
     public Comanda(Comanda p) 
     {
        this.nume = p.nume;
        this.tel = p.tel;
        this.adresa = p.adresa;
        this.comanda = p.comanda;
    }

        public Comanda(String n, String adr, String cmd) 
        {
       this.nume = n;
       
        this.adresa = adr;
        this.comanda = cmd;
    }


    public String getNume() 
    {
        return nume;
    }

    public int getTel() 
    {
        return tel;
    }

    public String getAdresa() 
    {
        return adresa;
    }
    
    public String getComanda() 
    {
        return comanda;
    }

    public void setNume(String nume) 
    {
        this.nume = nume;
    }

    public void setTel(int tel) 
    {
        this.tel = tel;
    }

    public void setAdresa(String adresa) 
    {
        this.adresa = adresa;
    }
    
    public void setComanda(String comanda)
    {
        this.comanda = comanda;
    }

    
    public String afisare() {
        return "Comanda:" + "nume=" + nume + ", telefon=" + tel + ", adresa=" + adresa+"comanda"+comanda;
    }
     
     
}
