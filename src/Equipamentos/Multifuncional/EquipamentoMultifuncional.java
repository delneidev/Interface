package Equipamentos.Multifuncional;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento mutifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento mutifuncional");
    }

    @Override
    public void imprimir() {
    System.out.println("Imprimindo via equipamento mutifuncional");
    }
}
