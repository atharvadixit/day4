package question2.bean;

public class Pizza {
	String pizzaName; // unique field String description;
	int sizeInCms; 
	String majorIngredientOne; 
	String majorIngredientTwo; 
	String majorIngredientThree; 
	float weight; 
	float price;
	
	public void preparation() { 
		System.out.println("The procedure for pizza preparation");
	}

	public Pizza(String pizzaName, int sizeInCms, String majorIngredientOne, String majorIngredientTwo,
			String majorIngredientThree, float weight, float price) {
		super();
		this.pizzaName = pizzaName;
		this.sizeInCms = sizeInCms;
		this.majorIngredientOne = majorIngredientOne;
		this.majorIngredientTwo = majorIngredientTwo;
		this.majorIngredientThree = majorIngredientThree;
		this.weight = weight;
		this.price = price;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public int getSizeInCms() {
		return sizeInCms;
	}

	public void setSizeInCms(int sizeInCms) {
		this.sizeInCms = sizeInCms;
	}

	public String getMajorIngredientOne() {
		return majorIngredientOne;
	}

	public void setMajorIngredientOne(String majorIngredientOne) {
		this.majorIngredientOne = majorIngredientOne;
	}

	public String getMajorIngredientTwo() {
		return majorIngredientTwo;
	}

	public void setMajorIngredientTwo(String majorIngredientTwo) {
		this.majorIngredientTwo = majorIngredientTwo;
	}

	public String getMajorIngredientThree() {
		return majorIngredientThree;
	}

	public void setMajorIngredientThree(String majorIngredientThree) {
		this.majorIngredientThree = majorIngredientThree;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
