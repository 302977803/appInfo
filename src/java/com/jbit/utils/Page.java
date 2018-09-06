package com.jbit.utils;


public class Page {
    private int currentPageNo=1;
    private int size=5;
    private int totalPageCount;
    private int totalCount;

    public void init(int totalcount){
        this.totalCount =totalcount;
        this.totalPageCount=this.totalCount%size==0?(this.totalCount/size):(this.totalCount/size)+1;
        if(currentPageNo>totalPageCount){
            currentPageNo=totalPageCount;
        }
        if(currentPageNo<1){
            currentPageNo=1;
        }
    }

    public int startpage(){
        return (currentPageNo-1)*size;
    }
    public int endpage(){
        return size;
    }
    public int getPageNo() {
        return currentPageNo;
    }

    public void setPageNo(int pageNo) {
        this.currentPageNo = pageNo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalpagecount() {
        return totalPageCount;
    }

    public void setTotalpagecount(int totalpagecount) {
        this.totalPageCount = totalpagecount;
    }

    public int getTotalcount() {
        return totalCount;
    }

    public void setTotalcount(int totalcount) {
        this.totalCount = totalcount;
    }
}
