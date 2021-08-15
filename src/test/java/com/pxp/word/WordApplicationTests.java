package com.pxp.word;

import com.pxp.word.controller.WordController;
import com.pxp.word.entity.Word;
import com.pxp.word.mapper.UserMapper;
import com.pxp.word.mapper.WordMapperXml;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WordApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    WordMapperXml wordMapperxml;


    @Autowired
    WordController wordController;

    @Test
    void getData() {


        //System.out.println(wordMapperxml.deleteWord(166970));


        Word word = new Word();
        word.setIdWord(166969);
        word.setClassId(82);
        word.setName("mytest5");
        word.setDesc("测试5");
        word.setSymbol("[测试5]");
        System.out.println(wordMapperxml.updateWord(word));


//     values (#{name},#{desc},#{symbol},#{classId})
        //   System.out.println(wordMapperxml.count(82));

        /*
        Map<String, Object> params = new HashMap<>();
        params.put("classId", 82);
        params.put("name", "mytest6");
        params.put("desc", "测试6");
        params.put("symbol", "[测试6]");

        System.out.println(wordMapperxml.insertWord(params));
*/

/*
        Word word=new Word();
        word.setClassId(82);
        word.setName( "mytest6");
        word.setDesc("测试6");
        word.setSymbol("[测试6]");
        System.out.println(wordMapperxml.insertWord(word));
        //获取到自增id
        System.out.println(word.getIdWord());
*/
        /*
        List<Word> list= wordMapperxml.get10Word();
        System.out.println(list);
        System.out.println(wordMapperxml.getWordById(56464));
        System.out.println(wordMapperxml.getWordByName("hello"));


      //  System.out.println(wordMapperxml.findByPager(82,(2-1)*10,10));

        Map<String, Object> params = new HashMap<>();
        params.put("classId", 82);
        params.put("startNum", (2-1)*10);
        params.put("size", 10);
        System.out.println(wordMapperxml.findByPager(params));*/

    }

    @Test
    void get10Word() {
        List<Word> list = wordMapperxml.get10Word();
        System.out.println(list);


    }


}
