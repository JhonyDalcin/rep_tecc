// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gestaoturbo.proxies;

public class Client implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject clientMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GestaoTurbo.Client";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Phone("Phone"),
		CPF("CPF"),
		Birthday("Birthday"),
		email("email"),
		Client_Photo("GestaoTurbo.Client_Photo");

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

	public Client(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Client(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject clientMendixObject)
	{
		if (clientMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, clientMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.clientMendixObject = clientMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static gestaoturbo.proxies.Client initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gestaoturbo.proxies.Client(context, mendixObject);
	}

	public static gestaoturbo.proxies.Client load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gestaoturbo.proxies.Client.initialize(context, mendixObject);
	}

	public static java.util.List<gestaoturbo.proxies.Client> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> gestaoturbo.proxies.Client.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Phone
	 */
	public final java.lang.String getPhone()
	{
		return getPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of Phone
	 */
	public final java.lang.String getPhone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Phone.toString());
	}

	/**
	 * Set value of Phone
	 * @param phone
	 */
	public final void setPhone(java.lang.String phone)
	{
		setPhone(getContext(), phone);
	}

	/**
	 * Set value of Phone
	 * @param context
	 * @param phone
	 */
	public final void setPhone(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String phone)
	{
		getMendixObject().setValue(context, MemberNames.Phone.toString(), phone);
	}

	/**
	 * @return value of CPF
	 */
	public final java.lang.String getCPF()
	{
		return getCPF(getContext());
	}

	/**
	 * @param context
	 * @return value of CPF
	 */
	public final java.lang.String getCPF(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CPF.toString());
	}

	/**
	 * Set value of CPF
	 * @param cpf
	 */
	public final void setCPF(java.lang.String cpf)
	{
		setCPF(getContext(), cpf);
	}

	/**
	 * Set value of CPF
	 * @param context
	 * @param cpf
	 */
	public final void setCPF(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cpf)
	{
		getMendixObject().setValue(context, MemberNames.CPF.toString(), cpf);
	}

	/**
	 * @return value of Birthday
	 */
	public final java.util.Date getBirthday()
	{
		return getBirthday(getContext());
	}

	/**
	 * @param context
	 * @return value of Birthday
	 */
	public final java.util.Date getBirthday(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Birthday.toString());
	}

	/**
	 * Set value of Birthday
	 * @param birthday
	 */
	public final void setBirthday(java.util.Date birthday)
	{
		setBirthday(getContext(), birthday);
	}

	/**
	 * Set value of Birthday
	 * @param context
	 * @param birthday
	 */
	public final void setBirthday(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date birthday)
	{
		getMendixObject().setValue(context, MemberNames.Birthday.toString(), birthday);
	}

	/**
	 * @return value of email
	 */
	public final java.lang.String getemail()
	{
		return getemail(getContext());
	}

	/**
	 * @param context
	 * @return value of email
	 */
	public final java.lang.String getemail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.email.toString());
	}

	/**
	 * Set value of email
	 * @param email
	 */
	public final void setemail(java.lang.String email)
	{
		setemail(getContext(), email);
	}

	/**
	 * Set value of email
	 * @param context
	 * @param email
	 */
	public final void setemail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.email.toString(), email);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Client_Photo
	 */
	public final gestaoturbo.proxies.Photo getClient_Photo() throws com.mendix.core.CoreException
	{
		return getClient_Photo(getContext());
	}

	/**
	 * @param context
	 * @return value of Client_Photo
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Photo getClient_Photo(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Photo result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Client_Photo.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Photo.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Client_Photo
	 * @param client_photo
	 */
	public final void setClient_Photo(gestaoturbo.proxies.Photo client_photo)
	{
		setClient_Photo(getContext(), client_photo);
	}

	/**
	 * Set value of Client_Photo
	 * @param context
	 * @param client_photo
	 */
	public final void setClient_Photo(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Photo client_photo)
	{
		if (client_photo == null) {
			getMendixObject().setValue(context, MemberNames.Client_Photo.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Client_Photo.toString(), client_photo.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return clientMendixObject;
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
			final gestaoturbo.proxies.Client that = (gestaoturbo.proxies.Client) obj;
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
