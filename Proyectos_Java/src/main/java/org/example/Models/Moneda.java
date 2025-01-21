package org.example.Models;

public class Moneda {
    private String representaciónModeda;
    private int valor;

    public Moneda(String representaciónModeda, int valor) {
        this.representaciónModeda = representaciónModeda;
        this.valor = valor;
    }

    public String getRepresentaciónModeda() {
        return representaciónModeda;
    }

    public void setRepresentaciónModeda(String representaciónModeda) {
        this.representaciónModeda = representaciónModeda;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "representaciónModeda='" + representaciónModeda + '\'' +
                ", valor=" + valor +
                '}';
    }
}
