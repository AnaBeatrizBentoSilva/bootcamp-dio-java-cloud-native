public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(- numero);
        numero = - numero;
        System.out.println(numero);
        // numero = + numero; -> não torna positivo
        numero = numero * -1;
        System.out.println(numero);

        System.out.println(-- numero);
        System.out.println(numero --);
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
    }
}
