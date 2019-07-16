package sall.good.burgerbuilder.b4f.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Order(
        @Id val id: String = UUID.randomUUID().toString(),
        val ingredients: Map<String, Int>,
        val price: Int,
        val name: String,
        val email: String,
        val street: String,
        val zipCode: String,
        val country: String,
        val deliveryMethod: String)