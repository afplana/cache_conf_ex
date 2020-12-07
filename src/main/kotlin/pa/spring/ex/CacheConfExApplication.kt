package pa.spring.ex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class CacheConfExApplication

fun main(args: Array<String>) {
	runApplication<CacheConfExApplication>(*args)
}
