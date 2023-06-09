package org.hardboiled;

import io.quarkus.arc.All;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "dealtracker")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DealTracker extends PanacheEntityBase {

    public DealTracker(
            final String dealReference,
            final String chain,
            final int chainNumber,
            final LocalDateTime arrivalTime,
            final LocalDateTime sentTime,
            final LocalDateTime vestCompleteTime,
            final LocalDateTime appCompleteTime) {
        this.dealReference = dealReference;
        this.chain = chain;
        this.chainNumber = chainNumber;
        this.arrivalTime = arrivalTime;
        this.sentTime = sentTime;
        this.vestCompleteTime = vestCompleteTime;
        this.appCompleteTime = appCompleteTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Getter    Long id;
            @Getter    String dealReference;
            @Getter    String chain;
            @Getter    int chainNumber;
    @Setter @Getter    LocalDateTime arrivalTime;
    @Setter @Getter    LocalDateTime sentTime;
    @Setter @Getter    LocalDateTime vestCompleteTime;
    @Setter @Getter    LocalDateTime appCompleteTime;
//    @Transient @Setter boolean deleted;
}