public class Metodo {

    // Método que retorna a soma de dois números inteiros
    public double somar(int num1, int num2) {
        return num1 + num2;
    }

    // Método que imprime um texto na tela
    public void imprimir(String texto) {
        System.out.println(texto);
    }

    private void metodoPrivado() {
        System.out.println("Este é um método privado sendo chamado!");
    }

    public void chamarMetodoPrivado() {
        metodoPrivado();
    }

    public static void main(String[] args) {
        Metodo metodo = new Metodo(); // Criando um objeto da classe

        // Chamando os métodos
        double resultado = metodo.somar(5, 3);
        metodo.imprimir("O resultado da soma é: " + resultado);
    
        metodo.chamarMetodoPrivado();
    }
}
