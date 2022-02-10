import java.io.Serializable;


public class Quotation implements Serializable {


double taxPercentage;
double taxamount;
double totalAmount;
public Quotation(double taxPercentage, double taxamount, double totalAmount) {

this.taxPercentage = taxPercentage;
this.taxamount = taxamount;
this.totalAmount = totalAmount;
}

}
