 package decoratorversion.back;

public class Casquinha extends Sorvete {
    
    public Casquinha(){
        setNome("Casquinha");
    }

    @Override
    public double valor() {
        return 3.00;
    }

}