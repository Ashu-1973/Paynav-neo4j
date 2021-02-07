package com.paynav.neo4j.node;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	private int id;
	private String name;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id2) {
		this.id = id2;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name2) {
		
	}
}
