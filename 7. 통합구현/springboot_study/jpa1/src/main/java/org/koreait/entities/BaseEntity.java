package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass
public abstract class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime regDt;

    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime modDt;
}
