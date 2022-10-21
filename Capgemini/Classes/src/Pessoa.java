public class Pessoa {

    // Atributos
    private float peso;
    private float altura;

    // Método
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    // Método construtor - só é necessário quando precisar de um valor "default"
    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
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
