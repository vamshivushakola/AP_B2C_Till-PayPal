/**
 *
 */
package com.asianpaints.facades.comingsoon;

/*import de.hybris.platform.commercefacades.order.data.ComingSoonCustomerData;*/
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

import com.asianpaints.facades.product.data.ComingSoonCustomerData;


/**
 * @author Dell
 *
 */
public interface AsianpaintsProductFacade
{
	List<ProductData> getComingSoonProducts();

	/**
	 * @param data
	 */
	void saveNotifyMeProducts(ComingSoonCustomerData data);


}


