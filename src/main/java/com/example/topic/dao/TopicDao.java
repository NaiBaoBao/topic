package com.example.topic.dao;

import com.example.topic.domain.Topic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TopicDao {
    public List<Topic> list();
    public Topic detail(Integer id);
}
