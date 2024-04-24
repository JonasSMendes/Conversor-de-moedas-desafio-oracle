package br.com.JonasSmendes.principal;


import br.com.JonasSmendes.models.CalculoDeConversao;
import br.com.JonasSmendes.models.MenuDeOpcoes;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        CalculoDeConversao calculoDeConversao = new CalculoDeConversao();

        Map<Integer, String[]> opcoesMenu = MenuDeOpcoes.getMenuOptions();

        MenuDeOpcoes menuDeOpcoes = new MenuDeOpcoes();
        String textoMenu = menuDeOpcoes.Menutexto();

        System.out.println(textoMenu);
        System.out.println("digite o numero que deseja: ");
        int menu = scanner.nextInt();
        scanner.nextLine();

        while (menu != 7){

            if (opcoesMenu.containsKey(menu)) {
                String[] moedas = opcoesMenu.get(menu);
                calculoDeConversao = calculoDeConversao.urlCustomizada(moedas[0], moedas[1]);
                System.out.println("quanto deseja converter?");
                int valorDeConversao = scanner.nextInt();
                calculoDeConversao.calculo(valorDeConversao);
                System.out.println("valor de " + valorDeConversao + "[" + moedas[0] + "] " + " Corresponde ao valor convertido de ===> " + calculoDeConversao.getValor() +  "[" + moedas[1] + "] ");
            } else {
                System.out.println("Opção inválida!");
            }


            System.out.println(textoMenu);
            System.out.println("digite o numero que deseja:");
            menu = scanner.nextInt();

        }

        System.out.println("saindo...");

    }
}