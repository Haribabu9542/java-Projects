package com.java.fraud;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FraudCheckHistory implements Serializable {
    @Id
    @SequenceGenerator(name = "fraud_id_sequence",
      sequenceName = "fraud_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "fraud_id_sequence")
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}
