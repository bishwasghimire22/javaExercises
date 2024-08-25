package classesAndObj3;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> itemList;

	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();

	}

	public void add(Product product, int quantity) {
		/*for (Item item : itemList) {
			if (item.getProduct().getProductNumber() == product.getProductNumber()) {
				item = new Item(product, item.getQuantity() + quantity);
				return;
			}

		}*/
		this.itemList.add(new Item(product, quantity));

	}

	public void remove(Product product) {
		this.itemList.removeIf(item -> item.getProduct().getProductNumber() == product.getProductNumber());
	}

	public double getTotalPrice() {
		double totalPrice = 0.0;
		for (Item item : itemList) {
			totalPrice += item.getSubtotal();
		}
		return totalPrice;
	}

	public String toString() {
		if (itemList.isEmpty()) {
			return "There are no items in the shopping cart.\n";
		}
		System.out.println("=== Shopping cart ===");
		StringBuilder output = new StringBuilder("");
		for (Item item : itemList) {

			output.append(String.format("%d: %s, quantity: %d, unit price: %.2f, subtotal: %.2f \n",
					item.getProduct().getProductNumber(), item.getProduct().getName(), item.getQuantity(),
					item.getProduct().getPrice(), item.getSubtotal()));
		}
		output.append(String.format("TOTAL PRICE: %.2f euros\n", getTotalPrice()));
		return output.toString();

	}
}
