package com.restaurante;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaRestauranteTest {

    private Restaurante restaurante;
    private Pedido pedido;
    private Prato prato;

    @BeforeEach
    void setUp() {
        restaurante = new Restaurante();
        pedido = new Pedido();
        prato = new Prato();
        pedido.setListaDePratos(new ArrayList<>());
    }

    @Test
    void testFazerPedido() {
        prato.setNome("Salada Caesar");
        prato.setPreco(25);
        prato.setDescricao("Alface, frango grelhado, croutons e molho Caesar.");

        pedido.getListaDePratos().add(prato);
        restaurante.adicionarPratos(prato);

        assertEquals(1, pedido.getListaDePratos().size(), "O número de pratos no pedido não está correto.");
        assertEquals("Salada Caesar", pedido.getListaDePratos().get(0).getNome(), "O nome do prato não corresponde.");
    }

    @Test
    void testRemoverPratoDoPedido() {
        prato.setNome("Salada Grega");
        prato.setPreco(20);
        prato.setDescricao("Tomate, pepino, azeitonas, cebola e queijo feta.");

        pedido.getListaDePratos().add(prato);
        restaurante.adicionarPratos(prato);

        List<Prato> pratos = pedido.getListaDePratos();
        pratos.remove(0);

        assertEquals(0, pratos.size(), "O prato não foi removido corretamente.");
    }

    @Test
    void testVerPedido() {
        prato.setNome("Salada Caprese");
        prato.setPreco(20);
        prato.setDescricao("Tomate, mussarela de búfala, manjericão e azeite.");

        pedido.getListaDePratos().add(prato);
        restaurante.adicionarPratos(prato);

        assertFalse(pedido.getListaDePratos().isEmpty(), "O pedido deveria conter um prato.");
        assertEquals("Salada Caprese", pedido.getListaDePratos().get(0).getNome(), "O nome do prato não corresponde.");
    }

    @Test
    void testPedirConta() {
        prato.setNome("Salada de Frutas");
        prato.setPreco(15);
        prato.setDescricao("Frutas variadas como maçã, uva, banana e laranja.");

        pedido.getListaDePratos().add(prato);
        restaurante.adicionarPratos(prato);

        float total = restaurante.calculaPedido(pedido);

        assertEquals(15, total, 0.01, "O cálculo do pedido não está correto.");
    }
}
