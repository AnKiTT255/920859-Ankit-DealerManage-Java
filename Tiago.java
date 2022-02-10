public class Tiago implements Car
	{
	private static String name;
	private static String model;
	private static String type;
	private static int price;
	Tiago ()
	{
	name = "Tiago";



	model = "Hacthback";



	type= "manual";


	price= 500000;


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



