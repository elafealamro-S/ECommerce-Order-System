/*
Final Lab Exam
Student Name:
Student ID: 
Section: 
Lab Instructor: 
*/
package f24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class FinalLabExam {/*----------------------------------------------------------------------
    Q3:Create three ArrayLists as mentioned in the Exam Form
    ------------------------------------------------------------------------*/
	//Solution:
        private static ArrayList <Product> product = new ArrayList <Product> ();
        private static ArrayList <Customer> customer = new ArrayList <Customer> ();
        private static ArrayList <Order> order = new ArrayList <Order> ();

   //=======================================================================
    public static void main(String[] args) throws FileNotFoundException {
     
        File F1 = new File("INPUT (1).txt");
        File F2 = new File ("OUTPUT.txt");
        if(!F1.exists()){
            System.out.println("Input file "+F1.getName()+" does not exist");
            System.exit(0);
        }
        Scanner input = new Scanner(F1);
        input.useLocale(Locale.US);
        PrintWriter output = new PrintWriter(F2);
        output.println("\nWelcome to the System!\n");
        output.println("***********************************************");
        
       
   String command;

   do {
            command = input.next();
           
            if (command.equalsIgnoreCase("ADD_Customer")) {
            	AddCustomer(input, output);// // Reading data from the file
            }
            else if (command.equalsIgnoreCase("ADD_Product")) {
                AddProduct(input, output);// // Reading data from the file
             }
            else  if (command.equalsIgnoreCase("PLACE_Order")) {
            	PlaceOrder(input, output);// // Reading data from the file
            }
        } while (!command.equalsIgnoreCase("Quit"));
        
 output.println("\nThank you for using the System, Good Bye!");
 output.flush(); // immediately save in the file
 output.close(); // closing file write object
 input.close();// closing file read object
    }
     
    
    //==============================================================================
    //Q4: Solve Question 4 written in Exam paper.
    public static void AddCustomer(Scanner input, PrintWriter output) {
         int customerID = input.nextInt();
	 String fisrtName = input.next();
	 String lastName = input.next();
	 int birthYear = input.nextInt();
	 int phoneNumber = input.nextInt();
	 String emailAddress = input.next();
         
         //Customer(int customerID,String fisrtName,String lastName, int birthYear, int phoneNumber, String emailAddress)
         Customer newCustomer = new Customer( customerID, fisrtName, lastName,  birthYear,  phoneNumber, emailAddress);
         
         customer.add(newCustomer);
         
         output.println("Customer with ID " + customerID + " added successfully");
    //===========================================================================
    }
    
    //Q5: Solve Question 5 written in Exam paper.
    public static void AddProduct(Scanner input, PrintWriter output) {
   //Solution:
         String Type = input.next();
         String productID = input.next();
	 String name = input.next();
	 double price = input.nextDouble();
	 String status = input.next();
          
         if (Type.equals("PhysicalProduct")){
             String delivery = input.next();
             
             //PhysicalProduct (String productID,String name,double price,String status, String delivery )
             PhysicalProduct newPhysicalProduct = new PhysicalProduct ( productID, name, price, status,  delivery );
             
             product.add(newPhysicalProduct);
             
         }
         else if(Type.equals("DigitalProduct")){
             String downloadType = input.next();
             
             //DigitalProduct (String productID,String name,double price,String status, String digitalDownload )
             DigitalProduct newDigitalProduct = new DigitalProduct( productID, name, price, status,  downloadType );
             
             product.add(newDigitalProduct);
         }
         output.println(Type + " " + productID + " added successfully");    
   }
   
 //================================================================================== 
    
    
    //Q6. Solve Question 6 written in Exam paper.
    
    public static void PlaceOrder(Scanner input, PrintWriter output) {
        
        String productID = input.next();
        int customerID= input.nextInt();
        
         int indexProduct = searchProductIndex(productID);
         int indexCustomer =  searchCustomerIndex(customerID);
         
           if(indexCustomer == -1){
             output.println("\nUnsuccessful Order");
             output.println("Invalid Customer ID");
             output.println("--------------------------------------------");
         }
         else if(product.get(indexProduct).getStatus().equals("Sold_out")){
             output.println("\n\nUnsuccessful Order");
             output.println("The Product is Sold_out");
             output.println("--------------------------------------------"); 
         }
         else{ 
         Product CProduct = product.get(indexProduct);
         Customer CCustomer = customer.get(indexCustomer);
         
        int orderNo = (int)(Math.random()*1000);
        
        //Order(int orderNo,Product product,Customer customer)
        Order nweOrder = new Order(orderNo,CProduct,CCustomer);
        
        order.add(nweOrder);
        
         output.println("\nOrder with ID " + orderNo + " added successfully");
         output.println("--------------------------------------------");
         
         }
    }   
    

  //==================================================================================  
     //This method search about the product using its ID and returns its index,  if the product is not found it returns -1
    public static int searchProductIndex(String productID){
        int index = -1;
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getProductID().equalsIgnoreCase(productID)) {
                index= i;
            }
        }
        return index;
    }
  //=====================================================================================  
    //This method search about the Customer using its ID and returns its index,  if customer is not found it returns -1
    public static int searchCustomerIndex(int customerID){
        int index = -1;
        for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).getCustomerID()==customerID) {
                index= i;
            }
        }
        return index;
    }
  //=====================================================================================
    
}
