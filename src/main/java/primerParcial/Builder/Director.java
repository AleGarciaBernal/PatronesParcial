package primerParcial.Builder;


public class Director {
    private Builder builder;

    public Contrato getProduct() {
        return builder.getProduct();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildEmpresa();
        this.builder.builCosto();
        this.builder.builListaDeCanales();
    }
}