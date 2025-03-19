// Interface

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional...");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }
    
}
