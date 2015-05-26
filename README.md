# hibernate-postgresql-patch
Provides a custom extended PostgreSQL dialect for Hibernate 4.x

Currently it constists only of a fix for mapping the native `java.util.UUID` to the `pg-uuid` type without adding
JPA's `@Type` annotation at entity field level. This will be fixed as soon as Hibernate 5.x is released (and can
be used in your project). For further information also see [HH-9562](https://hibernate.atlassian.net/browse/HHH-9562).

[![Build Status](https://api.travis-ci.org/CPGFinanceSystems/hibernate-postgresql-patch.svg?branch=master)]
(https://travis-ci.org/CPGFinanceSystems/hibernate-postgresql-patch)

## Usage

Use `de.cpg.oss.hibernate.CustomPostgreSQL9Dialect` instead of standard `org.hibernate.dialect.PostgreSQL9Dialect`
in your application's hibernate configuration an you're done.

## Download

Binaries will be available on maven central with following GAV:

- groupId: `de.cpg.oss`
- artifactId: `hibernate-postgresql-patch`
- version: `1.0.0`
