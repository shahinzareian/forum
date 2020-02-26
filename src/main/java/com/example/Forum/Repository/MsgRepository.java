package com.example.Forum.Repository;

import com.example.Forum.Models.Msg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MsgRepository extends JpaRepository<Msg ,Long > {
}
