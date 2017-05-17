
package decoratorversion.back;

public class Tradicional extends Sorvete {
    
    public Tradicional(){
        setNome("Tradicional");
    }

    @Override
    public double valor() {
        return 6.00;
    }
    
}
