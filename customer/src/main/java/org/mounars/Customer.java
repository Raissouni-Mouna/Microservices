package org.mounars;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @SequenceGenerator( // définit la séquence, genere id avant insert
        name = "customer_id_sequence",
        sequenceName = "customer_id_sequence"
    )

    @GeneratedValue( // utilise cette stratégie
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    private Integer id;
    private String fisrtName;
    private String lastName;
    private String email;
}
