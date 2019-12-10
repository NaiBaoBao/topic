package com.example.topic.service;

import com.example.topic.domain.Topic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TopicService {
    List<Topic> list();
    Topic detail(Integer id);
}

