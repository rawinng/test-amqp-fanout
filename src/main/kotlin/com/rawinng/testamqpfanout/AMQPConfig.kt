package com.rawinng.testamqpfanout

import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.FanoutExchange
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableRabbit
class AMQPConfig {
    @Bean
    fun queue() = Queue("test-queue")

    @Bean
    fun testExchange() = FanoutExchange("TEST_AP")

    @Bean
    fun bindings() = BindingBuilder.bind(queue()).to(testExchange())
}