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
package us.gov.dod.standard.ssrf._1_2_4;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.adapter.XmlAdapterDATE;

/**
 * TDate
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDate", propOrder = {
  "value"
})
public class TDate {

  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar value;
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
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setValue(Calendar value) {
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
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current TDate object instance
   * @since 3.1.0
   */
  public TDate withValue(Calendar value) {
    setValue(value);
    return this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current TDate object instance
   * @since 3.1.0
   */
  public TDate withValue(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setValue(calendar);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TDate object instance
   * @since 3.1.0
   */
  public TDate withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Get a string representation of this TDate instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TDate {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TDate} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
