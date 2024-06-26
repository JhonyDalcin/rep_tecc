// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gestaoturbo.proxies;

public class Budget implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject budgetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GestaoTurbo.Budget";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TotalPrice("TotalPrice"),
		Review("Review"),
		BudgetStatus("BudgetStatus"),
		Budget_TechnicalEvaluation("GestaoTurbo.Budget_TechnicalEvaluation");

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

	public Budget(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Budget(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject budgetMendixObject)
	{
		if (budgetMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, budgetMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.budgetMendixObject = budgetMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static gestaoturbo.proxies.Budget initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gestaoturbo.proxies.Budget(context, mendixObject);
	}

	public static gestaoturbo.proxies.Budget load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gestaoturbo.proxies.Budget.initialize(context, mendixObject);
	}

	public static java.util.List<gestaoturbo.proxies.Budget> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> gestaoturbo.proxies.Budget.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of TotalPrice
	 */
	public final java.math.BigDecimal getTotalPrice()
	{
		return getTotalPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalPrice
	 */
	public final java.math.BigDecimal getTotalPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TotalPrice.toString());
	}

	/**
	 * Set value of TotalPrice
	 * @param totalprice
	 */
	public final void setTotalPrice(java.math.BigDecimal totalprice)
	{
		setTotalPrice(getContext(), totalprice);
	}

	/**
	 * Set value of TotalPrice
	 * @param context
	 * @param totalprice
	 */
	public final void setTotalPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalprice)
	{
		getMendixObject().setValue(context, MemberNames.TotalPrice.toString(), totalprice);
	}

	/**
	 * @return value of Review
	 */
	public final java.lang.Integer getReview()
	{
		return getReview(getContext());
	}

	/**
	 * @param context
	 * @return value of Review
	 */
	public final java.lang.Integer getReview(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Review.toString());
	}

	/**
	 * Set value of Review
	 * @param review
	 */
	public final void setReview(java.lang.Integer review)
	{
		setReview(getContext(), review);
	}

	/**
	 * Set value of Review
	 * @param context
	 * @param review
	 */
	public final void setReview(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer review)
	{
		getMendixObject().setValue(context, MemberNames.Review.toString(), review);
	}

	/**
	 * Get value of BudgetStatus
	 * @param budgetstatus
	 */
	public final gestaoturbo.proxies.BudgetStatus getBudgetStatus()
	{
		return getBudgetStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of BudgetStatus
	 */
	public final gestaoturbo.proxies.BudgetStatus getBudgetStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BudgetStatus.toString());
		if (obj == null) {
			return null;
		}
		return gestaoturbo.proxies.BudgetStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BudgetStatus
	 * @param budgetstatus
	 */
	public final void setBudgetStatus(gestaoturbo.proxies.BudgetStatus budgetstatus)
	{
		setBudgetStatus(getContext(), budgetstatus);
	}

	/**
	 * Set value of BudgetStatus
	 * @param context
	 * @param budgetstatus
	 */
	public final void setBudgetStatus(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.BudgetStatus budgetstatus)
	{
		if (budgetstatus != null) {
			getMendixObject().setValue(context, MemberNames.BudgetStatus.toString(), budgetstatus.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.BudgetStatus.toString(), null);
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Budget_TechnicalEvaluation
	 */
	public final gestaoturbo.proxies.TechnicalEvaluation getBudget_TechnicalEvaluation() throws com.mendix.core.CoreException
	{
		return getBudget_TechnicalEvaluation(getContext());
	}

	/**
	 * @param context
	 * @return value of Budget_TechnicalEvaluation
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.TechnicalEvaluation getBudget_TechnicalEvaluation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.TechnicalEvaluation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Budget_TechnicalEvaluation.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.TechnicalEvaluation.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Budget_TechnicalEvaluation
	 * @param budget_technicalevaluation
	 */
	public final void setBudget_TechnicalEvaluation(gestaoturbo.proxies.TechnicalEvaluation budget_technicalevaluation)
	{
		setBudget_TechnicalEvaluation(getContext(), budget_technicalevaluation);
	}

	/**
	 * Set value of Budget_TechnicalEvaluation
	 * @param context
	 * @param budget_technicalevaluation
	 */
	public final void setBudget_TechnicalEvaluation(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.TechnicalEvaluation budget_technicalevaluation)
	{
		if (budget_technicalevaluation == null) {
			getMendixObject().setValue(context, MemberNames.Budget_TechnicalEvaluation.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Budget_TechnicalEvaluation.toString(), budget_technicalevaluation.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return budgetMendixObject;
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
			final gestaoturbo.proxies.Budget that = (gestaoturbo.proxies.Budget) obj;
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
