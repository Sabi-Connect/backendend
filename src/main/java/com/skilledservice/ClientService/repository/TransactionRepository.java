package com.skilledservice.ClientService.repository;

import com.skilledservice.ClientService.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
