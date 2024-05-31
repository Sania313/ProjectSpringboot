package Demo;

import org.springframework.stereotype.Component;

@Component
public class shoppingCart {
    public void Checkout(String status){
        System.out.println("Checkout method from shopping cart");
    }
}
