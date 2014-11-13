package us.gov.dod.standard.ssrf._1_2_4.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * NavAids
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNavAids")
public class NavAids {

  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;

  @XmlAttribute(name = "chnl", required = true)
  protected String chnl;

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCls(String value) {
    this.cls = value;
  }

  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getChnl() {
    return chnl;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setChnl(String value) {
    this.chnl = value;
  }

  public boolean isSetChnl() {
    return (this.chnl != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current NavAids object instance
   * @since 3.1.0
   */
  public NavAids withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current NavAids object instance
   * @since 3.1.0
   */
  public NavAids withChnl(String value) {
    setChnl(value);
    return this;
  }

  /**
   * Get a string representation of this NavAids instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "NavAids {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link NavAids} requires {@link null chnl}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetChnl();
  }

}
