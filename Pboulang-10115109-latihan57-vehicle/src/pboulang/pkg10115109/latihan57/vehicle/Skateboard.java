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
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){
        String panjangboard;
        panjangboard="54.5";
        
        Vehicle v = new Vehicle();
        
        v.inputData("all skate");
        v.Skateboard();
        System.out.println("panjang board :"+panjangboard);
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
    
    
    
    
}
