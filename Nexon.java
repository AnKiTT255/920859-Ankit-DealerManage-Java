public class Nexon implements Car
{
private static String name;
private static String model;
private static String type;
private static int price;
Nexon (){
name = "Nexon";
model = "Mini SUV";
type= "manual";price= 800000;}
public String getCarname(){
return name;
}public int getCarprice(){
return price;
}
public String getCartype(){
return type;
}public String getCarmodel(){
return model;
}
}

