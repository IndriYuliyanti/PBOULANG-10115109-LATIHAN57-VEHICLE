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
public class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
    
    public void Vehicle(){
        System.out.println("brand :"+get.MyBrand());
        System.out.println("model :"+get.MyModel());
        
    }
    
    public void inputData(String b, String m){
        setMyBrand(b);
        setMyModel(m);
    }
    
    void inputData(String trek_Bike){
    }
    void Skateboard(){
        
    }
    void Bicycle(){
    }
    
    
    
}
