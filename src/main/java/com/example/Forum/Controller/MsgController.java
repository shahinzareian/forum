package com.example.Forum.Controller;

import com.example.Forum.Models.Msg;
import com.example.Forum.Repository.MsgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/msg")
public class MsgController {
    @Autowired
    private MsgRepository msgRepository;
    @GetMapping
    public List<Msg> GetMsg(){
        return msgRepository.findAll();
    }
    @PostMapping
    public void AddMsg (@RequestBody Msg msg){
        msgRepository.save(msg);
    }
}
