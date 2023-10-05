package iPhone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  
  // de ReprodutorMusical
  @Override
  public void tocar() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música");
  }

  @Override
  public void iniciarMusica() {
    System.out.println("Iniciando música");
  }

  // de AparelhoTelefonico
  @Override
  public void ligar() {
    System.out.println("Ligando...");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  // de NavegadorInternet
  @Override 
  public void exibirPagina() {
    System.out.println("Exibindo página");
  }

  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }
}
