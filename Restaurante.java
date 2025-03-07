import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Prato> pratos = new ArrayList<>(); 
    private List<Pedido> pedidos = new ArrayList<>(); 

    public List<Prato> getPratos(){
        return pratos; 
    }

    public List<Pedido> getPedidos(){
        return pedidos; 
    }
          
    public void adicionarPratos(Prato prato){
        pratos.add(prato); 
        System.out.println("Prato adicionado: "+ prato);
    }

    public void removePratos(Prato prato){
        pratos.remove(prato);
        System.out.println("Prato removido: "+ prato);
    }

    public void novoPedido(Pedido pedido){
        pedidos.add(pedido);
        System.out.println("Pedido adicionado: "+pedidos); // Fazer a lista apresentar 
    }
}
