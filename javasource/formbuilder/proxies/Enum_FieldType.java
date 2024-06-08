// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package formbuilder.proxies;

public enum Enum_FieldType
{
	TextBox(new java.lang.String[][] { new java.lang.String[] { "en_US", "TextBox" } }),
	TextArea(new java.lang.String[][] { new java.lang.String[] { "en_US", "TextArea" } }),
	RadioButtons(new java.lang.String[][] { new java.lang.String[] { "en_US", "RadioButtons" } }),
	CheckBoxes(new java.lang.String[][] { new java.lang.String[] { "en_US", "CheckBoxes" } }),
	DatePicker(new java.lang.String[][] { new java.lang.String[] { "en_US", "DatePicker" } }),
	ImageUploader(new java.lang.String[][] { new java.lang.String[] { "en_US", "ImageUploader" } }),
	FileManager(new java.lang.String[][] { new java.lang.String[] { "en_US", "FileManager" } }),
	Slider(new java.lang.String[][] { new java.lang.String[] { "en_US", "Slider" } }),
	DropDown(new java.lang.String[][] { new java.lang.String[] { "en_US", "DropDown" } }),
	Rating(new java.lang.String[][] { new java.lang.String[] { "en_US", "Rating" } }),
	Counter(new java.lang.String[][] { new java.lang.String[] { "en_US", "Counter" } }),
	IntegerBox(new java.lang.String[][] { new java.lang.String[] { "en_US", "IntegerBox" } }),
	_Switch(new java.lang.String[][] { new java.lang.String[] { "en_US", "Switch" } }),
	DateRange(new java.lang.String[][] { new java.lang.String[] { "en_US", "DateRange" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_FieldType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
