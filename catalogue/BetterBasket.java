package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  

  // You need to add code here@Override
  public boolean add( Product pr )
  {
      if(super.add(pr))
      {
          sort();   //sort the repeating products
          for(int i = 0 ; i < this.size() ; i++ )  //loop over all repeating products
          {
              if(this.get(i).getQuantity() == 0)
              {
                  this.remove(i);		// and remove Product o1 (as quantity = 0 after sort())
              }
          }
          return true;
      }
      return false;

  }

  public void sort()
  {
      Collections.sort(this , new Comparator<Product>() {
          @Override
          public int compare(Product o1, Product o2) {
              double productRepeat = o1.getPrice();
              double product = o2.getPrice();
              int productRepeatQuantity = o2.getQuantity();
              if(productRepeat == product)
              {
                  o2.setQuantity(productRepeatQuantity + 1);
                  o1.setQuantity(0);
                  return 0;
              }
              return productRepeat<product ? 1 : -1;
          }
      });
  }
}
