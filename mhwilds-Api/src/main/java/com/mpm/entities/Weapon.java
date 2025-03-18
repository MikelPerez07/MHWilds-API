package com.mpm.entities;

import java.io.Serial;
import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "weapons")
public class Weapon implements Serializable {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 144440941218141261L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Enumerated(EnumType.STRING)
	private WeaponType type;
	
	@Enumerated(EnumType.STRING)
	private DamageType damageType;
	
	@Column
	private Integer rarity;
	
	

	
}
