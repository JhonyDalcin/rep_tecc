// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gestaoturbo.proxies;

public class BudgetItem implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject budgetItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GestaoTurbo.BudgetItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Quantity("Quantity"),
		UnitPrice("UnitPrice"),
		isPart("isPart"),
		ItemPrice("ItemPrice"),
		BudgetItem_Part("GestaoTurbo.BudgetItem_Part"),
		BudgetItem_Budget("GestaoTurbo.BudgetItem_Budget"),
		BudgetItem_Service("GestaoTurbo.BudgetItem_Service");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public BudgetItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected BudgetItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject budgetItemMendixObject)
	{
		if (budgetItemMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, budgetItemMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.budgetItemMendixObject = budgetItemMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static gestaoturbo.proxies.BudgetItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gestaoturbo.proxies.BudgetItem(context, mendixObject);
	}

	public static gestaoturbo.proxies.BudgetItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gestaoturbo.proxies.BudgetItem.initialize(context, mendixObject);
	}

	public static java.util.List<gestaoturbo.proxies.BudgetItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> gestaoturbo.proxies.BudgetItem.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Quantity
	 */
	public final java.math.BigDecimal getQuantity()
	{
		return getQuantity(getContext());
	}

	/**
	 * @param context
	 * @return value of Quantity
	 */
	public final java.math.BigDecimal getQuantity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Quantity.toString());
	}

	/**
	 * Set value of Quantity
	 * @param quantity
	 */
	public final void setQuantity(java.math.BigDecimal quantity)
	{
		setQuantity(getContext(), quantity);
	}

	/**
	 * Set value of Quantity
	 * @param context
	 * @param quantity
	 */
	public final void setQuantity(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal quantity)
	{
		getMendixObject().setValue(context, MemberNames.Quantity.toString(), quantity);
	}

	/**
	 * @return value of UnitPrice
	 */
	public final java.math.BigDecimal getUnitPrice()
	{
		return getUnitPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of UnitPrice
	 */
	public final java.math.BigDecimal getUnitPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.UnitPrice.toString());
	}

	/**
	 * Set value of UnitPrice
	 * @param unitprice
	 */
	public final void setUnitPrice(java.math.BigDecimal unitprice)
	{
		setUnitPrice(getContext(), unitprice);
	}

	/**
	 * Set value of UnitPrice
	 * @param context
	 * @param unitprice
	 */
	public final void setUnitPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal unitprice)
	{
		getMendixObject().setValue(context, MemberNames.UnitPrice.toString(), unitprice);
	}

	/**
	 * @return value of isPart
	 */
	public final java.lang.Boolean getisPart()
	{
		return getisPart(getContext());
	}

	/**
	 * @param context
	 * @return value of isPart
	 */
	public final java.lang.Boolean getisPart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.isPart.toString());
	}

	/**
	 * Set value of isPart
	 * @param ispart
	 */
	public final void setisPart(java.lang.Boolean ispart)
	{
		setisPart(getContext(), ispart);
	}

	/**
	 * Set value of isPart
	 * @param context
	 * @param ispart
	 */
	public final void setisPart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ispart)
	{
		getMendixObject().setValue(context, MemberNames.isPart.toString(), ispart);
	}

	/**
	 * @return value of ItemPrice
	 */
	public final java.math.BigDecimal getItemPrice()
	{
		return getItemPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemPrice
	 */
	public final java.math.BigDecimal getItemPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.ItemPrice.toString());
	}

	/**
	 * Set value of ItemPrice
	 * @param itemprice
	 */
	public final void setItemPrice(java.math.BigDecimal itemprice)
	{
		setItemPrice(getContext(), itemprice);
	}

	/**
	 * Set value of ItemPrice
	 * @param context
	 * @param itemprice
	 */
	public final void setItemPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal itemprice)
	{
		getMendixObject().setValue(context, MemberNames.ItemPrice.toString(), itemprice);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of BudgetItem_Part
	 */
	public final gestaoturbo.proxies.Part getBudgetItem_Part() throws com.mendix.core.CoreException
	{
		return getBudgetItem_Part(getContext());
	}

	/**
	 * @param context
	 * @return value of BudgetItem_Part
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Part getBudgetItem_Part(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Part result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BudgetItem_Part.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Part.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of BudgetItem_Part
	 * @param budgetitem_part
	 */
	public final void setBudgetItem_Part(gestaoturbo.proxies.Part budgetitem_part)
	{
		setBudgetItem_Part(getContext(), budgetitem_part);
	}

	/**
	 * Set value of BudgetItem_Part
	 * @param context
	 * @param budgetitem_part
	 */
	public final void setBudgetItem_Part(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Part budgetitem_part)
	{
		if (budgetitem_part == null) {
			getMendixObject().setValue(context, MemberNames.BudgetItem_Part.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.BudgetItem_Part.toString(), budgetitem_part.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of BudgetItem_Budget
	 */
	public final gestaoturbo.proxies.Budget getBudgetItem_Budget() throws com.mendix.core.CoreException
	{
		return getBudgetItem_Budget(getContext());
	}

	/**
	 * @param context
	 * @return value of BudgetItem_Budget
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Budget getBudgetItem_Budget(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Budget result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BudgetItem_Budget.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Budget.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of BudgetItem_Budget
	 * @param budgetitem_budget
	 */
	public final void setBudgetItem_Budget(gestaoturbo.proxies.Budget budgetitem_budget)
	{
		setBudgetItem_Budget(getContext(), budgetitem_budget);
	}

	/**
	 * Set value of BudgetItem_Budget
	 * @param context
	 * @param budgetitem_budget
	 */
	public final void setBudgetItem_Budget(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Budget budgetitem_budget)
	{
		if (budgetitem_budget == null) {
			getMendixObject().setValue(context, MemberNames.BudgetItem_Budget.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.BudgetItem_Budget.toString(), budgetitem_budget.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of BudgetItem_Service
	 */
	public final gestaoturbo.proxies.Service getBudgetItem_Service() throws com.mendix.core.CoreException
	{
		return getBudgetItem_Service(getContext());
	}

	/**
	 * @param context
	 * @return value of BudgetItem_Service
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Service getBudgetItem_Service(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Service result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BudgetItem_Service.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Service.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of BudgetItem_Service
	 * @param budgetitem_service
	 */
	public final void setBudgetItem_Service(gestaoturbo.proxies.Service budgetitem_service)
	{
		setBudgetItem_Service(getContext(), budgetitem_service);
	}

	/**
	 * Set value of BudgetItem_Service
	 * @param context
	 * @param budgetitem_service
	 */
	public final void setBudgetItem_Service(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Service budgetitem_service)
	{
		if (budgetitem_service == null) {
			getMendixObject().setValue(context, MemberNames.BudgetItem_Service.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.BudgetItem_Service.toString(), budgetitem_service.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return budgetItemMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final gestaoturbo.proxies.BudgetItem that = (gestaoturbo.proxies.BudgetItem) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}