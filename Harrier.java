
public class Harrier implements Car{
private static String name;
private static String model;
private static String type;
private static int price;
Harrier(){
name = "Harrier";



model = "SUV";



type= "manual";

price= 200000;


}
public String getCarname(){
return name;
}


public int getCarprice(){
return price;
}
public String getCartype(){
return type;
}public String getCarmodel(){
return model;
}
}