package main;

public class Padrao extends Plano {

    public Padrao(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.qualidade.percentualAumento());
    }
}
