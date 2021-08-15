package com.pxp.word.entity;

public class Word {


    @Override
    public String toString() {
        return "Word{" +
                "classId=" + classId +
                ", idWord=" + idWord +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }

    private int classId;
    private int idWord = 0;
    private String name;
    private String desc;
    private String symbol;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }


    public int getIdWord() {
        return idWord;
    }

    public void setIdWord(int idWord) {
        this.idWord = idWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
