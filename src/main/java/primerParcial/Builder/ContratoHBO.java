package primerParcial.Builder;

public class ContratoHBO extends Builder {

    public ContratoHBO(){
        System.out.println("Se suscribio a HBO");
    }


    @Override
    public void buildEmpresa() {
        contrato.setEmpresa("HBO");
    }

    @Override
    public void builCosto() {
        contrato.setCosto(62);

    }

    @Override
    public void builListaDeCanales() {
        contrato.setListaDeCanaleYOPeliculas("HBO Originals, Euphoria");

    }
}
