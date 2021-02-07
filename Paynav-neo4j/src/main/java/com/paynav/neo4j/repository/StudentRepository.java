package com.paynav.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.paynav.neo4j.node.Student;

@Repository
public interface StudentRepository extends Neo4jRepository<Student, Integer> {

}
