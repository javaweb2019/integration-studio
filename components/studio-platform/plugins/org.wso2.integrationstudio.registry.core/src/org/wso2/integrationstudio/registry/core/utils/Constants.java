/*
 * Copyright (c) 2010-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.integrationstudio.registry.core.utils;

import java.util.Arrays;
import java.util.List;

import org.eclipse.osgi.util.NLS;

public class Constants extends NLS {
	public static final String BUNDLE_NAME = "org.wso2.integrationstudio.platform.core.registry.util.constants";

	public static final int REGISTRY_RESOURCE = 0;
	public static final int REGISTRY_COLLECTION = 1;
	public static final int REGISTRY_DUMP = 2;
	public static final int REGISTRY_UNDEFINED = -1;
	public static String STATIC_PATHS;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Constants.class);
	}

	private static List<String> staticPathList;

	public static List<String> getStaticPath() {
		if (staticPathList == null) {
			staticPathList = Arrays.asList(STATIC_PATHS.split(","));
		}
		return staticPathList;
	}

}
