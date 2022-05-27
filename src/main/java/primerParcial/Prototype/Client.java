package primerParcial.Prototype;


public class Client {

    public static void main (String[]args){

        CelularA1 c1= new CelularA1();
        c1.setModelo("A1");
        c1.setTamanio("25 cm");
        c1.setPeso("60");
        c1.setCamara("foco=10,lente=5mp");
        c1.setImei("10001");
        c1.setOrigen("Bolivia");

        System.out.println("---------------------------------------");
        c1.showInfo();


        CelularA1 c2=(CelularA1) c1.clone();
        c2.setImei("10002");
        System.out.println("---------------------------------------");
        c2.showInfo();
        CelularA1 c3=(CelularA1) c1.clone();
        c3.setImei("10003");
        System.out.println("---------------------------------------");
        c3.showInfo();
        CelularA1 c4=(CelularA1) c1.clone();
        c4.setImei("10004");
        System.out.println("---------------------------------------");
        c4.showInfo();
        CelularA1 c5=(CelularA1) c1.clone();
        c5.setImei("10005");
        System.out.println("---------------------------------------");
        c5.showInfo();




    }
}
