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

package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Order;
import com.example.repository.OrderRepository;

import java.sql.Date;



@RestController
@Transactional
public class OrderController {

	@Autowired
    private OrderRepository orderRepository;
		
	@RequestMapping(path = "/orders", method= RequestMethod.POST)
    public ResponseEntity<?> createSampleOrder() {
	
        Order newOrder = new Order(new Date(System.currentTimeMillis()));
        orderRepository.save(newOrder);       
        return ResponseEntity.ok(newOrder);
		
    }
	
}
