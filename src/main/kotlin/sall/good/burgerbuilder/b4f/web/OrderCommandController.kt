package sall.good.burgerbuilder.b4f.web

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import sall.good.burgerbuilder.b4f.domain.CreateOrderCommand
import sall.good.burgerbuilder.b4f.domain.Order
import sall.good.burgerbuilder.b4f.domain.OrderCommandHandler
import java.time.Duration
import kotlin.random.Random

@RestController
@CrossOrigin
class OrderCommandController(
        val orderCommandHandler: OrderCommandHandler) {

    @PostMapping("/orders/commands/create-order")
    fun createOrder(@RequestBody createOrderCommand: CreateOrderCommand): Mono<Order>
            = orderCommandHandler.handle(createOrderCommand)
            .delayElement(Duration.ofSeconds(Random.nextLong(0, 3)))
}