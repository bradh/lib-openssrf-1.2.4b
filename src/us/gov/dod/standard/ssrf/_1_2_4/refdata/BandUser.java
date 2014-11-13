package us.gov.dod.standard.ssrf._1_2_4.refdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.Memo;

/**
 * BandUser
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBandUser", propOrder = {
  "description"
})
public class BandUser extends Std<BandUser> {

  @XmlElement(name = "Description")
  protected Memo description;

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getDescription() {
    return description;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setDescription(Memo value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current BandUser object instance
   * @since 3.1.0
   */
  public BandUser withDescription(Memo value) {
    setDescription(value);
    return this;
  }

  /**
   * Get a string representation of this BandUser instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "BandUser {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link BandUser} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
