public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultadoString = a == b ? "verdadeiro" : "falso";
        
        int resultadoInt = a == b ? 1 : 0;
        
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";

        System.out.println(resultadoString);
        System.out.println(resultadoInt);
    }
}
