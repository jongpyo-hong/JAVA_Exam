package org.koreait.entities;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
public class BoardViewsId implements Serializable {
    private Long id;
    private String uid;
}
