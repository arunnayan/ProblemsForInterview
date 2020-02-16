import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Category{
  String item;
  String type;
  int qauntity;
  double price;

  public Category(String item, String type, int qauntity, double price) {
    this.item = item;
    this.type = type;
    this.qauntity = qauntity;
    this.price = price;
  }

}


class Tax{
  String item;
  double rate;

  public Tax(String item, double rate) {
    this.item = item;
    this.rate = rate;
  }
}




public class Interview {

  public static void main(String[] args) {

    List<Category> cat = new ArrayList<Category>();
    Map<String, Double> tax = new HashMap<String, Double>();
    double total = 0;
    for (int i = 0; i < cat.size(); i++) {
      double tax_value = tax.get(cat.get(i).item);
      if(cat.get(i).qauntity>2){
        int q = cat.get(i).qauntity-1;
        total+=cat.get(i).price*q *(1+tax_value/100);
      }else{
        total+=cat.get(i).price*cat.get(i).qauntity *(1+tax_value/100);
      }

    }

  }

}
