package com.restaurante;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Prato> pratos = new ArrayList<>(); 
    private List<Pedido> pedidos = new ArrayList<>(); 
    private float totalPedido;
    public List<Prato> getPratos(){
        return pratos; 
    }

    public List<Pedido> getPedidos(){
        return pedidos; 
    }
          
    public void adicionarPratos(Prato prato){
        pratos.add(prato); 
        ;
    }

    public void removePratos(Prato prato){
        pratos.remove(prato);
        System.out.println("Prato removido: "+ prato);
    }

    
    public void novoPedido(Pedido pedido){
        pedidos.add(pedido);
        System.out.println("Pedido adicionado: "+ pedido);  
    }

   
    public Float calculaPedido(Pedido pedido){
        List<Prato> listaPedido = new ArrayList<>(); 
        listaPedido = pedido.getListaDePratos(); 
         
        for(int i = 0; i < listaPedido.size(); i++){
            totalPedido += listaPedido.get(i).getPreco();
        }
        return totalPedido; 
    }

    
}
