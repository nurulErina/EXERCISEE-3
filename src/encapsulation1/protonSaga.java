
package encapsulation1;

public class protonSaga extends proton {
    
    String fuel;
    private String seats;
    private String accessories = "Tinted windows";
    
    protonSaga(){
        this.fuel = "Diesel"; //this refer to object detail
    }
    
    public void fuel(){
        System.out.println("This car use fuel " +fuel);
     
    }
    
     public String getSeat(){
    return seats;
    }

    public void setSeat(String mySeat){
    this.seats = mySeat;
    }
    
    public  String getItems(){
      return accessories;
        
    }
    
    }


    

