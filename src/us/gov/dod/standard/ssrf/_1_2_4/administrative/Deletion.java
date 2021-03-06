/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._1_2_4.administrative;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Memo;

/**
 * Deletion
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDeletion", propOrder = {
  "reason",
  "dataset"
})
public class Deletion {

  @XmlElement(name = "Reason")
  protected Memo reason;

  @XmlElement(name = "Dataset", required = true)
  protected List<Dataset> dataset;
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

  @XmlAttribute(name = "serial", required = true)
  protected String serial;

  @XmlAttribute(name = "origin", required = true)
  protected String origin;

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getReason() {
    return reason;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setReason(Memo value) {
    this.reason = value;
  }

  public boolean isSetReason() {
    return (this.reason != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Dataset} instance
   * @since 3.1.0
   */
  public List<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new ArrayList<>();
    }
    return this.dataset;
  }

  public boolean isSetDataset() {
    return ((this.dataset != null) && (!this.dataset.isEmpty()));
  }

  /**
   * Clear the Dataset field. This sets the field to null.
   */
  public void unsetDataset() {
    this.dataset = null;
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
  public String getSerial() {
    return serial;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSerial(String value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOrigin(String value) {
    this.origin = value;
  }

  public boolean isSetOrigin() {
    return (this.origin != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current Deletion object instance
   * @since 3.1.0
   */
  public Deletion withReason(Memo value) {
    setReason(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Dataset...}
   * @return The current Deletion object instance
   * @since 3.1.0
   */
  public Deletion withDataset(Dataset... values) {
    if (values != null) {
      getDataset().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Dataset} instances
   * @return The current Deletion object instance
   * @since 3.1.0
   */
  public Deletion withDataset(Collection<Dataset> values) {
    if (values != null) {
      getDataset().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Deletion object instance
   * @since 3.1.0
   */
  public Deletion withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Deletion object instance
   * @since 3.1.0
   */
  public Deletion withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Deletion object instance
   * @since 3.1.0
   */
  public Deletion withOrigin(String value) {
    setOrigin(value);
    return this;
  }

  /**
   * Get a string representation of this Deletion instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Deletion {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Deletion} requires
   * {@link null Dataset}, {@link null origin}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDataset() && isSetOrigin() && isSetSerial();
  }

}
