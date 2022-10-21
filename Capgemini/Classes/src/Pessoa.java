public class Pessoa {

    // Atributos
    float peso;
    float altura;

    // Método
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }
}
