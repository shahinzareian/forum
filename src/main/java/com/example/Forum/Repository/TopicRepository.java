package com.example.Forum.Repository;

import com.example.Forum.Models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic ,Long> {
}
