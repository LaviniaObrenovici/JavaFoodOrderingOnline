package Model;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lavin
 */
public abstract class Telefon implements Serializable {
    protected int tel;

    public Telefon() {
        tel=0;
    }

    public Telefon (int tel) {
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

     
    
}
