/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 25, 2016 11:11:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import com.asianpaints.core.jalo.ApparelProduct;
import com.asianpaints.core.jalo.ApparelSizeVariantProduct;
import com.asianpaints.core.jalo.ApparelStyleVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsProduct;
import com.asianpaints.core.jalo.AsianpaintsSizeVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsStyleVariantProduct;
import com.asianpaints.core.jalo.ComingSoonCustomer;
import com.asianpaints.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.merchandise.jalo.ProductQuantityThresholdFreeGiftPromotion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>AsianpaintsCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAsianpaintsCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isComingSoon", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsProduct createAsianpaintsProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSPRODUCT );
			return (AsianpaintsProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsProduct createAsianpaintsProduct(final Map attributeValues)
	{
		return createAsianpaintsProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSIZEVARIANTPRODUCT );
			return (AsianpaintsSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSTYLEVARIANTPRODUCT );
			return (AsianpaintsStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AsianpaintsStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ComingSoonCustomer createComingSoonCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.COMINGSOONCUSTOMER );
			return (ComingSoonCustomer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ComingSoonCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public ComingSoonCustomer createComingSoonCustomer(final Map attributeValues)
	{
		return createComingSoonCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.PRODUCTQUANTITYTHRESHOLDFREEGIFTPROMOTION );
			return (ProductQuantityThresholdFreeGiftPromotion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductQuantityThresholdFreeGiftPromotion : "+e.getMessage(), 0 );
		}
	}
	
	public ProductQuantityThresholdFreeGiftPromotion createProductQuantityThresholdFreeGiftPromotion(final Map attributeValues)
	{
		return createProductQuantityThresholdFreeGiftPromotion( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return AsianpaintsCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isComingSoon</code> attribute.
	 * @return the isComingSoon - Coming Soon Products
	 */
	public Boolean isIsComingSoon(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Product.ISCOMINGSOON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isComingSoon</code> attribute.
	 * @return the isComingSoon - Coming Soon Products
	 */
	public Boolean isIsComingSoon(final Product item)
	{
		return isIsComingSoon( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isComingSoon</code> attribute. 
	 * @return the isComingSoon - Coming Soon Products
	 */
	public boolean isIsComingSoonAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isIsComingSoon( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isComingSoon</code> attribute. 
	 * @return the isComingSoon - Coming Soon Products
	 */
	public boolean isIsComingSoonAsPrimitive(final Product item)
	{
		return isIsComingSoonAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Coming Soon Products
	 */
	public void setIsComingSoon(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Product.ISCOMINGSOON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Coming Soon Products
	 */
	public void setIsComingSoon(final Product item, final Boolean value)
	{
		setIsComingSoon( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Coming Soon Products
	 */
	public void setIsComingSoon(final SessionContext ctx, final Product item, final boolean value)
	{
		setIsComingSoon( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Coming Soon Products
	 */
	public void setIsComingSoon(final Product item, final boolean value)
	{
		setIsComingSoon( getSession().getSessionContext(), item, value );
	}
	
}
