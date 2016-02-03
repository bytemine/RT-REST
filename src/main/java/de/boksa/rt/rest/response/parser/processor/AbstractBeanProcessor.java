/*
 * Copyright (C) 2012  Benjamin Boksa (http://www.boksa.de/)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.boksa.rt.rest.response.parser.processor;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

public abstract class AbstractBeanProcessor implements FieldProcessor {

	protected void copyProperty(Object object, String name, Object value) {
		try {
			BeanUtils.copyProperty(object, StringUtils.uncapitalize(name), value);
		} catch (Exception ex) { }		
	}
	
}