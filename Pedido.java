import java.util.List;

public class Pedido{
    private int numeroPedido;
    private String cliente;
    private List<String> listaDePratos;
    public int getNumeroPedido() {
        return numeroPedido;
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
    public List<String> getListaDePratos() {
        return listaDePratos;
    }
    public void setListaDePratos(List<String> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }
    @Override
    public String toString() {
        return "Pedido [numeroPedido=" + numeroPedido + ", cliente=" + cliente + ", listaDePratos=" + listaDePratos
                + "]";
    }


    

}