/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 25, 2016 11:11:52 PM                    ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.user.Customer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ComingSoonCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedComingSoonCustomer extends GenericItem
{
	/** Qualifier of the <code>ComingSoonCustomer.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>ComingSoonCustomer.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>ComingSoonCustomer.emailId</code> attribute **/
	public static final String EMAILID = "emailId";
	/** Qualifier of the <code>ComingSoonCustomer.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>ComingSoonCustomer.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>ComingSoonCustomer.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>ComingSoonCustomer.product</code> attribute **/
	public static final String PRODUCT = "product";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.customer</code> attribute.
	 * @return the customer - Attribute contains customer object that will be used in the process.
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.customer</code> attribute.
	 * @return the customer - Attribute contains customer object that will be used in the process.
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.customer</code> attribute. 
	 * @param value the customer - Attribute contains customer object that will be used in the process.
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		setProperty(ctx, CUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.customer</code> attribute. 
	 * @param value the customer - Attribute contains customer object that will be used in the process.
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.getEmailId requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId()
	{
		return getEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @return the localized emailId
	 */
	public Map<Language,String> getAllEmailId(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,EMAILID,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @return the localized emailId
	 */
	public Map<Language,String> getAllEmailId()
	{
		return getAllEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.setEmailId requires a session language", 0 );
		}
		setLocalizedProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final String value)
	{
		setEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setAllEmailId(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setAllEmailId(final Map<Language,String> value)
	{
		setAllEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.getFirstName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @return the localized firstName
	 */
	public Map<Language,String> getAllFirstName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,FIRSTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @return the localized firstName
	 */
	public Map<Language,String> getAllFirstName()
	{
		return getAllFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.setFirstName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setAllFirstName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setAllFirstName(final Map<Language,String> value)
	{
		setAllFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.getLastName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @return the localized lastName
	 */
	public Map<Language,String> getAllLastName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LASTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @return the localized lastName
	 */
	public Map<Language,String> getAllLastName()
	{
		return getAllLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.setLastName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setAllLastName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setAllLastName(final Map<Language,String> value)
	{
		setAllLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.getProductCode requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @return the localized productCode
	 */
	public Map<Language,String> getAllProductCode(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRODUCTCODE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @return the localized productCode
	 */
	public Map<Language,String> getAllProductCode()
	{
		return getAllProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.setProductCode requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setAllProductCode(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setAllProductCode(final Map<Language,String> value)
	{
		setAllProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.getProductName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @return the localized productName
	 */
	public Map<Language,String> getAllProductName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRODUCTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @return the localized productName
	 */
	public Map<Language,String> getAllProductName()
	{
		return getAllProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedComingSoonCustomer.setProductName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final String value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setAllProductName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ComingSoonCustomer.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setAllProductName(final Map<Language,String> value)
	{
		setAllProductName( getSession().getSessionContext(), value );
	}
	
}
