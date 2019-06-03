package com.awstest.services.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
public class AbstractTimestampEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "created_at", columnDefinition = "DATETIME")
	protected Date createdAt;

	@Column(name = "updated_at", columnDefinition = "DATETIME")
	protected Date updatedAt;

	@Column(name = "version", columnDefinition = "INT")
	protected int version;

	@PrePersist
	protected void onCreate() {
		updatedAt = createdAt;
	}

	@PreUpdate
	protected void onUpdate() {
		updatedAt = new Date();
	}

}
