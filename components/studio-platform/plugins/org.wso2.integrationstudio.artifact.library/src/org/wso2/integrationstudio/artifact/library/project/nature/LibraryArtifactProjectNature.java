/*
 * Copyright (c) 2011, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.integrationstudio.artifact.library.project.nature;

import org.eclipse.core.runtime.CoreException;
import org.wso2.integrationstudio.platform.core.nature.AbstractWSO2ProjectNature;

public class LibraryArtifactProjectNature extends AbstractWSO2ProjectNature {


	public void configure() throws CoreException {
		try {
			updatePom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updatePom() throws Exception {

	}


	public void deconfigure() throws CoreException {

	}

}
