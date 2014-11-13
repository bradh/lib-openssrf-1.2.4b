package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF TTELFAXNUM data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterTTELFAXNUM extends AXmlAdapterString {

  public XmlAdapterTTELFAXNUM() {
    super(null, null, false, "[0-9]{1,20}");
  }
}