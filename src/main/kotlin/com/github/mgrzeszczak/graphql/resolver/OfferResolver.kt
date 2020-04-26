package com.github.mgrzeszczak.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.github.mgrzeszczak.graphql.query.ProductId
import kotlinx.coroutines.delay
import mu.KotlinLogging
import org.springframework.stereotype.Component
import java.util.UUID

data class Offer(val id: String)

@Component
class OfferResolver : GraphQLResolver<ProductId> {

    private val logger = KotlinLogging.logger {}

    suspend fun offer(id: ProductId): Offer {
        logger.info { "Resolving offer for product: $id" }
        delay(3000L)
        logger.info { "Resolved offer for product: $id" }
        return Offer(UUID.randomUUID().toString())
    }

}
