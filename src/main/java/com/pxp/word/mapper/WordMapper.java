package com.pxp.word.mapper;

import com.pxp.word.entity.Word;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface WordMapper {

    @Select("select * from word limit 0,10")
    public List<Word> get10Word();

    //传入参数
    @Select("select * from word WHERE idWord = #{id}")
    public Word getWordById(int id);

    //传入参数
    @Select("select * from word WHERE name = #{name} limit 0,1")
    public Word getWordByName(String name);

    @Select("select * from word where classId=#{classId} limit #{startNum},#{size}")
    public List<Word> findByPager(Map<String, Object> params);


    @Select("select  count(1)  from word where classId=#{classId}")
    public long count(int classId);

    //@Insert("insert into word (`name`,`desc`,`symbol`,`classId`)\n" +
    //       "  values (#{name},#{desc},#{symbol},#{classId})")
    //返回影响的行数
    // public  int   insertWord(Word word);

    @Update("update  word \n" +
            "   SET `name` = #{name},`desc` = #{desc},`symbol` = #{symbol},`classId` = #{classId} WHERE `idWord` = #{idWord}")
    //返回影响的行数
    public int updateWord(Word word);

    @Delete("  delete from word where idWord = #{idWord}")
    public int deleteWord(int idWord);

}
