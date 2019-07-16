package sall.good.burgerbuilder.b4f.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.*
import reactor.core.publisher.Flux
import sall.good.burgerbuilder.b4f.repository.IngredientQueryRepository


internal class KitchenQueryHandlerTest {

    val ingredientQueryRepository = mock(IngredientQueryRepository::class.java)

    val kitchenQueryHandler = KitchenQueryHandler(ingredientQueryRepository)

    @Test
    fun findAll() {
        //given
        Mockito.`when`(ingredientQueryRepository.findAll()).thenReturn(Flux.just())

        //when
        val ingredients = kitchenQueryHandler.getIngredients()

        //then
        verify(ingredientQueryRepository, times(1)).findAll()
        assertEquals(Flux.empty<Ingredient>(), ingredients)
    }
}