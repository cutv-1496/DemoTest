package com.example.demo.repo;

import com.example.demo.model.AnzenAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AnzenAccountRepository extends JpaRepository<AnzenAccountEntity, Integer> {

}
