public class DescontoPremium implements Desconto{
    @Override
    public float calcular(float val1) {
        if(val1<200){
            throw new IllegalArgumentException("Desconto premium é valido para compras a partir de 200 reais");
        }
        else {
            return val1 -(val1 * 20/100);
        }
    }
}
