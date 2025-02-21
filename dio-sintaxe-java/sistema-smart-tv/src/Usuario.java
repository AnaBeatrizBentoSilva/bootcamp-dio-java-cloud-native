public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.mudarCanal(5);
        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);

        System.out.println("TV Ligada? " + smartTV.ligada);
    
        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);

    }
}
