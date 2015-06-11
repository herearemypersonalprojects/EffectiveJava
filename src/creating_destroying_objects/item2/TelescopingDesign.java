/**
 * 
 */
package creating_destroying_objects.item2;

/**
 * @author quocanh
 *
 */
// Telescoping constructor pattern - does not scale well
// This pattern works, but it is hard to write client code
// when there are many parameters, and harder still to read it.
public class TelescopingDesign {
	private final int servingSize; // (ml) required
	private final int servings; // (per container) required
	private final int calories; // optional
	private final int fat; // (g) optional
	private final int sodium; // (mg) optional
	private final int carbohydrate; // (g) optional
	
	public TelescopingDesign(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}
	
	public TelescopingDesign(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}
	
	public TelescopingDesign(int servingSize, int servings,
			int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}
	
	public TelescopingDesign(int servingSize, int servings,
			int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}
	
	public TelescopingDesign(int servingSize, int servings,
			int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
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
