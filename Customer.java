public class Customer{
public Customer(String c_name,String c_country,int c_budget){
this.c_name=c_name;
this.c_country=c_country;

this.c_budget=c_budget;
}
private String c_name;
private String c_country;
//private String c_taxType;
private long c_budget;


public String getC_name(){
return c_name;
}
public String getC_country(){
return c_country;
}


public long getC_budget(){
return c_budget;
}



}