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
package us.gov.dod.standard.ssrf._1_2_4.ceoi;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * TimePeriod
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTimePeriod", propOrder = {
  "defPyro",
  "defSmoke",
  "netExpander",
  "netSuffix",
  "password",
  "share"
})
public class TimePeriod {

  @XmlElement(name = "DefPyro")
  protected List<DefPyro> defPyro;

  @XmlElement(name = "DefSmoke")
  protected List<DefSmoke> defSmoke;

  @XmlElement(name = "NetExpander")
  protected List<NetExpander> netExpander;

  @XmlElement(name = "NetSuffix")
  protected List<NetSuffix> netSuffix;

  @XmlElement(name = "Password")
  protected List<Password> password;

  @XmlElement(name = "Share")
  protected List<Share> share;
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

  @XmlAttribute(name = "period", required = true)
  protected BigInteger period;

  /**
   * Get
   * <p>
   * @return a {@link DefPyro} instance
   * @since 3.1.0
   */
  public List<DefPyro> getDefPyro() {
    if (defPyro == null) {
      defPyro = new ArrayList<>();
    }
    return this.defPyro;
  }

  public boolean isSetDefPyro() {
    return ((this.defPyro != null) && (!this.defPyro.isEmpty()));
  }

  /**
   * Clear the DefPyro field. This sets the field to null.
   */
  public void unsetDefPyro() {
    this.defPyro = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link DefSmoke} instance
   * @since 3.1.0
   */
  public List<DefSmoke> getDefSmoke() {
    if (defSmoke == null) {
      defSmoke = new ArrayList<>();
    }
    return this.defSmoke;
  }

  public boolean isSetDefSmoke() {
    return ((this.defSmoke != null) && (!this.defSmoke.isEmpty()));
  }

  /**
   * Clear the DefSmoke field. This sets the field to null.
   */
  public void unsetDefSmoke() {
    this.defSmoke = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link NetExpander} instance
   * @since 3.1.0
   */
  public List<NetExpander> getNetExpander() {
    if (netExpander == null) {
      netExpander = new ArrayList<>();
    }
    return this.netExpander;
  }

  public boolean isSetNetExpander() {
    return ((this.netExpander != null) && (!this.netExpander.isEmpty()));
  }

  /**
   * Clear the NetExpander field. This sets the field to null.
   */
  public void unsetNetExpander() {
    this.netExpander = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link NetSuffix} instance
   * @since 3.1.0
   */
  public List<NetSuffix> getNetSuffix() {
    if (netSuffix == null) {
      netSuffix = new ArrayList<>();
    }
    return this.netSuffix;
  }

  public boolean isSetNetSuffix() {
    return ((this.netSuffix != null) && (!this.netSuffix.isEmpty()));
  }

  /**
   * Clear the NetSuffix field. This sets the field to null.
   */
  public void unsetNetSuffix() {
    this.netSuffix = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Password} instance
   * @since 3.1.0
   */
  public List<Password> getPassword() {
    if (password == null) {
      password = new ArrayList<>();
    }
    return this.password;
  }

  public boolean isSetPassword() {
    return ((this.password != null) && (!this.password.isEmpty()));
  }

  /**
   * Clear the Password field. This sets the field to null.
   */
  public void unsetPassword() {
    this.password = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Share} instance
   * @since 3.1.0
   */
  public List<Share> getShare() {
    if (share == null) {
      share = new ArrayList<>();
    }
    return this.share;
  }

  public boolean isSetShare() {
    return ((this.share != null) && (!this.share.isEmpty()));
  }

  /**
   * Clear the Share field. This sets the field to null.
   */
  public void unsetShare() {
    this.share = null;
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
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getPeriod() {
    return period;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setPeriod(BigInteger value) {
    this.period = value;
  }

  public boolean isSetPeriod() {
    return (this.period != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link DefPyro...}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withDefPyro(DefPyro... values) {
    if (values != null) {
      getDefPyro().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link DefPyro} instances
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withDefPyro(Collection<DefPyro> values) {
    if (values != null) {
      getDefPyro().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link DefSmoke...}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withDefSmoke(DefSmoke... values) {
    if (values != null) {
      getDefSmoke().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link DefSmoke} instances
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withDefSmoke(Collection<DefSmoke> values) {
    if (values != null) {
      getDefSmoke().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NetExpander...}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withNetExpander(NetExpander... values) {
    if (values != null) {
      getNetExpander().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link NetExpander} instances
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withNetExpander(Collection<NetExpander> values) {
    if (values != null) {
      getNetExpander().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NetSuffix...}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withNetSuffix(NetSuffix... values) {
    if (values != null) {
      getNetSuffix().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link NetSuffix} instances
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withNetSuffix(Collection<NetSuffix> values) {
    if (values != null) {
      getNetSuffix().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Password...}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withPassword(Password... values) {
    if (values != null) {
      getPassword().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Password} instances
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withPassword(Collection<Password> values) {
    if (values != null) {
      getPassword().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Share...}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withShare(Share... values) {
    if (values != null) {
      getShare().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Share} instances
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withShare(Collection<Share> values) {
    if (values != null) {
      getShare().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current TimePeriod object instance
   * @since 3.1.0
   */
  public TimePeriod withPeriod(BigInteger value) {
    setPeriod(value);
    return this;
  }

  /**
   * Get a string representation of this TimePeriod instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TimePeriod {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TimePeriod} requires {@link null period}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetPeriod();
  }

}
