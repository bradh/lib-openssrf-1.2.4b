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
package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.BSMPlan;
import us.gov.dod.standard.ssrf._1_2_4.shared.ContactOrgRef;

/**
 * Enumerated values for fields using the ListCR type.
 * <p>
 * Used in {@link BSMPlan}, {@link ContactOrgRef}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlType(name = "ListCR")
@XmlEnum
public enum ListCR {

  AU,
  AUTH,
  COORD,
  FM,
  GATEWAY,
  LICENSEE,
  OTHER,
  OWNER,
  PE,
  PM,
  SM,
  STNCTRL,
  STOP,
  SUPPLIER,
  USER;

  public String value() {
    return name();
  }

  public static ListCR fromValue(String v) {
    return valueOf(v);
  }

}
