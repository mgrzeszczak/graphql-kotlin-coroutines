package com.github.mgrzeszczak.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import mu.KotlinLogging
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class ProductQueryResolver : GraphQLQueryResolver {

    private val logger = KotlinLogging.logger {}

    suspend fun getProductById(id: String): ProductId {
        logger.info { "Resolving getProductById query: id=$id" }
        return ProductId(UUID.randomUUID().toString())
    }

}

data class ProductId(val id: String)
