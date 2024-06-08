// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package formbuilder.proxies;

public class File extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "FormBuilder.File";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		File_FormField_Response("FormBuilder.File_FormField_Response");

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

	public File(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected File(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fileMendixObject)
	{
		super(context, fileMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, fileMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static formbuilder.proxies.File initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new formbuilder.proxies.File(context, mendixObject);
	}

	public static formbuilder.proxies.File load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return formbuilder.proxies.File.initialize(context, mendixObject);
	}

	public static java.util.List<formbuilder.proxies.File> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> formbuilder.proxies.File.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of File_FormField_Response
	 */
	public final formbuilder.proxies.FormField_Response getFile_FormField_Response() throws com.mendix.core.CoreException
	{
		return getFile_FormField_Response(getContext());
	}

	/**
	 * @param context
	 * @return value of File_FormField_Response
	 * @throws com.mendix.core.CoreException
	 */
	public final formbuilder.proxies.FormField_Response getFile_FormField_Response(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		formbuilder.proxies.FormField_Response result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.File_FormField_Response.toString());
		if (identifier != null) {
			result = formbuilder.proxies.FormField_Response.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of File_FormField_Response
	 * @param file_formfield_response
	 */
	public final void setFile_FormField_Response(formbuilder.proxies.FormField_Response file_formfield_response)
	{
		setFile_FormField_Response(getContext(), file_formfield_response);
	}

	/**
	 * Set value of File_FormField_Response
	 * @param context
	 * @param file_formfield_response
	 */
	public final void setFile_FormField_Response(com.mendix.systemwideinterfaces.core.IContext context, formbuilder.proxies.FormField_Response file_formfield_response)
	{
		if (file_formfield_response == null) {
			getMendixObject().setValue(context, MemberNames.File_FormField_Response.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.File_FormField_Response.toString(), file_formfield_response.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final formbuilder.proxies.File that = (formbuilder.proxies.File) obj;
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