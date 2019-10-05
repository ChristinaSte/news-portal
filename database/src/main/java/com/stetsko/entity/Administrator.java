package com.stetsko.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Setter
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode()
@NoArgsConstructor
@Entity
@DiscriminatorValue("ADMINISTRATOR")
public class Administrator {
}
