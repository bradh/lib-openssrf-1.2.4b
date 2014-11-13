package us.gov.dod.standard.ssrf._1_2_4.shared;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * FreqSep
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFreqSep", propOrder = {
  "value"
})
public class FreqSep {

  @XmlValue
  protected BigDecimal value;
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

  @XmlAttribute(name = "type", required = true)
  protected String type;

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

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
  public String getType() {
    return type;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setType(String value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current FreqSep object instance
   * @since 3.1.0
   */
  public FreqSep withValue(BigDecimal value) {
    setValue(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqSep object instance
   * @since 3.1.0
   */
  public FreqSep withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqSep object instance
   * @since 3.1.0
   */
  public FreqSep withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Get a string representation of this FreqSep instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FreqSep {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqSep} requires {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetType();
  }

}
