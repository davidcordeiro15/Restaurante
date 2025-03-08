package com.restaurante;
import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private int numeroPedido;
    private String cliente;
    private List<Prato> listaDePratos;
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public Pedido() {
        this.listaDePratos = new ArrayList<>();
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public List<Prato> getListaDePratos() {
        return listaDePratos;
    }
    public void setListaDePratos(List<Prato> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }
    @Override
    public String toString() {
        return "Pedido [numeroPedido=" + numeroPedido + ", cliente=" + cliente + ", listaDePratos=" + listaDePratos
                + "]";
    }


    

}