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
package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF SN6_2 data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterSN6_2 extends AXmlAdapterNumber {

  public XmlAdapterSN6_2() {
    super(6, 2, null, null);
  }
}
