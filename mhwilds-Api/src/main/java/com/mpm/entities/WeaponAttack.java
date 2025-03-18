package com.mpm.entities;

import java.io.Serial;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
@Table(name = "weapon_attack")
public class WeaponAttack implements Serializable{
	
	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = -3157005971525514344L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "weapon")
	@OneToOne
	@JsonBackReference
	private Weapon weapon;
	
	
	@Column
	private Integer display;
	
	@Column 
	private Integer raw;
	

}
