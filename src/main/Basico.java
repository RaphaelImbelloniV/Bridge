package main;

public class Basico extends Plano {

    public Basico(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.qualidade.percentualAumento());
    }
}