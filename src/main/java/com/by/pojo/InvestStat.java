package com.by.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class InvestStat {
    private Integer isid;

    private Integer userid;

    private Integer markcount;

    private Integer lmcount;

    private Integer gmcount;

    private BigDecimal markmoney;

    private BigDecimal markgain;

    private Date markbegindate;

    private Date markenddate;

    public Integer getIsid() {
        return isid;
    }

    public void setIsid(Integer isid) {
        this.isid = isid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMarkcount() {
        return markcount;
    }

    public void setMarkcount(Integer markcount) {
        this.markcount = markcount;
    }

    public Integer getLmcount() {
        return lmcount;
    }

    public void setLmcount(Integer lmcount) {
        this.lmcount = lmcount;
    }

    public Integer getGmcount() {
        return gmcount;
    }

    public void setGmcount(Integer gmcount) {
        this.gmcount = gmcount;
    }

    public BigDecimal getMarkmoney() {
        return markmoney;
    }

    public void setMarkmoney(BigDecimal markmoney) {
        this.markmoney = markmoney;
    }

    public BigDecimal getMarkgain() {
        return markgain;
    }

    public void setMarkgain(BigDecimal markgain) {
        this.markgain = markgain;
    }

    public Date getMarkbegindate() {
        return markbegindate;
    }

    public void setMarkbegindate(Date markbegindate) {
        this.markbegindate = markbegindate;
    }

    public Date getMarkenddate() {
        return markenddate;
    }

    public void setMarkenddate(Date markenddate) {
        this.markenddate = markenddate;
    }
}