package pa.spring.ex

import javax.persistence.*

@Entity
data class Record(
        @Id @GeneratedValue(strategy=GenerationType.IDENTITY) val rid: Long,
        @Column val type: String,
        @Column val content: String
) {
}
