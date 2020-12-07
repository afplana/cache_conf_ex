package pa.spring.ex

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

interface RecordService {
    fun getRecordById(rid: Long): Record
}

@Service
@Suppress("unused")
class RecordServiceImpl(private val recordRepository: RecordRepository): RecordService {

    @Cacheable("records")
    override fun getRecordById(rid: Long): Record = recordRepository.findById(rid)
                .orElseThrow { IllegalArgumentException("Id $rid does not exit in database") }
}
