package primerParcial.Builder;

public class Client {

    public static void main(String[]args){

        Director director = new Director();

        ContratoHBO p1=new ContratoHBO();
        ContratoNETFLIX p2=new ContratoNETFLIX();
        ContratoAMAZON p3=new ContratoAMAZON();

        director.setBuilder(p3);
        director.buildProduct();
        Contrato product1=director.getProduct();
        product1.showInfo();

        director.setBuilder(p1);
        director.buildProduct();
        Contrato product2=director.getProduct();
        product2.showInfo();

        director.setBuilder(p2);
        director.buildProduct();
        Contrato product3=director.getProduct();
        product3.showInfo();


       // Contrato p3 = new Product();

    }
}