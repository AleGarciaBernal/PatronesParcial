package primerParcial.Builder;

public abstract class Builder {
        //Usar protected(?)
        //atributo del producto concreto
        protected Contrato contrato;

        public Contrato getProduct() {
            return contrato;
        }

        public void setProduct(Contrato product) {
            this.contrato = product;
        }

        public void createProduct(){
            this.contrato=new Contrato();
        }

        //build de los atributos
        public abstract void buildAt1();
        public abstract void buildAt2();

}
