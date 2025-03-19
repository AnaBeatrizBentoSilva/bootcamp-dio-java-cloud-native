//Herança
//Polimorfismo

import java.util.Scanner;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantea smi = null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um aplicativo (msn, fbm, tlg): ");
        String appEscolhido = scanner.nextLine(); 


        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
