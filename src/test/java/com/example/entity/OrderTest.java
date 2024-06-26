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

package com.example.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order();
    }

    @Test
    public void orderCreation_dateIsSet() {
        Date expectedDate = new Date(System.currentTimeMillis());
        order = new Order(expectedDate);

        assertEquals(expectedDate, order.getDate());
    }

    @Test
    public void orderCreation_noDateProvided() {
        assertNotNull(order);
    }
}
