public class DescontoSimples implements Desconto{

    @Override
    public float calcular(float val1) {
        if(val1>200){
            throw new IllegalArgumentException("Desconto simples não é valido para valor acima de 200 reais");
        }
        else{
            return val1 - (val1 * 5/100);
        }
    }
}
