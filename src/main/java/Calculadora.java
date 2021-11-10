public class Calculadora {

    private float valor;

    public Calculadora(float valor) {
        this.valor = valor;
    }

    public float calcularDesconto(Desconto desconto){

        return desconto.calcular(valor);
    }
}
