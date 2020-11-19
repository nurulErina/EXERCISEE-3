
package encapsulation1;

public class protonX70 extends protonX50{
     
    String autoDriverOn, autoDriverOff;
    private String colour = "Red Velvet";
    private String camera;
    
    protonX70(){
        this.autoDriverOn = "On";//this refer to object detail
        this.autoDriverOff = "Off";
    }
    
    public void drive(){
        System.out.println("This car got big boot " +autoDriverOn);
        System.out.println("This car got big boot " +autoDriverOff);

    }
    
    public String getCamera(){
    return camera;
    }

    public void setCamera(String myCamera){
    this.camera = myCamera;
    }

    public String getColour(){
        return colour;
   
}
}
