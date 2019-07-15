package sall.good.burgerbuilder.b4f

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory.getLogger
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import sall.good.burgerbuilder.b4f.domain.Ingredient
import sall.good.burgerbuilder.b4f.repository.IngredientQueryRepository

@SpringBootApplication
class KotlinSpringReactiveBurgerBuilderBackendApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringReactiveBurgerBuilderBackendApplication>(*args)
}


@Component
class DataInitializr(val ingredientQueryRepository: IngredientQueryRepository) : CommandLineRunner {
	override fun run(vararg strings: String) {
		val log = getLogger(DataInitializr::class.java);

		this.ingredientQueryRepository
				.saveAll(
						Flux.just(
								Ingredient(name = "bacon", amount = 0),
								Ingredient(name = "cheese", amount = 0),
								Ingredient(name = "meat", amount = 0),
								Ingredient(name = "salad", amount = 0)
						)
				)
				.log()
				.subscribe(
						null,
						null,
						{ log.info("done initialization...") }
				)
	}
}