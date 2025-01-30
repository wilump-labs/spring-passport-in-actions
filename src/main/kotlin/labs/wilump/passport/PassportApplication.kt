package labs.wilump.passport

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PassportApplication

fun main(args: Array<String>) {
	runApplication<PassportApplication>(*args)
}
