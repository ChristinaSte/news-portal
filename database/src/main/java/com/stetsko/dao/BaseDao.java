package com.stetsko.dao;

import com.stetsko.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<E extends BaseEntity, ID extends Serializable> {

    E find(ID id);

    List<E> findAll();

    void persist(E entity);

    void remove(E entity);
}