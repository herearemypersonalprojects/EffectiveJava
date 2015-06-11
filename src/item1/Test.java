/**
 * 
 */
package item1;

import item1.impl.ProviderImpl;

/**
 * @author quocanh
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Services.registerDefaultProvider(new ProviderImpl());
		Service service = Services.newInstance();
		System.out.println(service);
	}

}
