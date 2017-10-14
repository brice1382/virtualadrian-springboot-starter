package com.virtualadrian.auth.authuser;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "roles")
@Data

@AllArgsConstructor
public class Role implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String label;

    public Role(){}
    public Role(String label) {
        this.label = label;
    }

}
