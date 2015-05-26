# hibernate-postgresql-patch
Provides a custom extended PostgreSQL dialect for Hibernate 4.x

Currently it constists only of a fix for mapping the native `java.util.UUID` to the `pg-uuid` type without adding
JPA's `@Type` annotation at entity field level.

[![Build Status](https://api.travis-ci.org/xpensum/hibernate-postgresql-patch.svg?branch=master)](https://travis-ci.org/xpensum/hibernate-postgresql-patch)

## Usage

Use `de.cpg.shared.hibernate.CustomPostgreSQL9Dialect` instead of standard `org.hibernate.dialect.PostgreSQL9Dialect`
in your application's hibernate configuration an you're done.

## Download

Binaries are available on maven central with following GAV:

- groupId: `de.cpg.shared`
- artifactId: `hibernate-postgresql-patch`
- version: `1.0.0`
