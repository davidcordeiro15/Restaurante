package com.restaurante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        Pedido pedido = new Pedido();
        Prato prato;
        Restaurante restaurante = new Restaurante();
        System.out.println("""
            ********************************************
                  Bem vindo ao Restaurante Viva Verde!
            ********************************************
            """);
        while (escolha != 3) {
           
            System.out.println("O que deseja fazer?\n1 - Fazer um pedido\n2 - Remover algum prato do pedido\n3 - Pedir a conta\n4 - Ver o pedido");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                int x = 1;
                while (x == 1) {
                    prato = new Prato();
                    System.out.println("""
                            Nossos pratos
                            1 - Salada Caesar - R$25,00
                            2 - Salada Grega - R$20,00
                            3 - Salada de Frutas - R$15,00
                            4 - Salada Caprese - R$20,00
                            """);
                    System.out.println("Digite seu prato escolhido: ");
                
                    switch(scanner.nextInt()){
                        case 1:
                            prato.setNome("Salada Caesar");
                            prato.setPreco(25);
                            prato.setDescricao("Alface, frango grelhado, croutons e molho Caesar.");
                            break;
                        case 2:
                            prato.setNome("Salada Grega");
                            prato.setPreco(20);
                            prato.setDescricao("Tomate, pepino, azeitonas, cebola e queijo feta.");
                            break;
                        case 3:
                            prato.setNome("Salada de Frutas");
                            prato.setPreco(15);
                            prato.setDescricao("Frutas variadas como maçã, uva, banana e laranja.");
                            break;
                        case 4:
                            prato.setNome("Salada Caprese");
                            prato.setPreco(20);
                            prato.setDescricao("Tomate, mussarela de búfala, manjericão e azeite.");
                            break; 
                        }

                    pedido.getListaDePratos().add(prato);
                    restaurante.adicionarPratos(prato);
                    System.out.println("Seu pedido foi feito!");
                    System.out.println("Deseja pedir mais alguma coisa?\n1 - Sim\n2 - Não");
                    x = scanner.nextInt();
                    scanner.nextLine();
                }
            } else if (escolha == 2) {
                if (pedido.getListaDePratos().isEmpty()) {
                    System.out.println("Não há pratos no pedido para remover.");
                } else {
                    int y = 1;
                    while (y == 1) {
                        System.out.println("Lista de pratos no pedido:");
                        List<Prato> pratos = pedido.getListaDePratos();
                        for (int i = 0; i < pratos.size(); i++) {
                            System.out.println(i + " - " + pratos.get(i).getNome());
                        }
                        System.out.println("Escolha o número do prato que deseja remover:");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < pratos.size()) {
                            pratos.remove(index);
                            System.out.println("Prato removido com sucesso!");
                        } else {
                            System.out.println("Opção inválida!");
                        }
                        System.out.println("Deseja remover mais algum prato?\n1 - Sim\n2 - Não");
                        y = scanner.nextInt();
                        scanner.nextLine();
                    }
                }
            } else if (escolha == 4) {
                if (pedido.getListaDePratos().isEmpty()) {
                    System.out.println("Não há pratos no pedido.");
                } else {
                    System.out.println("Seu pedido contém os seguintes pratos:");
                    for (Prato p : pedido.getListaDePratos()) {
                        System.out.println(p.getNome());
                    }
                }
            } else if (escolha != 3) {
                System.out.println("Opção inválida!");
            }
        }
        System.out.println("Total a pagar: R$" + restaurante.calculaPedido(pedido));
        System.out.println("Conta solicitada! Obrigado por comer conosco!");
    }
}
