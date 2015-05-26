package de.cpg.oss.hibernate;

import org.hibernate.dialect.PostgreSQL9Dialect;
import org.hibernate.metamodel.spi.TypeContributions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.PostgresUUIDType;

/**
 * Custom dialect for Hibernate and PostgreSQL so java.util.UUID is mapped to pg-uuid automatically without @Type()
 * annotation at entity field level.
 * Furthermore if i.e. the H2 DB is used for testing, it not know anything about pg-uuid. The mapping of java.util.UUID
 * in Hibernate with H2 DB just works as expected.
 */
public class CustomPostgreSQL9Dialect extends PostgreSQL9Dialect {

    @Override
    public void contributeTypes(final TypeContributions typeContributions, final ServiceRegistry serviceRegistry) {
        super.contributeTypes(typeContributions, serviceRegistry);
        typeContributions.contributeType(new InternalPostgresUUIDType());
    }

    protected static class InternalPostgresUUIDType extends PostgresUUIDType {

        @Override
        protected boolean registerUnderJavaType() {
            return true;
        }
    }
}

