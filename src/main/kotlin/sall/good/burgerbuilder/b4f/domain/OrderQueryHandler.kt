package sall.good.burgerbuilder.b4f.domain

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import sall.good.burgerbuilder.b4f.repository.BurgerOrderAggregateRepository

@Component
class OrderQueryHandler(
        burgerOrderAggregateRepository : BurgerOrderAggregateRepository)
    : BurgerOrderAggregateRepository by burgerOrderAggregateRepository {

    fun handle(): Flux<OrderHistory> {
        return findAll().map { OrderHistory(it) }
    }

}