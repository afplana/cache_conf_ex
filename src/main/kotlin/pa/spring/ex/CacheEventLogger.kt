package pa.spring.ex

import org.ehcache.event.CacheEvent
import org.ehcache.event.CacheEventListener

class CacheEventLogger: CacheEventListener<Any, Any> {

    override fun onEvent(p0: CacheEvent<out Any, out Any>?) {
        if (p0 != null) {
            println("Cache event [${p0.type}] => [${p0.key}] | entry: old => [${p0.oldValue}] new => [${p0.newValue}]")
        }
    }
}
