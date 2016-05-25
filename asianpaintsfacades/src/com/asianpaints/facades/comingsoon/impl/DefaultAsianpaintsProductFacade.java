/**
 *
 */
package com.asianpaints.facades.comingsoon.impl;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.asianpaints.core.comingsoon.service.AsianpaintsProductService;
import com.asianpaints.facades.comingsoon.AsianpaintsProductFacade;
import com.asianpaints.facades.product.data.ComingSoonCustomerData;


public class DefaultAsianpaintsProductFacade implements AsianpaintsProductFacade
{
	AsianpaintsProductService asianpaintsProductService;
	private Converter<ProductModel, ProductData> productConverter;


	@Override
	public List<ProductData> getComingSoonProducts()
	{
		final List<ProductModel> productModel = getAsianpaintsProductService().getComingSoonProducts();
		return Converters.convertAll(productModel, getProductConverter());
	}



	/*
	 * @Override public void saveNotifyMeProducts() { getAsianpaintsProductService().saveNotifyMeProducts(); }
	 */

	/**
	 * @return the productConverter
	 */
	public Converter<ProductModel, ProductData> getProductConverter()
	{
		return productConverter;
	}

	/**
	 * @param productConverter
	 *           the productConverter to set
	 */
	public void setProductConverter(final Converter<ProductModel, ProductData> productConverter)
	{
		this.productConverter = productConverter;
	}

	/**
	 * @return the asianpaintsProductService
	 */
	public AsianpaintsProductService getAsianpaintsProductService()
	{
		return asianpaintsProductService;
	}

	/**
	 * @param asianpaintsProductService
	 *           the asianpaintsProductService to set
	 */

	@Required
	public void setAsianpaintsProductService(final AsianpaintsProductService asianpaintsProductService)
	{
		this.asianpaintsProductService = asianpaintsProductService;
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see com.asianpaints.facades.comingsoon.AsianpaintsProductFacade#saveNotifyMeProducts(de.hybris.platform.
	 * commercefacades.order.data.ComingSoonCustomerData)
	 */
	@Override
	public void saveNotifyMeProducts(final ComingSoonCustomerData data)
	{
		getAsianpaintsProductService().saveNotifyMeProducts(data);
	}
}
