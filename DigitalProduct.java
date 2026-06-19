/*
Final Lab Exam
Student Name:
Student ID: 
Section: 
Lab Instructor: 
*/
package f24;

public class DigitalProduct extends Product {
    
    private String downloadType;
    
    public DigitalProduct (String productID,String name,double price,String status, String digitalDownload )
    {
    super(productID, name, price, status)	;
    this.downloadType=downloadType;
    }
    
    public void setDownloadType(String digitalDownload){
        this.downloadType = downloadType;
     }
     
    public String getDownloadType(){
        return downloadType; 
     }
    
    @Override
    public String toString(){
        return super.toString()+ " Download type: "+this.downloadType;
    }

    
}
