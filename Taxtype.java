
	public class Taxtype{


		public static double getTax(String country){
		switch(country){
		case "India":
		return 0.1d;
		case "USA":
		return 0.05d;
		case "UAE":
		return 0.03d;
		default:
		return 0;
		}
		}


		}
