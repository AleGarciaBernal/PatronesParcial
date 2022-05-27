package primerParcial.Builder;

public class Contrato {

    private String empresa;
    private int costo;
    private String listaDeCanaleYOPeliculas;

    public Contrato(){}

    public String getEmpresa() {
        return empresa;
    }

    public Contrato setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public int getCosto() {
        return costo;
    }

    public Contrato setCosto(int costo) {
        this.costo = costo;
        return this;
    }

    public String getListaDeCanaleYOPeliculas() {
        return listaDeCanaleYOPeliculas;
    }

    public Contrato setListaDeCanaleYOPeliculas(String listaDeCanaleYOPeliculas) {
        this.listaDeCanaleYOPeliculas = listaDeCanaleYOPeliculas;
        return this;
    }

    public void showInfo() {
        System.out.println("Empresa:"+empresa);
        System.out.println("costo:"+costo);
        System.out.println("ListaDeCanales:"+listaDeCanaleYOPeliculas);

    }
}
