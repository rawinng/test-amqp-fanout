package com.rawinng.testamqpfanout.listener

import org.slf4j.LoggerFactory
import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class TestListener {
    companion object {
        val log = LoggerFactory.getLogger(TestListener::class.java)
    }
    @RabbitListener(queues = ["test-queue"])
    fun listen(inData : Message) {
        log.info("Get message from queue: {}", String(inData.body))
        inData.messageProperties.headers.let {
            it.keys.forEach { key ->
                log.info("Header: {} >> {}", key, it[key])
            }
        }
    }
}