// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gestaoturbo.proxies;

public class TechnicalEvaluation implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject technicalEvaluationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GestaoTurbo.TechnicalEvaluation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TechEvaluID("TechEvaluID"),
		StartTime("StartTime"),
		EndTime("EndTime"),
		Issue("Issue"),
		Diagnosis("Diagnosis"),
		TechnicalEvaluationStatus("TechnicalEvaluationStatus"),
		Color("Color"),
		allDayDuration("allDayDuration"),
		TechnicalEvaluation_Client("GestaoTurbo.TechnicalEvaluation_Client"),
		TechnicalEvaluation_ClientCar("GestaoTurbo.TechnicalEvaluation_ClientCar"),
		TechnicalEvaluation_Performer("GestaoTurbo.TechnicalEvaluation_Performer");

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

	public TechnicalEvaluation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TechnicalEvaluation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject technicalEvaluationMendixObject)
	{
		if (technicalEvaluationMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, technicalEvaluationMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.technicalEvaluationMendixObject = technicalEvaluationMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static gestaoturbo.proxies.TechnicalEvaluation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gestaoturbo.proxies.TechnicalEvaluation(context, mendixObject);
	}

	public static gestaoturbo.proxies.TechnicalEvaluation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gestaoturbo.proxies.TechnicalEvaluation.initialize(context, mendixObject);
	}

	public static java.util.List<gestaoturbo.proxies.TechnicalEvaluation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> gestaoturbo.proxies.TechnicalEvaluation.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of TechEvaluID
	 */
	public final java.lang.Long getTechEvaluID()
	{
		return getTechEvaluID(getContext());
	}

	/**
	 * @param context
	 * @return value of TechEvaluID
	 */
	public final java.lang.Long getTechEvaluID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TechEvaluID.toString());
	}

	/**
	 * Set value of TechEvaluID
	 * @param techevaluid
	 */
	public final void setTechEvaluID(java.lang.Long techevaluid)
	{
		setTechEvaluID(getContext(), techevaluid);
	}

	/**
	 * Set value of TechEvaluID
	 * @param context
	 * @param techevaluid
	 */
	public final void setTechEvaluID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long techevaluid)
	{
		getMendixObject().setValue(context, MemberNames.TechEvaluID.toString(), techevaluid);
	}

	/**
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime()
	{
		return getStartTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartTime.toString());
	}

	/**
	 * Set value of StartTime
	 * @param starttime
	 */
	public final void setStartTime(java.util.Date starttime)
	{
		setStartTime(getContext(), starttime);
	}

	/**
	 * Set value of StartTime
	 * @param context
	 * @param starttime
	 */
	public final void setStartTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date starttime)
	{
		getMendixObject().setValue(context, MemberNames.StartTime.toString(), starttime);
	}

	/**
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime()
	{
		return getEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndTime.toString());
	}

	/**
	 * Set value of EndTime
	 * @param endtime
	 */
	public final void setEndTime(java.util.Date endtime)
	{
		setEndTime(getContext(), endtime);
	}

	/**
	 * Set value of EndTime
	 * @param context
	 * @param endtime
	 */
	public final void setEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date endtime)
	{
		getMendixObject().setValue(context, MemberNames.EndTime.toString(), endtime);
	}

	/**
	 * @return value of Issue
	 */
	public final java.lang.String getIssue()
	{
		return getIssue(getContext());
	}

	/**
	 * @param context
	 * @return value of Issue
	 */
	public final java.lang.String getIssue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Issue.toString());
	}

	/**
	 * Set value of Issue
	 * @param issue
	 */
	public final void setIssue(java.lang.String issue)
	{
		setIssue(getContext(), issue);
	}

	/**
	 * Set value of Issue
	 * @param context
	 * @param issue
	 */
	public final void setIssue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String issue)
	{
		getMendixObject().setValue(context, MemberNames.Issue.toString(), issue);
	}

	/**
	 * @return value of Diagnosis
	 */
	public final java.lang.String getDiagnosis()
	{
		return getDiagnosis(getContext());
	}

	/**
	 * @param context
	 * @return value of Diagnosis
	 */
	public final java.lang.String getDiagnosis(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Diagnosis.toString());
	}

	/**
	 * Set value of Diagnosis
	 * @param diagnosis
	 */
	public final void setDiagnosis(java.lang.String diagnosis)
	{
		setDiagnosis(getContext(), diagnosis);
	}

	/**
	 * Set value of Diagnosis
	 * @param context
	 * @param diagnosis
	 */
	public final void setDiagnosis(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String diagnosis)
	{
		getMendixObject().setValue(context, MemberNames.Diagnosis.toString(), diagnosis);
	}

	/**
	 * Get value of TechnicalEvaluationStatus
	 * @param technicalevaluationstatus
	 */
	public final gestaoturbo.proxies.TechnicalEvaluationStatus getTechnicalEvaluationStatus()
	{
		return getTechnicalEvaluationStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of TechnicalEvaluationStatus
	 */
	public final gestaoturbo.proxies.TechnicalEvaluationStatus getTechnicalEvaluationStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TechnicalEvaluationStatus.toString());
		if (obj == null) {
			return null;
		}
		return gestaoturbo.proxies.TechnicalEvaluationStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TechnicalEvaluationStatus
	 * @param technicalevaluationstatus
	 */
	public final void setTechnicalEvaluationStatus(gestaoturbo.proxies.TechnicalEvaluationStatus technicalevaluationstatus)
	{
		setTechnicalEvaluationStatus(getContext(), technicalevaluationstatus);
	}

	/**
	 * Set value of TechnicalEvaluationStatus
	 * @param context
	 * @param technicalevaluationstatus
	 */
	public final void setTechnicalEvaluationStatus(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.TechnicalEvaluationStatus technicalevaluationstatus)
	{
		if (technicalevaluationstatus != null) {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluationStatus.toString(), technicalevaluationstatus.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluationStatus.toString(), null);
		}
	}

	/**
	 * @return value of Color
	 */
	public final java.lang.String getColor()
	{
		return getColor(getContext());
	}

	/**
	 * @param context
	 * @return value of Color
	 */
	public final java.lang.String getColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Color.toString());
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final void setColor(java.lang.String color)
	{
		setColor(getContext(), color);
	}

	/**
	 * Set value of Color
	 * @param context
	 * @param color
	 */
	public final void setColor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String color)
	{
		getMendixObject().setValue(context, MemberNames.Color.toString(), color);
	}

	/**
	 * @return value of allDayDuration
	 */
	public final java.lang.Boolean getallDayDuration()
	{
		return getallDayDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of allDayDuration
	 */
	public final java.lang.Boolean getallDayDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.allDayDuration.toString());
	}

	/**
	 * Set value of allDayDuration
	 * @param alldayduration
	 */
	public final void setallDayDuration(java.lang.Boolean alldayduration)
	{
		setallDayDuration(getContext(), alldayduration);
	}

	/**
	 * Set value of allDayDuration
	 * @param context
	 * @param alldayduration
	 */
	public final void setallDayDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean alldayduration)
	{
		getMendixObject().setValue(context, MemberNames.allDayDuration.toString(), alldayduration);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TechnicalEvaluation_Client
	 */
	public final gestaoturbo.proxies.Client getTechnicalEvaluation_Client() throws com.mendix.core.CoreException
	{
		return getTechnicalEvaluation_Client(getContext());
	}

	/**
	 * @param context
	 * @return value of TechnicalEvaluation_Client
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.Client getTechnicalEvaluation_Client(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.Client result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TechnicalEvaluation_Client.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.Client.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TechnicalEvaluation_Client
	 * @param technicalevaluation_client
	 */
	public final void setTechnicalEvaluation_Client(gestaoturbo.proxies.Client technicalevaluation_client)
	{
		setTechnicalEvaluation_Client(getContext(), technicalevaluation_client);
	}

	/**
	 * Set value of TechnicalEvaluation_Client
	 * @param context
	 * @param technicalevaluation_client
	 */
	public final void setTechnicalEvaluation_Client(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.Client technicalevaluation_client)
	{
		if (technicalevaluation_client == null) {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluation_Client.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluation_Client.toString(), technicalevaluation_client.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TechnicalEvaluation_ClientCar
	 */
	public final gestaoturbo.proxies.ClientCar getTechnicalEvaluation_ClientCar() throws com.mendix.core.CoreException
	{
		return getTechnicalEvaluation_ClientCar(getContext());
	}

	/**
	 * @param context
	 * @return value of TechnicalEvaluation_ClientCar
	 * @throws com.mendix.core.CoreException
	 */
	public final gestaoturbo.proxies.ClientCar getTechnicalEvaluation_ClientCar(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gestaoturbo.proxies.ClientCar result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TechnicalEvaluation_ClientCar.toString());
		if (identifier != null) {
			result = gestaoturbo.proxies.ClientCar.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TechnicalEvaluation_ClientCar
	 * @param technicalevaluation_clientcar
	 */
	public final void setTechnicalEvaluation_ClientCar(gestaoturbo.proxies.ClientCar technicalevaluation_clientcar)
	{
		setTechnicalEvaluation_ClientCar(getContext(), technicalevaluation_clientcar);
	}

	/**
	 * Set value of TechnicalEvaluation_ClientCar
	 * @param context
	 * @param technicalevaluation_clientcar
	 */
	public final void setTechnicalEvaluation_ClientCar(com.mendix.systemwideinterfaces.core.IContext context, gestaoturbo.proxies.ClientCar technicalevaluation_clientcar)
	{
		if (technicalevaluation_clientcar == null) {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluation_ClientCar.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluation_ClientCar.toString(), technicalevaluation_clientcar.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TechnicalEvaluation_Performer
	 */
	public final administration.proxies.Account getTechnicalEvaluation_Performer() throws com.mendix.core.CoreException
	{
		return getTechnicalEvaluation_Performer(getContext());
	}

	/**
	 * @param context
	 * @return value of TechnicalEvaluation_Performer
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getTechnicalEvaluation_Performer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TechnicalEvaluation_Performer.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TechnicalEvaluation_Performer
	 * @param technicalevaluation_performer
	 */
	public final void setTechnicalEvaluation_Performer(administration.proxies.Account technicalevaluation_performer)
	{
		setTechnicalEvaluation_Performer(getContext(), technicalevaluation_performer);
	}

	/**
	 * Set value of TechnicalEvaluation_Performer
	 * @param context
	 * @param technicalevaluation_performer
	 */
	public final void setTechnicalEvaluation_Performer(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account technicalevaluation_performer)
	{
		if (technicalevaluation_performer == null) {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluation_Performer.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TechnicalEvaluation_Performer.toString(), technicalevaluation_performer.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return technicalEvaluationMendixObject;
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
			final gestaoturbo.proxies.TechnicalEvaluation that = (gestaoturbo.proxies.TechnicalEvaluation) obj;
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