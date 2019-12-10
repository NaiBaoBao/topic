package com.example.topic.service.serviceImpl;

import com.example.topic.mapper.TopicMapper;
import com.example.topic.domain.Topic;

import com.example.topic.service.TopicService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicMapper topicMapper;

    @Override
    public List<Topic> list(){
        System.out.println("pao ");
        return topicMapper.list();
    }
    @Override
    public Topic detail(Integer id){
        return topicMapper.detail(id);
    }
}
