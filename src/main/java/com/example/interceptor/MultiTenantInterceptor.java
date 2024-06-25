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

package com.example.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.conf.TenantContext;

public class MultiTenantInterceptor extends HandlerInterceptorAdapter {

	private static final String TENANT_HEADER_NAME = "X-TenantID";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String tenantId = request.getHeader(TENANT_HEADER_NAME);
		TenantContext.setCurrentTenant(tenantId);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView model) throws Exception {
		TenantContext.clear();
	}
	
}
