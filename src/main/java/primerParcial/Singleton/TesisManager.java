package primerParcial.Singleton;

import estructuras.singleton.structure.Singleton3;

public class TesisManager {

    private static TesisManager instance;

    private TesisManager(){
        System.out.println("Creando Tesis Manager");
    }

    public static TesisManager getInstance(){
        if(instance==null){
            multiHiloContol();
        }
        return instance;
    }

    private synchronized static void multiHiloContol(){
        if(instance==null){
            instance=new TesisManager();
        }
    }

}
