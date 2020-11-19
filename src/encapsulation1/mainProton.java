
package encapsulation1;

public class mainProton {

    public static void main(String[] args) {
       
        protonPersona p = new protonPersona();
        System.out.println("Proton Persona features:- ");
        p.boot();
        p.printProton();
        
        p.setRadio("Kenwood");
        System.out.println(p.getRadio());
        System.out.println(p.getKey());
        
        protonSaga s = new protonSaga();
        System.out.println("\nProton Saga features:- ");
        s.fuel();
        s.printProton();
        s.setSeat("Type of seats: seatsLeather");
        System.out.println(s.getSeat());
        System.out.println(s.getItems());
       
        
        
        protonX50 x5 = new protonX50();
        System.out.println("\nProton X50 features:- ");
        x5.autoPark();
        x5.setBoot("Electronic boot");
        System.out.println(x5.getBoot());
        System.out.println(x5.getColour());
        
        
        
        protonX70 x7 = new protonX70();
        System.out.println("\nProton X70 features:- ");
        x7.drive();
        x7.setCamera("Dashcam");
        System.out.println(x7.getCamera());
        System.out.println(x7.getColour());
        
    }
}
        