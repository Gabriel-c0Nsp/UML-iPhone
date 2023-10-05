package application;

import iPhone.*;

public class Main {
  public static void main(String[] args) {
    
    IPhone iPhone = new IPhone();

    iPhone.tocar();
    iPhone.pausar();
    iPhone.iniciarMusica();

    System.out.println();

    iPhone.ligar();
    iPhone.atender();
    iPhone.iniciarCorreioVoz();

    System.out.println();

    iPhone.exibirPagina();
    iPhone.adicionarNovaAba();
    iPhone.atualizarPagina();
  }
}
