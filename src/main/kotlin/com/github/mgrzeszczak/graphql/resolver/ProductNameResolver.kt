package com.github.mgrzeszczak.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.github.mgrzeszczak.graphql.query.ProductId
import kotlinx.coroutines.delay
import mu.KotlinLogging
import org.springframework.stereotype.Component

@Component
class ProductNameResolver : GraphQLResolver<ProductId> {

    private val logger = KotlinLogging.logger {}

    suspend fun name(id: ProductId): String {
        logger.info { "Resolving name for product $id" }
        delay(1000L)
        logger.info { "Resolved name for product $id" }
        return "name"
    }

}
