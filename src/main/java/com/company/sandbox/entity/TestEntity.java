package com.company.sandbox.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@JmixEntity
@Table(name = "SB_TEST_ENTITY")
@Entity(name = "sb_TestEntity")
public class TestEntity {

    @Id
    @Column(name = "ID", nullable = false)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}