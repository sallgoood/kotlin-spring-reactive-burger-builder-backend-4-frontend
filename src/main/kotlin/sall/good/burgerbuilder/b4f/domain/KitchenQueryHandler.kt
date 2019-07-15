package sall.good.burgerbuilder.b4f.domain

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import sall.good.burgerbuilder.b4f.repository.IngredientQueryRepository

@Component
class KitchenQueryHandler(val ingredientQueryRepository: IngredientQueryRepository){

    fun findAll(): Flux<Ingredient> = ingredientQueryRepository.findAll()
}