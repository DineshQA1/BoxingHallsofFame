package com.qa.boxingHallsOfFame.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

@Entity
public class BoxingHallsOfFame {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull(message = "Name can not be null")
	private String name;
	@NotNull(message = "Weight Class can not be null")
	private String weightClass;
	private Long bouts;
	private Long won;
	private Long drawn;
	private Long lost;
	private Boolean Undisputed ;
	
	public BoxingHallsOfFame(String name, String weightClass, Long bouts, Long won, Long drawn, Long lost,
			Boolean undisputed) {
		super();
		this.name = name;
		this.weightClass = weightClass;
		this.bouts = bouts;
		this.won = won;
		this.drawn = drawn;
		this.lost = lost;
		Undisputed = undisputed;
	}
	
	public BoxingHallsOfFame() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeightClass() {
		return weightClass;
	}

	public void setWeightClass(String weightClass) {
		this.weightClass = weightClass;
	}

	public Long getBouts() {
		return bouts;
	}

	public void setBouts(Long bouts) {
		this.bouts = bouts;
	}

	public Long getWon() {
		return won;
	}

	public void setWon(Long won) {
		this.won = won;
	}

	public Long getDrawn() {
		return drawn;
	}

	public void setDrawn(Long drawn) {
		this.drawn = drawn;
	}

	public Long getLost() {
		return lost;
	}

	public void setLost(Long lost) {
		this.lost = lost;
	}

	public Boolean getUndisputed() {
		return Undisputed;
	}

	public void setUndisputed(Boolean undisputed) {
		Undisputed = undisputed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Undisputed == null) ? 0 : Undisputed.hashCode());
		result = prime * result + ((bouts == null) ? 0 : bouts.hashCode());
		result = prime * result + ((drawn == null) ? 0 : drawn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lost == null) ? 0 : lost.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((weightClass == null) ? 0 : weightClass.hashCode());
		result = prime * result + ((won == null) ? 0 : won.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoxingHallsOfFame other = (BoxingHallsOfFame) obj;
		if (Undisputed == null) {
			if (other.Undisputed != null)
				return false;
		} else if (!Undisputed.equals(other.Undisputed))
			return false;
		if (bouts == null) {
			if (other.bouts != null)
				return false;
		} else if (!bouts.equals(other.bouts))
			return false;
		if (drawn == null) {
			if (other.drawn != null)
				return false;
		} else if (!drawn.equals(other.drawn))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lost == null) {
			if (other.lost != null)
				return false;
		} else if (!lost.equals(other.lost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weightClass == null) {
			if (other.weightClass != null)
				return false;
		} else if (!weightClass.equals(other.weightClass))
			return false;
		if (won == null) {
			if (other.won != null)
				return false;
		} else if (!won.equals(other.won))
			return false;
		return true;
	}
	
	
	
	
}