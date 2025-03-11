package Construtor;
public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123.456.789-00", "Marcos");

        marcos.setEndereco("Rua das Flores");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
