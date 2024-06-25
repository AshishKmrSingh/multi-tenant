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

import static com.example.conf.CurrentTenantIdentifierResolverImpl.DEFAULT_TENANT;

import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class DataSourceBasedMultiTenantConnectionProviderImpl extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {

	private static final long serialVersionUID = 1L;

	@Autowired
	private Map<String,DataSource> mars2DataSources;
	
	@Override
	protected DataSource selectAnyDataSource() {
		return this.mars2DataSources.values().iterator().next();
	}

	@Override
	protected DataSource selectDataSource(String tenantId) {
		return this.mars2DataSources.get(tenantId);
	}

}
