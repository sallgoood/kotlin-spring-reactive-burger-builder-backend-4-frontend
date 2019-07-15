package sall.good.burgerbuilder.b4f.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Ingredient(
        @Id val id: String = UUID.randomUUID().toString(),
        val name: String,
        val amount: Int)