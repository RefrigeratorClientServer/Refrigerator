package products;

import java.time.*;

public class Products {

	public String name;
	public String owner;
	public int quantityOnStore;
	public double price;
	public int nutritionalValue;
	public LocalDate expirationDate;
	private boolean freshness;

	public Products() {

	}

	public Products(String name, String owner, int nutritionalValue, int quantityOnStore, double price, LocalDate expirationDate) {
		this.name = name;
		this.owner = owner;
		this.nutritionalValue = nutritionalValue;
		this.quantityOnStore = quantityOnStore;
		this.price = price;
		this.expirationDate = expirationDate;
		this.freshness = isFresh(expirationDate);
	}

	public void add() {
		quantityOnStore++;
	}

	public void delete(int q) {
		quantityOnStore -= q; // видаляти не за кількістю. нап методи їсти і тд
	}

	// public void deleteSpoiled (){
	//
	// }

	// public String toString() {
	// return name + ":" + owner + ":" + price + ":" + quantityOnStore;
	// }

	public String getName() {
		return name;
	}

	public void setQuantity(int q) {
		quantityOnStore += q;
	}

	boolean isFresh(LocalDate x) {
		if (x.isAfter(LocalDate.now())) {
			return true;
		} else {
			return false;
		}
	}

}
