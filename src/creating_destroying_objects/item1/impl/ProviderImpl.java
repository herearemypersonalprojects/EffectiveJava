/**
 * 
 */
package creating_destroying_objects.item1.impl;

import creating_destroying_objects.item1.Provider;
import creating_destroying_objects.item1.Service;

/**
 * @author quocanh
 *
 */
public class ProviderImpl implements Provider{

	/* (non-Javadoc)
	 * @see item1.Provider#newService()
	 */
	@Override
	public Service newService() {
		return new ServiceImpl();
	}

}
