public class Loja {

    private float valorTotal;

    public float getValor() {
        return valorTotal;
    }

    public void descontoSimples(float valor){
        Calculadora calculadora = new Calculadora(valor);
        this.valorTotal = calculadora.calcularDesconto(new DescontoSimples());
    }

    public void descontoPremium(float valor){

        Calculadora calculadora = new Calculadora(valor);
        this.valorTotal = calculadora.calcularDesconto(new DescontoPremium());
    }

}
