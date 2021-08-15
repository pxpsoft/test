package com.pxp.word.entity;


//分页处理


import java.util.List;

public class Pager<T> {

    private int page;//当前页  从1开始
    private int size;//每页记录数
    private List<T> rows;//返回的记录集合
    private long total;//总记录条数

    public Pager(int page, int size) {
        this.setSize(size);
        this.setPage(page);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}
