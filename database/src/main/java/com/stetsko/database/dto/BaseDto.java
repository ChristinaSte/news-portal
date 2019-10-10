package com.stetsko.database.dto;

import java.io.Serializable;

public interface BaseDto<ID extends Serializable> {

    ID getId();
}
