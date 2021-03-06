package com.github.withdrawservice.repository;

import com.github.withdrawservice.entity.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {

    BankAccountEntity getBankAccountEntityByUserId(Long userId);
}
