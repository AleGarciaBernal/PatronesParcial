package primerParcial.Builder;

public class ContratoNETFLIX extends Builder {

    public ContratoNETFLIX(){
        System.out.println("Se suscribio a NETFLIX");
    }


    @Override
    public void buildEmpresa() {
        contrato.setEmpresa("NETFLIX");
    }

    @Override
    public void builCosto() {
        contrato.setCosto(150);

    }

    @Override
    public void builListaDeCanales() {
        contrato.setListaDeCanaleYOPeliculas("Netflix productions, Stranger Things");

    }
}
