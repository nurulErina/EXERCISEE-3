
package encapsulation1;

import java.util.Scanner;

public class protonPersona extends proton {

 String bigBoot;
 private String radio;
 private String key = "remote";
 
     protonPersona(){ // first default constructor
        System.out.println("Please enter boot space: ");
        Scanner in = new Scanner(System.in);
        String boot = in.next();
        
        this.bigBoot = boot;
     }
    

    public void boot(){
    System.out.println("This car got big boot space "+bigBoot);

    }

    public String getRadio(){
    return radio;
    }

    public void setRadio(String myRadio){
    this.radio = myRadio;
    }

    public String getKey(){
    return key;
    }

   
  
  
}

