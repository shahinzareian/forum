package com.example.Forum.Controller;

import com.example.Forum.Models.Topic;
import com.example.Forum.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/topic")
public class TopicController {
    @Autowired
    private TopicRepository topicRepository;
    @GetMapping
    public List<Topic> GetTopic() {
        return topicRepository.findAll();
    }
    @PostMapping
    public void AddTopic(@RequestBody Topic topic) {
        topicRepository.save(topic);
    }
}

