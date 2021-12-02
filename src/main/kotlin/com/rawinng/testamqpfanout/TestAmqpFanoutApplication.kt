package com.rawinng.testamqpfanout

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestAmqpFanoutApplication

fun main(args: Array<String>) {
	runApplication<TestAmqpFanoutApplication>(*args)
}
