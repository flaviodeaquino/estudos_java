public class Carro {

    private int volumeTanque = 50;
    private double distanciaPercorrida;
    private double quantidadeCombustivel;
    private double distanciaTotalPercorrida;

    public Carro(double quantidadeCombustivel, double distanciaTotalPercorrida) {
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.distanciaTotalPercorrida = distanciaTotalPercorrida;
    }

    public void abastecer(double quantidadeLitros) {
        if (quantidadeCombustivel < 0) {
            this.quantidadeCombustivel = 0;
            System.out.println("O carro não foi abastecido.");
        } else if (quantidadeLitros > volumeTanque - this.quantidadeCombustivel) {
            double qtdAbastecido = volumeTanque - quantidadeCombustivel;
            System.out.println("O carro foi abastecido com " + qtdAbastecido + " litros.");
            this.quantidadeCombustivel = volumeTanque;
        } else {
            this.quantidadeCombustivel = this.quantidadeCombustivel + quantidadeLitros;
            System.out.println("O carro foi abastecido com " + quantidadeLitros + " litros.");
        }
    }

    public void moverCarro(double distancia) {
        if (distancia > 15 * quantidadeCombustivel) {
            System.out.println("Não foi possível percorrer " + distancia + " km pois não tinha combustível suficiente.");
            distancia = 15 * quantidadeCombustivel;
            System.out.println("Distância percorrida com " + quantidadeCombustivel + " litros: " + distancia + " km.");
            distanciaTotalPercorrida = distanciaTotalPercorrida + distancia;
            quantidadeCombustivel = 0;
        } else {
            System.out.println("Distância percorrida: " + distancia + " km.");
            double quantidadeCombustivelConsumida = distancia / 15;
            quantidadeCombustivel = quantidadeCombustivel - quantidadeCombustivelConsumida;
            distanciaTotalPercorrida = distanciaTotalPercorrida + distancia;
        }
    }

    public void imprimirDadosCarro() {
        System.out.println("Distância total percorrida: " + distanciaTotalPercorrida) ;
        System.out.println("Quantidade de combustível restante no tanque: " + quantidadeCombustivel);
    }

    public int getVolumeTanque() {
        return volumeTanque;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }
}
