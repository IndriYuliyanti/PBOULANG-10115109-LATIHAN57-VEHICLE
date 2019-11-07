/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan57.vehicle;

/**
 *
 * @author User
 */
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        String jmlgear = "23";
        Vehicle v = new Vehicle();
        
        v.inputData("trek bike");
        v.Bicycle();
        
        System.out.println("jumlah gera :"+jmlgear);
        
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
    void setMyBrand(){
    }
    
    void setMyModel(){
        
    }
    
    
}

