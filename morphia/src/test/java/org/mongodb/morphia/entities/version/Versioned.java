package org.mongodb.morphia.entities.version;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Version;

public class Versioned {
	@Id
	private ObjectId id;
	@Version
	private Long version;
	private String name;
	private int count = 0;

	public ObjectId getId() {
		return id;
	}

	public Long getVersion() {
		return version;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
