package sall.good.burgerbuilder.b4f.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class OrderAggregate(
        @Id val id: String = UUID.randomUUID().toString(),
        val ingredients: Map<String, Int>,
        val price: Int,
        val customer: Customer,
        val deliveryMethod: String) {

    data class Customer(
            val name: String,
            val address: Address,
            val email: String)

    data class Address(
            val street: String,
            val zipCode: String,
            val country: String)
}