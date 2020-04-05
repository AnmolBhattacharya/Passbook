package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Transaction;

public interface PassbookRepo extends JpaRepository<Transaction,Integer> {

	@Query(value="SELECT * FROM transaction WHERE fromaccountid=?1 OR toaccountid=?1",nativeQuery=true)
	List<Transaction> findByAccountid(int id);

}
