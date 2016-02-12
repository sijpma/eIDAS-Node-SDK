/* 
 * 
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * 
 * Date: 09 Feb 2016
 * Authors: Governikus GmbH & Co. KG
 * 
*/
package de.governikus.eidassaml.starterkit.natural_persons_attribute;

import de.governikus.eidassaml.starterkit.EidasAttribute;
import de.governikus.eidassaml.starterkit.EidasNaturalPersonAttributes;
import de.governikus.eidassaml.starterkit.template.TemplateLoader;

public class BirthNameAttribute extends AbstractNameAttribute{
	
	public BirthNameAttribute(String value) {
		super(value);
	}
	
	public BirthNameAttribute(String value, String transliteratedValue) {
		super(value,transliteratedValue);
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return EidasAttribute.TYPE_BirthName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type() + " " + getValue();
	}

	@Override
	public EidasNaturalPersonAttributes getNaturalPersonAttributeType() {
		// TODO Auto-generated method stub
		return EidasNaturalPersonAttributes.BirthName;
	}	
}