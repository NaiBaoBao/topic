package com.example.topic.service.serviceImpl;

import com.example.topic.domain.Topic;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class TopicServiceImplTest {
    @Autowired
    private TopicServiceImpl topicService;
    @Test
    void list() {
//        String str1= LocalDateTime.now().toString();
//        String topiclist=str1;
//        //List<Topic> topics=topicService.list();
//        List<Topic> topics=topicService.list();
//        System.out.println(topics.toString());
//        Assert.assertArrayEquals();

    }

    @Test
    void detail() {
    }
}