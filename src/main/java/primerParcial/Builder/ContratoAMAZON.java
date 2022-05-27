package primerParcial.Builder;

public class ContratoAMAZON extends Builder {

    public ContratoAMAZON(){
        System.out.println("Se suscribio a AMAZON");
    }

    @Override
    public void buildEmpresa() {
        contrato.setEmpresa("AMAZON");
    }

    @Override
    public void builCosto() {
        contrato.setCosto(50);

    }

    @Override
    public void builListaDeCanales() {
        contrato.setListaDeCanaleYOPeliculas("JeffBezoz Originals, The Boys");

    }
}
