[![CodeQL](https://github.com/AshishKmrSingh/multi-tenant/actions/workflows/codeql.yml/badge.svg)](https://github.com/AshishKmrSingh/multi-tenant/actions/workflows/codeql.yml)
[![OpenSSF Scorecard](https://api.scorecard.dev/projects/github.com/AshishKmrSingh/multi-tenant/badge)](https://scorecard.dev/viewer/?uri=github.com/AshishKmrSingh/multi-tenant)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=AshishKmrSingh_multi-tenant&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=AshishKmrSingh_multi-tenant)

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
