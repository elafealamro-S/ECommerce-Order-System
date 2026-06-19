/*
Final Lab Exam
Student Name:
Student ID: 
Section: 
Lab Instructor: 
*/
package f24;

public class PhysicalProduct extends Product{
    
    private String delivery;
    
    public PhysicalProduct (String productID,String name,double price,String status, String delivery )
    {
    super(productID, name, price, status);
    this.delivery=delivery;
    }
    
    public void setDelivery(String delivery){
        this.delivery = delivery;
     }
     
    public String getDelivery(){
        return delivery; 
     }
    
    
    /*Q2:Override the toSring method 
     */
    //Solution:
    
    public String toString(){
         return super.toString() + "delivery :" + this.delivery ;
    }






    //=================================================================================

    
}
