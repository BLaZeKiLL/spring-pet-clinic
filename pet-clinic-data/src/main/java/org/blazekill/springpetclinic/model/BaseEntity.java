package org.blazekill.springpetclinic.model;

import java.io.Serializable;

/**
 * As all entities need an ID key we can create a BaseEntity class
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
