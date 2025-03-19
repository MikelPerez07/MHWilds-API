package com.mpm.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "ranks")
public class Rank implements Serializable {
	/**
	* 
	*/
	@Serial
	private static final long serialVersionUID = 3035837219903399465L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private Long skill;

	@Column
	private Integer level;

	@Column
	private List<Modifier> modifiers;

	@Column
	private String description;

	@Column
	private String skillName;

}
