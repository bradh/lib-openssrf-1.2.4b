package us.gov.dod.standard.ssrf._1_2_4.interference;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Memo;

/**
 * IntfVictim
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIntfVictim", propOrder = {
  "victimLinkRef",
  "effectOnPerformance",
  "otherActivities"
})
public class IntfVictim {

  @XmlElement(name = "VictimLinkRef", required = true)
  protected VictimLinkRef victimLinkRef;

  @XmlElement(name = "EffectOnPerformance", required = true)
  protected Memo effectOnPerformance;

  @XmlElement(name = "OtherActivities")
  protected Memo otherActivities;
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

  /**
   * Get
   * <p>
   * @return a {@link VictimLinkRef} instance
   * @since 3.1.0
   */
  public VictimLinkRef getVictimLinkRef() {
    return victimLinkRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link VictimLinkRef} instance
   * @since 3.1.0
   */
  public void setVictimLinkRef(VictimLinkRef value) {
    this.victimLinkRef = value;
  }

  public boolean isSetVictimLinkRef() {
    return (this.victimLinkRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getEffectOnPerformance() {
    return effectOnPerformance;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setEffectOnPerformance(Memo value) {
    this.effectOnPerformance = value;
  }

  public boolean isSetEffectOnPerformance() {
    return (this.effectOnPerformance != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getOtherActivities() {
    return otherActivities;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setOtherActivities(Memo value) {
    this.otherActivities = value;
  }

  public boolean isSetOtherActivities() {
    return (this.otherActivities != null);
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
   * Set
   * <p>
   * @param value An instances of type {@link VictimLinkRef}
   * @return The current IntfVictim object instance
   * @since 3.1.0
   */
  public IntfVictim withVictimLinkRef(VictimLinkRef value) {
    setVictimLinkRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current IntfVictim object instance
   * @since 3.1.0
   */
  public IntfVictim withEffectOnPerformance(Memo value) {
    setEffectOnPerformance(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current IntfVictim object instance
   * @since 3.1.0
   */
  public IntfVictim withOtherActivities(Memo value) {
    setOtherActivities(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfVictim object instance
   * @since 3.1.0
   */
  public IntfVictim withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Get a string representation of this IntfVictim instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "IntfVictim {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link IntfVictim} requires
   * {@link null EffectOnPerformance}, {@link null VictimLinkRef}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEffectOnPerformance() && isSetVictimLinkRef();
  }

}
