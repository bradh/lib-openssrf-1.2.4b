package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * PulseComp
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPulseComp")
public class PulseComp {

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

  @XmlAttribute(name = "minPlsCompRatio", required = true)
  protected BigDecimal minPlsCompRatio;

  @XmlAttribute(name = "maxPlsCompRatio")
  protected BigDecimal maxPlsCompRatio;

  @XmlAttribute(name = "plsCompMethod")
  protected String plsCompMethod;

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
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMinPlsCompRatio() {
    return minPlsCompRatio;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinPlsCompRatio(BigDecimal value) {
    this.minPlsCompRatio = value;
  }

  public boolean isSetMinPlsCompRatio() {
    return (this.minPlsCompRatio != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxPlsCompRatio() {
    return maxPlsCompRatio;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxPlsCompRatio(BigDecimal value) {
    this.maxPlsCompRatio = value;
  }

  public boolean isSetMaxPlsCompRatio() {
    return (this.maxPlsCompRatio != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPlsCompMethod() {
    return plsCompMethod;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPlsCompMethod(String value) {
    this.plsCompMethod = value;
  }

  public boolean isSetPlsCompMethod() {
    return (this.plsCompMethod != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PulseComp object instance
   * @since 3.1.0
   */
  public PulseComp withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseComp object instance
   * @since 3.1.0
   */
  public PulseComp withMinPlsCompRatio(BigDecimal value) {
    setMinPlsCompRatio(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseComp object instance
   * @since 3.1.0
   */
  public PulseComp withMaxPlsCompRatio(BigDecimal value) {
    setMaxPlsCompRatio(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PulseComp object instance
   * @since 3.1.0
   */
  public PulseComp withPlsCompMethod(String value) {
    setPlsCompMethod(value);
    return this;
  }

  /**
   * Get a string representation of this PulseComp instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PulseComp {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PulseComp} requires {@link null minPlsCompRatio}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetMinPlsCompRatio();
  }

}
