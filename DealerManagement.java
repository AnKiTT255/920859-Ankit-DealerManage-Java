import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class DealerManagement{
private static Car obj ;
private static Customer customer;
private static String name;
private static String country;
private static int budget;



public static void main(String[] args) throws IOException
{


DealerManagement obj1 = new DealerManagement();
obj1.getCustomerDetails();


obj1.displayQuotation(customer);
}
public void getCustomerDetails(){
System.out.println("--Welcome to TATA Motors--\n");
Scanner input = new Scanner(System.in);
System.out.println("Enter your Name: ");
name=input.nextLine();
System.out.println("Enter your country :\n1 for India \n2 for UAE \n3 for USA");
int option = input.nextInt();
do{
if(option==1){
country="India";
break;
}else if(option==2){
country="UAE";
break;
}else if(option==3){
country="USA";
break;
}else {
System.out.println("Enter a valid input..! \nKindly contact your country's Dealer if your country is not in the list");
break;
}
}while(true);
System.out.println("Enter your budget(in rupees):");
budget=input.nextInt();
input.close();
customer = new Customer(name,country,budget);
}
public void displayQuotation(Customer customer){


if(customer.getC_budget()>=400000&&customer.getC_budget()<=500000){
obj = new Tiago();
}else if(customer.getC_budget()>500000&&customer.getC_budget()<=800000){
obj = new Nexon();
}else if(customer.getC_budget()>800000){
obj = new Harrier();
}else {System.out.println("Sorry... We do not have a car which suits your budget");
return ;
}
System.out.println("Customer Details :");
System.out.println("Name :"+customer.getC_name());
System.out.println("Country :"+customer.getC_country());


System.out.println("Budget :"+customer.getC_budget()+"");


//public throws IOException {



try {

FileOutputStream fis = new FileOutputStream("C:\\Users\\amm920859\\Desktop\\quotation.txt");


String a ="\nThe car suited for your budget is : \n";
String name1 = obj.getCarname();
String b = "Name:";
String c = "Model:"+(obj.getCarmodel());


String d = "Price(exclusive of taxes) : "+(obj.getCarprice());



// billing with tax
String e = "Tax details of the car : ";
double taxPercentage = Taxtype.getTax("India");
String f = "Tax Percentage : "+taxPercentage +"%";
double taxamount = taxPercentage*obj.getCarprice();
String g = " Tax Amount : "+taxamount;
double totalAmount=taxamount+obj.getCarprice();
String h = "Total Price(inclusive of taxes) : "+totalAmount;



Quotation q = new Quotation(taxPercentage, taxamount, totalAmount);
try {
ObjectOutputStream obj = new ObjectOutputStream(fis);
//byte[] b = s.getBytes();
obj.writeObject(q);
obj.flush();
fis.close();
}
catch (IOException t) {}
/*
byte[] j = s.getBytes();


abc.write(j);


abc.flush();


abc.close();
*/


System.out.println("--Quotation sent to text file--");


}



catch (FileNotFoundException e) {


e.printStackTrace();
}
System.out.println("\nThe car suited for your budget is : \n");


System.out.println("Name:"+obj.getCarname());
System.out.println("Model:"+obj.getCarmodel());


System.out.println("Price(exclusive of taxes) : "+obj.getCarprice());



// billing with tax
System.out.print("Tax details of the car : ");
double taxPercentage = Taxtype.getTax("India");
System.out.print("Tax Percentage : "+taxPercentage +"%");
double taxamount = taxPercentage*obj.getCarprice();
System.out.println(" Tax Amount : "+taxamount);
double totalAmount=taxamount+obj.getCarprice();
System.out.println("Total Price(inclusive of taxes) : "+totalAmount);
}
}

