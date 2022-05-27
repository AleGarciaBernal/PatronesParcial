package estructurasPatrones.abstractFactory.structure;

public class FacotryProduct {

    public static IProduct make(String typeProduct){

        IProduct product;

        switch (typeProduct.toLowerCase()){
            case "product1":
                product=new ConcreteProduct1();
                break;
            case "product2":
                product=new ConcreteProduct2();
                break;
            case "product3":
                product=new ConcreteProduct3();
                break;
            default:
                product= new ConcreteProduct3();
                break;
        }
        return product;

    }
}
