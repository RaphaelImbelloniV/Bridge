package main;

public class Main {
    public static void main(String[] args) {
        Plano planoBasico = new Basico(20.0f);
        planoBasico.setQualidade(new HD());
        System.out.println("Preço do Plano Básico em HD: R$ " + planoBasico.calcularPreco());

        Plano planoPremium = new Premium(50.0f);
        planoPremium.setQualidade(new QuatroK());
        System.out.println("Preço do Plano Premium em 4K: R$ " + planoPremium.calcularPreco());
    }
}