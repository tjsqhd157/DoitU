package com.example.DoitU.repository;

import com.example.DoitU.entity.Routine;
import com.example.DoitU.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {

    List<Routine> findByUserOrderByCreatedTimeDesc(User user);

}