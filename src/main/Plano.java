package main;

public abstract class Plano {

    protected QualidadeVideo qualidade;
    protected float precoBase;

    public Plano(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setQualidade(QualidadeVideo qualidade) {
        this.qualidade = qualidade;
    }

    public abstract float calcularPreco();
}
