package main;

public class Premium extends Plano {

    public Premium(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.qualidade.percentualAumento());
    }
}
