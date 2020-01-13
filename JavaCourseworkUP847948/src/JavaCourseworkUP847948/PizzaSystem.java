package JavaCourseworkUP847948;

public class PizzaSystem {
    
    public static void main(String[] args) {
       ///////////////////////////////////////////////////////////////////////// 
       //Pizza class testing 
       System.out.println("////////////////////////////////////////////////");
       System.out.println("Pizza class testing (sample pizzas):\n");
       Pizza pizza1 = new Pizza("medium","thin","pesto","extra_cheese","chilli");
       
       Pizza pizza2 = new Pizza("medium","stuffed","pesto","olives","onion");
       
       Pizza pizza3 = new Pizza("small","thin","pesto","chilli","pepperoni");
       
       Pizza pizza4 = new Pizza("small","thin","pesto","olives","olives");
       
       //Pizza1 test
       System.out.println(pizza1.getInvoice()+"\n");
       
       //Pizza2 test      
       System.out.println(pizza2.getInvoice()+"\n");
       
       //Pizza3 test       
       System.out.println(pizza3.getInvoice()+"\n");
       
       //Pizza4 test      
       System.out.println(pizza4.getInvoice()+"\n");
       
       //GetCost test
       double price = pizza1.getCost();        
       System.out.println("\nPizza 1 getCost test: £"+price);
       
       //get/set testing
       System.out.println("\nGet/Set functions testing:\n");
       System.out.println("Pizza 1 crust: "+pizza1.getCrust());
       pizza1.setCrust("stuffed");
       System.out.println("Pizza 1 updated crust: "+pizza1.getCrust());

       System.out.println("Pizza 2 topping 1: "+pizza2.getTopping1());
       pizza2.setTopping1("chilli");
       System.out.println("Pizza 2 updated topping 1: "+pizza2.getTopping1());
       
       /////////////////////////////////////////////////////////////////////////
       
       /////////////////////////////////////////////////////////////////////////
       //Order class testing
       System.out.println("////////////////////////////////////////////////");
       System.out.println("Order class testing (sample pizzas): ");
       Order order = new Order();
       
       order.add("medium","thin","pesto","extra_cheese","chilli");
       order.add("medium","stuffed","pesto","olives","onion");
       order.add("small","thin","pesto","chilli","pepperoni");
       order.add("small","thin","pesto","olives","olives");
       System.out.println(order.getOrder());
       
       //update/delete testing
       System.out.println("Order deletion/update testing: ");
       order.deletePizza(1);
       order.updatePizza("small","stuffed","pesto","chilli","pepperoni",1);
       System.out.println(order.getOrder());
       
       //gettotal and number of pizzas testing
       System.out.println("Get pizzas in order/total cost test:");
       System.out.println("Total order cost:"+order.getTotal());
       System.out.println("Pizzas in order: "+order.numOfPizzas());
       
       //get pizza at specific point test
       System.out.println("\nGet pizza at specific point test(1st pizza): ");
       System.out.println(order.getPizza(0).getInvoice());
       
       /////////////////////////////////////////////////////////////////////////
       //GUI Tests
       order = new Order();
       orderForm frame = new orderForm(order);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(orderForm.EXIT_ON_CLOSE); 
       frame.setVisible(true);
       
    }
   
}
