// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gestaoturbo.proxies;

public class ClientCar implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject clientCarMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GestaoTurbo.ClientCar";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PlateID("PlateID"),
		ClientCar_Client("GestaoTurbo.ClientCar_Client"),
		ClientCar_Car("GestaoTurbo.ClientCar_Car");

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

	public ClientCar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected ClientCar(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject clientCarMendixObject)
	{
		if (clientCarMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, clientCarMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.clientCarMendixObject = clientCarMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static gestaoturbo.proxies.ClientCar initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gestaoturbo.proxies.ClientCar(context, mendixObject);
	}

	public static gestaoturbo.proxies.ClientCar load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gestaoturbo.proxies.ClientCar.initialize(context, mendixObject);
	}

	public static java.util.List<gestaoturbo.proxies.ClientCar> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> gestaoturbo.proxies.ClientCar.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of PlateID
	 */
	public final java.lang.String getPlateID()
	{
		return getPlateID(getContext());
	}

	/**
	 * @param context
	 * @return value of PlateID
	 */
	public final java.lang.String getPlateID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlateID.toString());
	}

	/**
	 * Set value of PlateID
	 * @param plateid
	 */
	public final void setPlateID(java.lang.String plateid)
	{
		setPlateID(getContext(), plateid);
	}

	/**
	 * Set value of PlateID
	 * @param context
	 * @param plateid
	 */
	public final void setPlateID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plateid)
	{
		getMendixObject().setValue(context, MemberNames.PlateID.toString(), plateid);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ClientCar_Client
	 */
	public final gestaoturbo.proxies.Client getClientCar_Client() throws com.mendix.core.CoreException
	{
		return getClientCar_Client(getContext());
	}

	/**
	 * @param context
	 * @return value of ClientCar_Client
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Client getClientCar_Client(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Client result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ClientCar_Client.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Client.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ClientCar_Client
	 * @param clientcar_client
	 */
	public final void setClientCar_Client(gestaoturbo.proxies.Client clientcar_client)
	{
		setClientCar_Client(getContext(), clientcar_client);
	}

	/**
	 * Set value of ClientCar_Client
	 * @param context
	 * @param clientcar_client
	 */
	public final void setClientCar_Client(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Client clientcar_client)
	{
		if (clientcar_client == null) {
			getMendixObject().setValue(context, MemberNames.ClientCar_Client.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ClientCar_Client.toString(), clientcar_client.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ClientCar_Car
	 */
	public final gestaoturbo.proxies.Car getClientCar_Car() throws com.mendix.core.CoreException
	{
		return getClientCar_Car(getContext());
	}

	/**
	 * @param context
	 * @return value of ClientCar_Car
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Car getClientCar_Car(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Car result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ClientCar_Car.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Car.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ClientCar_Car
	 * @param clientcar_car
	 */
	public final void setClientCar_Car(gestaoturbo.proxies.Car clientcar_car)
	{
		setClientCar_Car(getContext(), clientcar_car);
	}

	/**
	 * Set value of ClientCar_Car
	 * @param context
	 * @param clientcar_car
	 */
	public final void setClientCar_Car(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Car clientcar_car)
	{
		if (clientcar_car == null) {
			getMendixObject().setValue(context, MemberNames.ClientCar_Car.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ClientCar_Car.toString(), clientcar_car.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return clientCarMendixObject;
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
			final gestaoturbo.proxies.ClientCar that = (gestaoturbo.proxies.ClientCar) obj;
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
