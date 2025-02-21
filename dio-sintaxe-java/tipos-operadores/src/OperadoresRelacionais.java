public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Ana";
        String nomeDois = new String("Ana");
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a numeroDois?"+ simNao);

        boolean simNaoo = numero1 != numero2;
        System.out.println("NumeroUm é diferente a numeroDois?"+ simNaoo);

        boolean simmNao = numero1 > numero2;
        System.out.println("NumeroUm é maior que numeroDois?"+ simmNao);

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");
        
        if(numero1 < numero2)
            System.out.print("Numero 2 maior que numero 1");
    }
}
