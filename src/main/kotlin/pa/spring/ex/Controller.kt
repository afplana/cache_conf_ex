package pa.spring.ex

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@Suppress("unused")
@RequestMapping("/records")
class RecordController(private val recordService: RecordService) {

    @GetMapping("/{rid}")
    fun getRecordById(@PathVariable("rid") rid: Long): Record {
        println(rid)
        return recordService.getRecordById(rid)
    }
}
