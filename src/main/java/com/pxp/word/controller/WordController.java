package com.pxp.word.controller;

import com.pxp.word.entity.Pager;
import com.pxp.word.entity.ReturnMsg;
import com.pxp.word.entity.Word;
import com.pxp.word.mapper.WordMapperXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class WordController {

    @Autowired
    WordMapperXml wordMapperXml;

    @RequestMapping("get10Word")
    public List<Word> get10Word() {

        List<Word> list = wordMapperXml.get10Word();
        return list;
    }

    @RequestMapping("getWordById")
    public Word getWordById(@RequestParam(value = "idWord") int idWord) {

        Word word = wordMapperXml.getWordById(idWord);
        return word;
    }

    @RequestMapping("getWordByPager")
    //page 页码
    //size 每页size
    public Pager<Word> findByPager(@RequestParam(value = "classId") int classId, @RequestParam(value = "page") int page, @RequestParam(value = "size") int size) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("classId", classId);
        params.put("startNum", (page - 1) * size);
        params.put("size", size);
        Pager<Word> pager = new Pager<Word>(page, size);
        List<Word> list = wordMapperXml.findByPager(params);

        long count = wordMapperXml.count(classId);
        pager.setRows(list);
        pager.setTotal(count);

        return pager;
    }

    @RequestMapping("insertWord")
    public ReturnMsg insertWord(@RequestParam(value = "classId") int classId, @RequestParam(value = "name") String name, @RequestParam(value = "symbol") String symbol, @RequestParam(value = "desc") String desc) {

        Word word = new Word();
        //  word.setIdWord(0);
        word.setClassId(classId);
        word.setName(name);
        word.setDesc(desc);
        word.setSymbol(symbol);

        // "  values (#{name},#{desc},#{symbol},#{classId})")
        int num = wordMapperXml.insertWord(word);
        //获取到自增id
        System.out.println("自增id:" + word.getIdWord());

        if (num > 0) {
            ReturnMsg returnMsg = ReturnMsg.ReturnMsgSuccess();
            returnMsg.data = word;
            return returnMsg;
        } else {
            return ReturnMsg.ReturnMsgFail();
        }
    }

    @RequestMapping("updateWord")
    public ReturnMsg updateWord(@RequestParam(value = "idWord") int idWord, @RequestParam(value = "classId") int classId, @RequestParam(value = "name") String name, @RequestParam(value = "symbol") String symbol, @RequestParam(value = "desc") String desc) {
        /*
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("idWord", idWord);
        params.put("classId", classId);
        params.put("name",name);
        params.put("desc",desc);
        params.put("symbol",symbol);
        */
        Word word = new Word();
        word.setIdWord(idWord);
        word.setClassId(classId);
        word.setName(name);
        word.setDesc(desc);
        word.setSymbol(symbol);
        int num = wordMapperXml.updateWord(word);

        if (num > 0) {
            ReturnMsg returnMsg = ReturnMsg.ReturnMsgSuccess();
            returnMsg.data = word;
            return returnMsg;
        } else {
            return ReturnMsg.ReturnMsgFail();
        }
    }


    @RequestMapping("deleteWord")
    public ReturnMsg deleteWord(@RequestParam(value = "idWord") int idWord) {

        int num = wordMapperXml.deleteWord(idWord);
        if (num > 0) {
            ReturnMsg returnMsg = ReturnMsg.ReturnMsgSuccess();
            returnMsg.msg = "删除成功";
            return returnMsg;
        } else {
            return ReturnMsg.ReturnMsgFail();
        }

    }


}
