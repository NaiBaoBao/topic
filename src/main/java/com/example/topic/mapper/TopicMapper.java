package com.example.topic.mapper;

import com.example.topic.domain.Topic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TopicMapper {
    public List<Topic> list();
    public Topic detail(Integer id);
}
