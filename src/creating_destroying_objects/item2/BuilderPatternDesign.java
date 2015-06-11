/**
 * 
 */
package creating_destroying_objects.item2;

/**
 * @author quocanh
 *
 */
// The Builder pattern combines the safety of the telescoping
// constructor pattern with the readability of the JavaBeans pattern.
// Avantage: The Builder pattern simulates named optional parameters
public class BuilderPatternDesign {
	private final int servingSize; // required
	private final int servings; // required
	private final int calories; // optional
	private final int fat; // optional
	private final int sodium; // optional
	private final int carbohydrate; // optional
	
	public static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;
		
		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			this.calories = val; return this;
		}
		
		public Builder fat(int val) {
			this.fat = val; return this;
		}
		
		public Builder sodium(int val) {
			this.sodium = val; return this;
		}
		
		public Builder carbohydrate(int val) {
			this.carbohydrate = val; return this;
		}

		public BuilderPatternDesign build() {
			return new BuilderPatternDesign(this);
		}
		
	}
	
	public BuilderPatternDesign(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
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
