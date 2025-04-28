package com.CrudOperations.repository;

import com.CrudOperations.entity.IplTeam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IplRepository extends JpaRepository<IplTeam, Integer> {

}
