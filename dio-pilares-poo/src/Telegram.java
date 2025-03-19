

public class Telegram extends ServicoMensagemInstantea {
   @Override
    public void enviarMensagem() {
          validarConectadoInternet();
          System.out.println("Enviando mensagem pelo Telegram");
    }
    @Override
    public void receberMensagem() {
         System.out.println("Recebendo mensagem pelo Telegram");
    }
    
}
