package primerParcial.Builder;

public abstract class Builder {
        //Usar protected(?)
        //atributo del producto concreto
        protected Contrato contrato;

        public Contrato getProduct() {
            return contrato;
        }

        public void createProduct(){
            this.contrato=new Contrato();
        }

        //build de los atributos
        public abstract void buildEmpresa();
        public abstract void builCosto();
        public abstract void builListaDeCanales();

}
