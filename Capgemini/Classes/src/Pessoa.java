public class Pessoa {

    // Atributos
    private float peso;
    private float altura;

    // Método
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }


    // Métodos acessores - dão acesso à entidades externas acessarem as informações do objeto Pessoa
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }


}
