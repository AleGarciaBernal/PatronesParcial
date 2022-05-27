package primerParcial.Builder;

public class Contrato {

    private String empresa;
    private int costo;
    private String listaDeCanaleYOPeliculas;

    public Contrato(){}

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getListaDeCanaleYOPeliculas() {
        return listaDeCanaleYOPeliculas;
    }

    public void setListaDeCanaleYOPeliculas(String listaDeCanaleYOPeliculas) {
        this.listaDeCanaleYOPeliculas = listaDeCanaleYOPeliculas;
    }

    public void showInfo() {
        System.out.println("Empresa:"+empresa);
        System.out.println("costo:"+costo);
        System.out.println("ListaDeCanales:"+listaDeCanaleYOPeliculas);



    }
}
