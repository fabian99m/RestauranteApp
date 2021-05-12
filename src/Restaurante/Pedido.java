/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Pedido implements Serializable{
    
 private List<Plato> platito= new ArrayList();
 private List<Producto> produc = new ArrayList();

    public Pedido() {
    }

 
    public List<Plato> getPlatito() {
        return platito;
    }

    public void setPlatito(List<Plato> platito) {
        this.platito = platito;
    }

    public List<Producto> getProduc() {
        return produc;
    }

    public void setProduc(List<Producto> produc) {
        this.produc = produc;
    }

 
}
