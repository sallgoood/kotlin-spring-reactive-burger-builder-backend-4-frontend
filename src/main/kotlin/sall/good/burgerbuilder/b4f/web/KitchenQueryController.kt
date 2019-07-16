package sall.good.burgerbuilder.b4f.web

import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import sall.good.burgerbuilder.b4f.domain.*

@RestController
@CrossOrigin
class KitchenQueryController(
        val kitchenQueryHandler: KitchenQueryHandler) {

    @GetMapping("/kitchen/query/ingredients")
    fun getIngredients(): Mono<Map<String, Int>> = kitchenQueryHandler.getIngredients().collectMap(
            { it.name },
            { it.amount })
}