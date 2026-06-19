/*
Final Lab Exam
Student Name: 
Student ID:
Section:
Lab Instructor:
*/
package f24;

public class Order {
    
    private int orderNo;
    private Product product;
    private Customer customer;
    
    public Order(int orderNo,Product product,Customer customer){
        this.orderNo = orderNo;
        this.product = product;
        this.customer = customer;
    }
    public void setProduct(Product product ){
       this.product = product;
    }
     public Product getProduct(){
       return product; 
    }

     public void setCustomer(Customer customer){
       this.customer = customer;
    }
     public Customer getCustomer(){
       return customer; 
    }
    public String toString(){
        return " Order Number : "+this.orderNo+" \nProduct information : "+product.toString()+
                " \ncustomert information : "+customer;
    }
    
}
