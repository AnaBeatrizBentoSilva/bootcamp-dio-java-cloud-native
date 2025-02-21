public class ContadorBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if (numero == 4) {
                break;
            }
            if (numero == 2) {
                continue;
            }
            System.out.println(numero);
        }
    }
}
