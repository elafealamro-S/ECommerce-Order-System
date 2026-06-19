/*
Final Lab Exam
Student Name:
Student ID: 
Section: 
Lab Instructor: 
*/
package f24;

public class Customer {
    
    private int customerID;
	private String fisrtName;
	private String lastName;
	private int birthYear;
	private int phoneNumber;
	private String emailAddress;

    
    public Customer(int customerID,String fisrtName,String lastName, int birthYear, int phoneNumber, String emailAddress){
        this.customerID = customerID;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public void setCustomerID(int customerID){
       this.customerID = customerID;
    }
     public int getCustomerID(){
       return customerID; 
    }
    public void setFisrtName(String fisrtName){
       this.fisrtName = fisrtName;
    }
     public String getFisrtName(){
       return fisrtName; 
    }
     public void setLastName(String lastName){
       this.lastName = lastName;
    }
     public String getLastName(){
       return lastName; 
    }
     public void setBirthYear(int birthYear){
       this.birthYear = birthYear;
    }
     public int getBirthYear(){
       return birthYear; 
    }
     public void setPhoneNumber(int phoneNumber){
       this.phoneNumber = phoneNumber;
    }
     public int getPhoneNumber(){
       return phoneNumber; 
    }
     public void setEmailAddress(String emailAddress){
       this.emailAddress = emailAddress;
    }
     public String getEmailAddress(){
       return emailAddress; 
    }
     
    public String toString(){
        return " Customer ID : "+this.customerID+" Name : "+this.fisrtName+" "+this.lastName+ " Birth Year : "+this.birthYear+ " Phone Number : "
         +this.phoneNumber+ " emailAddress : "+this.emailAddress;
    }
    
}
