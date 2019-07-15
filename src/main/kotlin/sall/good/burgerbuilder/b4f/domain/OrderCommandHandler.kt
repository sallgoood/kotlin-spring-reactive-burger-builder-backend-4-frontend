package sall.good.burgerbuilder.b4f.domain

import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import sall.good.burgerbuilder.b4f.repository.BurgerOrderAggregateRepository

@Component
class OrderCommandHandler(
        burgerOrderAggregateRepository : BurgerOrderAggregateRepository)
    : BurgerOrderAggregateRepository by burgerOrderAggregateRepository {

    fun handle(createOrderCommand: CreateOrderCommand): Mono<OrderAggregate> {
        return save(createOrderCommand.data)
    }

}