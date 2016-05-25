/**
 *
 */
package com.asianpaints.core.comingsoon.service;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import com.asianpaints.facades.product.data.ComingSoonCustomerData;


/**
 * @author Dell
 *
 */
public interface AsianpaintsProductService
{
	List<ProductModel> getComingSoonProducts();

	/**
	 * @param data
	 */
	void saveNotifyMeProducts(ComingSoonCustomerData data);


}
