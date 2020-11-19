
package encapsulation1;


public class protonX50 extends proton {
    
   String autoParking;
   private String colour = "Oncean Blue";
   private String boot;
 
    
    protonX50(){
        this.autoParking = "On"; //this refer to object detail
       
    }
    
    public void autoPark(){
        System.out.println("This car got big boot " +autoParking);
    }
    
     public String getBoot(){
    return boot;
    }

    public void setBoot(String myBoot){
    this.boot = myBoot;
    }

    public String getColour(){
        return colour;
   
  }
}
