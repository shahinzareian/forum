package com.example.Forum.Repository;

import com.example.Forum.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account , Long> {
}
