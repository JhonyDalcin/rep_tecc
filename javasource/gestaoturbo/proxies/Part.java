// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gestaoturbo.proxies;

public class Part implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject partMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GestaoTurbo.Part";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PartNumber("PartNumber"),
		Description("Description"),
		Unit("Unit"),
		Part_Car("GestaoTurbo.Part_Car");

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

	public Part(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Part(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject partMendixObject)
	{
		if (partMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, partMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.partMendixObject = partMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static gestaoturbo.proxies.Part initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gestaoturbo.proxies.Part(context, mendixObject);
	}

	public static gestaoturbo.proxies.Part load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gestaoturbo.proxies.Part.initialize(context, mendixObject);
	}

	public static java.util.List<gestaoturbo.proxies.Part> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> gestaoturbo.proxies.Part.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of PartNumber
	 */
	public final java.lang.Long getPartNumber()
	{
		return getPartNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PartNumber
	 */
	public final java.lang.Long getPartNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.PartNumber.toString());
	}

	/**
	 * Set value of PartNumber
	 * @param partnumber
	 */
	public final void setPartNumber(java.lang.Long partnumber)
	{
		setPartNumber(getContext(), partnumber);
	}

	/**
	 * Set value of PartNumber
	 * @param context
	 * @param partnumber
	 */
	public final void setPartNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long partnumber)
	{
		getMendixObject().setValue(context, MemberNames.PartNumber.toString(), partnumber);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Unit
	 */
	public final java.lang.String getUnit()
	{
		return getUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of Unit
	 */
	public final java.lang.String getUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Unit.toString());
	}

	/**
	 * Set value of Unit
	 * @param unit
	 */
	public final void setUnit(java.lang.String unit)
	{
		setUnit(getContext(), unit);
	}

	/**
	 * Set value of Unit
	 * @param context
	 * @param unit
	 */
	public final void setUnit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String unit)
	{
		getMendixObject().setValue(context, MemberNames.Unit.toString(), unit);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Part_Car
	 */
	public final gestaoturbo.proxies.Car getPart_Car() throws com.mendix.core.CoreException
	{
		return getPart_Car(getContext());
	}

	/**
	 * @param context
	 * @return value of Part_Car
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Car getPart_Car(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Car result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Part_Car.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Car.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Part_Car
	 * @param part_car
	 */
	public final void setPart_Car(gestaoturbo.proxies.Car part_car)
	{
		setPart_Car(getContext(), part_car);
	}

	/**
	 * Set value of Part_Car
	 * @param context
	 * @param part_car
	 */
	public final void setPart_Car(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Car part_car)
	{
		if (part_car == null) {
			getMendixObject().setValue(context, MemberNames.Part_Car.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Part_Car.toString(), part_car.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return partMendixObject;
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
			final gestaoturbo.proxies.Part that = (gestaoturbo.proxies.Part) obj;
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