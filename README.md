<!--
 * Copyright (C) 2020,2022 Eclipse Foundation and others. 
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-FileType: DOCUMENTATION
 * SPDX-FileCopyrightText: 2024 Ashish Kumar Singh
 * SPDX-License-Identifier: Apache-2.0
-->

[![CodeQL](https://github.com/AshishKmrSingh/multi-tenant/actions/workflows/codeql.yml/badge.svg)](https://github.com/AshishKmrSingh/multi-tenant/actions/workflows/codeql.yml)
[![OpenSSF Scorecard](https://api.scorecard.dev/projects/github.com/AshishKmrSingh/multi-tenant/badge)](https://scorecard.dev/viewer/?uri=github.com/AshishKmrSingh/multi-tenant)
[![SONAR Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=AshishKmrSingh_multi-tenant&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=AshishKmrSingh_multi-tenant)
[![SONAR Cloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=AshishKmrSingh_multi-tenant&metric=coverage)](https://sonarcloud.io/summary/new_code?id=AshishKmrSingh_multi-tenant)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/ea2fc4886cb040d99e1d5cfbf6d1bbb5)](https://app.codacy.com/gh/AshishKmrSingh/multi-tenant/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)
[![Codacy Coverage](https://app.codacy.com/project/badge/Coverage/ea2fc4886cb040d99e1d5cfbf6d1bbb5)](https://app.codacy.com/gh/AshishKmrSingh/multi-tenant/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_coverage)
[![Known Vulnerabilities](https://snyk.io/test/github/AshishKmrSingh/multi-tenant/badge.svg)](https://snyk.io/test/github/AshishKmrSingh/multi-tenant)
[![License Compliance](https://github.com/AshishKmrSingh/multi-tenant/actions/workflows/license-compliance.yml/badge.svg)](https://github.com/AshishKmrSingh/multi-tenant/actions/workflows/license-compliance.yml)

Spring Boot Hibernate Multi-tenant Demo
---------------------------------------
This sample project uses hibernate "SEPARATE DATABASE" multi-tenant strategy, and it also allows you to plugin new database (datasources) at runtime.

Useful resources 
[1](http://tech.asimio.net/2017/01/17/Multitenant-applications-using-Spring-Boot-JPA-Hibernate-and-Postgres.html)
[2](https://fizzylogic.nl/2016/01/24/make-your-spring-boot-application-multi-tenant-aware-in-2-steps)
[3](http://stuartingram.com/2016/10/02/spring-boot-schema-based-multi-tenancy/)
[4](http://anakiou.blogspot.ch/2015/08/multi-tenant-application-with-spring.html)

## Running the demo
You need to add a table orders in database (PostgreSQL in this case but ofcourse you can choose anyone)

```
CREATE TABLE "orders" (
"id" int4 NOT NULL,
"date" date NOT NULL
);
```

### Available URLs

```
curl -v POST -H "X-TenantID: DB1" "http://localhost:8080/orders"
curl -v POST -H "X-TenantID: DB2" "http://localhost:8080/orders"
curl -v POST -H "X-TenantID: DB3" "http://localhost:8080/orders"
```
