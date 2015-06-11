/**
 * 
 */
package item1.impl;

import item1.Provider;
import item1.Service;

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
