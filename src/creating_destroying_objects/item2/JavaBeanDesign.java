/**
 * 
 */
package creating_destroying_objects.item2;

/**
 * @author quocanh
 *
 */
// JavaBeans Pattern - allows inconsistency, mandates mutability
// Avantage: It is easy, if a bit wordy, to create instances and easy to read code
// Disavantage: 
// 1. a JavaBean may be in an inconsistent state partway through its construction.
// 2. the JavaBeans pattern precludes the possibility of making a class immutable
public class JavaBeanDesign {
	// Parameters initialized to default values (if any)
	private int servingSize = -1; // required
	private int servings = -1; // required
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;
	
	public JavaBeanDesign() {}

	/**
	 * @return the servingSize
	 */
	public int getServingSize() {
		return servingSize;
	}

	/**
	 * @param servingSize the servingSize to set
	 */
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	/**
	 * @return the servings
	 */
	public int getServings() {
		return servings;
	}

	/**
	 * @param servings the servings to set
	 */
	public void setServings(int servings) {
		this.servings = servings;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * @return the fat
	 */
	public int getFat() {
		return fat;
	}

	/**
	 * @param fat the fat to set
	 */
	public void setFat(int fat) {
		this.fat = fat;
	}

	/**
	 * @return the sodium
	 */
	public int getSodium() {
		return sodium;
	}

	/**
	 * @param sodium the sodium to set
	 */
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	/**
	 * @return the carbohydrate
	 */
	public int getCarbohydrate() {
		return carbohydrate;
	}

	/**
	 * @param carbohydrate the carbohydrate to set
	 */
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.servingSize);
		sb.append(this.servings);
		sb.append(this.calories);
		sb.append(this.fat);
		sb.append(carbohydrate);
		return sb.toString();
	}	
}
