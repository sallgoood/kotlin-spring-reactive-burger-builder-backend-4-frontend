package sall.good.burgerbuilder.b4f.infrastructure

import com.mongodb.reactivestreams.client.MongoClient
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@EnableReactiveMongoRepositories
class MongoConfiguration : AbstractReactiveMongoConfiguration() {

    @Bean
    override fun reactiveMongoClient(): MongoClient {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Bean
    override fun getDatabaseName(): String {
        TODO("burger-mongo") //To change body of created functions use File | Settings | File Templates.
    }
}