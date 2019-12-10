package com.example.topic.service.serviceImpl;

import com.example.topic.dao.TopicDao;
import com.example.topic.domain.Topic;

import com.example.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicDao topicDao;

    @Override
    public List<Topic> list(){
        System.out.println("pao ");
        return topicDao.list();
    }
    @Override
    public Topic detail(Integer id){
        return topicDao.detail(id);
    }
}
