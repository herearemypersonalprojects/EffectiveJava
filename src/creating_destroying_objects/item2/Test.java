/**
 * 
 */
package creating_destroying_objects.item2;

/**
 * @author quocanh
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TelescopingDesign badDesign = new TelescopingDesign(240, 8, 100, 0, 35, 27);
		System.out.println(badDesign);
		
		JavaBeanDesign jb = new JavaBeanDesign();
		jb.setServingSize(240);
		jb.setServings(8);
		jb.setCalories(100);
		jb.setFat(0);
		jb.setSodium(35);
		jb.setCarbohydrate(27);
		System.out.println(jb);
		
		BuilderPatternDesign bp = new BuilderPatternDesign.Builder(240, 8).
				calories(100).fat(0).sodium(35).carbohydrate(27).build();
		System.out.println(bp);
	}

}
