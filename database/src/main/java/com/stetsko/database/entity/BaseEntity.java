package com.stetsko.database.entity;

import java.io.Serializable;

public interface BaseEntity<ID extends Serializable> {

    ID getId();
}