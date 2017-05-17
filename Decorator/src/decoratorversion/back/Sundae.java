    
package decoratorversion.back;

public class Sundae extends Sorvete{

    public Sundae(){
        setNome("Sundae");
    }

    @Override
    public double valor() {
        return 8.00;
    }
    
}
