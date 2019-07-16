package sall.good.burgerbuilder.b4f.web

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import sall.good.burgerbuilder.b4f.domain.*
import java.time.Duration
import kotlin.random.Random

@RestController
@CrossOrigin
class OrderQueryController(
        val orderQueryHandler: OrderQueryHandler) {

    @GetMapping("/orders")
    fun createOrder(): Flux<OrderHistory>
            = orderQueryHandler.handle()
            .delayElements(Duration.ofSeconds(Random.nextLong(0, 3)))
}