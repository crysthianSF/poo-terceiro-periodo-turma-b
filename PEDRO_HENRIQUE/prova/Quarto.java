package PEDRO_HENRIQUE.prova;

public class Quarto {
    private int numero;
    private boolean disponivel;

    public Quarto(int numero) {
        this.numero = numero;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    public void liberar() {
        this.disponivel = true;
    }
}
