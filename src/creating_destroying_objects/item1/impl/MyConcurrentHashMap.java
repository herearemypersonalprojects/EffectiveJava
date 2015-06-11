/**
 * 
 */
package creating_destroying_objects.item1.impl;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author quocanh
 *
 */
public class MyConcurrentHashMap {
	public static <K, V> ConcurrentHashMap<K, V> newInstance() {
		return new ConcurrentHashMap<K, V>();
	}
}
