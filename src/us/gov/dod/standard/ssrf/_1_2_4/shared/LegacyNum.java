package us.gov.dod.standard.ssrf._1_2_4.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * LegacyNum
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLegacyNum")
public class LegacyNum {

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

  @XmlAttribute(name = "controlNum")
  protected String controlNum;

  @XmlAttribute(name = "docketNum")
  protected String docketNum;

  @XmlAttribute(name = "serialNum")
  protected String serialNum;

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
  public String getControlNum() {
    return controlNum;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setControlNum(String value) {
    this.controlNum = value;
  }

  public boolean isSetControlNum() {
    return (this.controlNum != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getDocketNum() {
    return docketNum;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setDocketNum(String value) {
    this.docketNum = value;
  }

  public boolean isSetDocketNum() {
    return (this.docketNum != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSerialNum() {
    return serialNum;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSerialNum(String value) {
    this.serialNum = value;
  }

  public boolean isSetSerialNum() {
    return (this.serialNum != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LegacyNum object instance
   * @since 3.1.0
   */
  public LegacyNum withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LegacyNum object instance
   * @since 3.1.0
   */
  public LegacyNum withControlNum(String value) {
    setControlNum(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LegacyNum object instance
   * @since 3.1.0
   */
  public LegacyNum withDocketNum(String value) {
    setDocketNum(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LegacyNum object instance
   * @since 3.1.0
   */
  public LegacyNum withSerialNum(String value) {
    setSerialNum(value);
    return this;
  }

  /**
   * Get a string representation of this LegacyNum instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "LegacyNum {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link LegacyNum} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}