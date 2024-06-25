/*

  *
  * ******************************************************************************
  *
  *  Copyright (c) 2023-24 Ashish Kumar Singh
  *
  *
  *
  *  Licensed under the Apache License, Version 2.0 (the "License");
  *
  *  you may not use this file except in compliance with the License.
  *
  *  You may obtain a copy of the License at
  *
  *
  *
  *  http://www.apache.org/licenses/LICENSE-2.0
  *
  *
  *  Unless required by applicable law or agreed to in writing, software
  *
  *  distributed under the License is distributed on an "AS IS" BASIS,
  *
  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  *
  *  See the License for the specific language governing permissions and
  *
  *  limitations under the License.
  *
  *
  *
  *  SPDX-License-Identifier: Apache-2.0
  *
  *  *******************************************************************************
  *

 */

package com.example.conf;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

import com.example.conf.TenantContext;

public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

	static String DEFAULT_TENANT = "DEFAULT";
	
	@Override
	public String resolveCurrentTenantIdentifier() {
		String currentTenant = TenantContext.getCurrentTenant();
		return currentTenant != null ? currentTenant : DEFAULT_TENANT;
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return true;
	}

}
