package primerParcial.Singleton;

public class Client {

    public static void main(String args[]){

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                TesisManager s1=TesisManager.getInstance();
                Estudiante e1=new Estudiante();
                e1.setCi("555500");
                e1.setNombre("Alejandra");
                Tesis t1=new Tesis(e1);
                //s1.time();
                System.out.println("singleton 1: "+s1);
                System.out.println("singleton 1: "+s1.hashCode());
            }
        });
        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                TesisManager s2=TesisManager.getInstance();
                Estudiante e1=new Estudiante();
                e1.setCi("12345");
                e1.setNombre("Alejandra");
                //s2.time();
                System.out.println("singleton 1: "+s2);
                System.out.println("singleton 2: "+s2.hashCode());
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                TesisManager s3=TesisManager.getInstance();
                Estudiante e1=new Estudiante();
                e1.setCi("12345");
                e1.setNombre("Alejandra");
               // s3.time();
                System.out.println("singleton 1: "+s3);
                System.out.println("singleton 3: "+s3.hashCode());
            }
        });
        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {
                TesisManager s4=TesisManager.getInstance();
                // s3.time();
                System.out.println("singleton 1: "+s4);
                System.out.println("singleton 4: "+s4.hashCode());
            }
        });

        user1.start();
        user2.start();
        user3.start();
    }

}
