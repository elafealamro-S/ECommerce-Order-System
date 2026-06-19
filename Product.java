/*
Final Lab Exam
Student Name:
Student ID: 
Section: 
Lab Instructor: 
*/
package f24;

public abstract class Product {
    
    private String productID;
	private String name;
	private double price;
	private String status;
    
    public Product(){
    }
    
    public Product(String productID,String name,double price,String status){
        this.productID=productID;
        this.name= name;
        this.price = price;
        this.status = status;
    }
  
    public void setProductID(String productID){
       this.productID = productID;
    }
     public String getProductID(){
       return productID; 
    }
     
     public void setName(String name){
       this.name = name;
    }
     
     public String getName(){
       return name; 
    }
     
     public void setPrice(double price){
       this.price = price;
    }
     
     public double getPrice(){
       return price; 
    }
     
     public void setStatus(String status){
       this.status = status;
    }
     
     public String getStatus(){
       return status; 
    }
     
    public String toString(){
        return "Product ID : "+this.productID+" Product Name : " +this.name+
                " price : "+this.price+" status: "+this.status;
    }
    
}
