import java.util.concurrent.ThreadLocalRandom;

public class LojaDoceWhile {
    public static void main(String[] args) {
        double mesada = 50.00;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }       
            System.out.println("Valor do doce: R$ " + String.format("%.2f", valorDoce) + " adicionado no carrinho");
            mesada = mesada - valorDoce;     
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);    }
}
