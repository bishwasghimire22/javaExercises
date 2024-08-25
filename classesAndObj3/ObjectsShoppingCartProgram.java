package classesAndObj3;

public class ObjectsShoppingCartProgram {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		Product product_1 = new Product(10, "Bicycle", 500.00);
		Product product_2 = new Product(11, "Energy bar", 1.50);
		Product product_3 = new Product(12, "Water bottle", 6.00);

		System.out.println(cart);

		cart.add(product_1, 1);
		cart.add(product_2, 5);
		cart.add(product_3, 2);
		System.out.println(cart);

		cart.remove(product_2);
		System.out.println(cart);

	}

}
/*Create classes Product, Item, and ShoppingCart.
* The Product class has three fields, a parametric constructor, and getters and setters for all fields.
* The ShoppingCart class and the Item class should be as below.
ShoppingCart
- ArrayList<Item> itemList
+ ShoppingCart()
+ void add(Product product, int quantity)
+ void remove(Product product)
+ double getTotalPrice()
+ String toString()
Item
- Product product
- int quantity
+ Item (Product product, int quantity)
+ Product getProduct()
+ int getQuantity()
+ double getSubtotal()
NB! Use the ready-made program class below to test your own classes. Do not modify the program
class at all.*/

