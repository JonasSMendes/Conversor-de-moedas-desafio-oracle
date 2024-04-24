package br.com.JonasSmendes.models;

import java.util.HashMap;
import java.util.Map;

public class MenuDeOpcoes {
    public static Map<Integer, String[]> getMenuOptions() {
        Map<Integer, String[]> opcoesMenu = new HashMap<>();
        opcoesMenu.put(1, new String[]{"USD", "ARS"});
        opcoesMenu.put(2, new String[]{"ARS", "USD"});
        opcoesMenu.put(3, new String[]{"USD", "BRL"});
        opcoesMenu.put(4, new String[]{"BRL", "USD"});
        opcoesMenu.put(5, new String[]{"USD", "COP"});
        opcoesMenu.put(6, new String[]{"COP", "USD"});
        return opcoesMenu;
    }

    public String Menutexto(){

        String textoMenu = """
                    ****************************************************
                    
                    Seja Bem-vindo ao conversor de moedas :)
                    
                    1) Dollar ==> Peso argentino
                    2) Peso argentino ==> Dolar
                    3) Dolar ==> Real brasileiro
                    4) Real brasileiro ==> Dolar
                    5) Dolar ==> Peso colombiano
                    6) Peso colombiano ==> Dolar
                    7) sair
                    
                    Escolha uma opção valida:
                    
                    ****************************************************
                """;

        return textoMenu;
    }
}
