package com.sean.game.magic;

import com.sean.game.entity.Entity;

public class Event {
	
	private String name;
	private Entity source;
	
	public Event(String name, Entity source) {
		this.name = name;
		this.source = source;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Event other = (Event) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Entity getSource() {
		return source;
	}
	public String getName() {
		return name;
	}
}