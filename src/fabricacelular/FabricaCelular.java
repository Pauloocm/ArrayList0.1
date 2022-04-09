package fabricacelular;
import java.util.ArrayList;

public class FabricaCelular {

    public static void main(String[] args) {

        Bateria bateriaS22 = new Bateria("Bateria Samsung", "Bateria S22", 5000);
        
        Celular celular1 = new Celular("Samsung", bateriaS22);
        
        ArrayList<Bateria> bateriass = new ArrayList<>();
        
        bateriass.add(bateriaS22);
       
        System.out.println(celular1);     
        System.out.println("Modelo bateria: "+celular1.getBateria());
        
        for(int i = 0; i < Bateria.getTamanho(); i++){
            System.out.println("\n.");
        }
    }

}






























