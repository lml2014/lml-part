package com.lml.part.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PickOrderStaffReportParams implements Serializable {

    private static final long serialVersionUID = 146098705624291254L;
    /**
     * 查询公司Id
     */
    private Long companyId;

    /**
     * 拣选员Id
     */
    private Long staffId;

    /**
     * waveIds
     */
    private List<Long> waveIds;

    /**
     * 查询开始时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    /**
     * 查询结束时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public List<Long> getWaveIds() {
        return waveIds;
    }

    public void setWaveIds(List<Long> waveIds) {
        this.waveIds = waveIds;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public static void main(String[] args) {
        String str = "{\n" +
                "    \"waveIds\": [\n" +
                "        3106311111\n" +
                "    ],\n" +
                "    \"beginTime\": \"2020-05-10 09:51:28.0\",\n" +
                "    \"endTime\": \"2020-05-30 09:51:28.0\"\n" +
                "}";
        PickOrderStaffReportParams params = JSON.parseObject(str, PickOrderStaffReportParams.class);
        System.out.println(params.getWaveIds());
    }
}
