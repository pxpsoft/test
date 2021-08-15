package com.pxp.word.mapper;

import com.pxp.word.entity.Word;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public interface WordMapperXml {

    public List<Word> get10Word();

    public Word getWordById(int id);

    public Word getWordByName(String name);

    public List<Word> findByPager(Map<String, Object> params);


    public long count(int classId);
    //返回影响的行数
    // public int insertWord(Map<String, Object> params);

    public int insertWord(Word word);


    //返回影响的行数
    public int updateWord(Word word);

    public int deleteWord(int idWord);


}
