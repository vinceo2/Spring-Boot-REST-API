package com.example.ecommerce_app.product;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Properties;
import java.util.Set;

import com.mysql.cj.exceptions.ExceptionInterceptorChain;
import com.mysql.cj.log.NullLogger;

public class ProductTestConfig {

    static final Blob sampleBlob = new com.mysql.cj.jdbc.Blob(new byte[] {0},
        new ExceptionInterceptorChain(null, new Properties(), new NullLogger(""))
    );

    static final Product testProduct = new Product(
        "name",
        true,
        BigDecimal.ONE,
        "description",
        Set.of(),
        sampleBlob
    );

    static final Product testProductToRead = new Product(
        "name",
        true,
        BigDecimal.ONE,
        "description",
        Set.of(),
        sampleBlob
    );

    static final Product testProductToDelete = new Product(
        "name",
        true,
        BigDecimal.ONE,
        "description",
        Set.of(),
        sampleBlob
    );

    static final Product testProductViolatingNameSizeConstraint = new Product(
        "",
        true,
        BigDecimal.ONE,
        "description",
        Set.of(),
        sampleBlob
    );

    static final Product testProductViolatingNameNullConstraint = new Product(
        null,
        true,
        BigDecimal.ONE,
        "description",
        Set.of(),
        sampleBlob
    );

    static final long unusedProductId = 50l;

}
