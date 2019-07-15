package sall.good.burgerbuilder.b4f.web

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import sall.good.burgerbuilder.b4f.domain.*
import java.time.Duration
import kotlin.random.Random

@RestController
@CrossOrigin
class KitchenQueryController(
        val kitchenQueryHandler: KitchenQueryHandler) {

    @GetMapping("/kitchen/query/ingredients")
    fun getIngredients(): Mono<Map<String, Int>> = kitchenQueryHandler.findAll().collectMap(
            { it.name },
            { it.amount })
}