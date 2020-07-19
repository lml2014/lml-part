package com.lml.part.demo.collections.sort;

import java.util.Date;
import java.util.List;

public class WaveSortingDetail {

    private Long id;

    private Long companyId;

    private Long sortingId;

    private Long waveId;

    private Integer suitType;

    private Long combineId;

    private String title;

    private String shortTitle;

    private String propertiesName;

    private String propertiesAlias;

    private String picPath;

    private Long orderId;

    private Long sysItemId;

    private Long sysSkuId;

    /**
     * 商品数量
     */
    private Integer itemNum;

    /**
     * 分拣明细所在订单的该商品总数（合单或套件中某种商品的明细会有多条）
     */
    private Integer totalNum;

    /**
     * 已匹配数量
     */
    private Integer matchedNum;

    /**
     * 已拣数量
     */
    private Integer pickedNum;

    private Integer stockNum;

    /**
     * 缺货数
     */
    private Integer shortageNum;

    /**
     * 匹配状态， 0：未匹配   1：匹配中   2：匹配完成
     */
    private Integer matchedStatus;

    private Long sid;

    /**
     * 订单匹配 true表示匹配完成
     */
    private Boolean tradeMatched;

    private Integer printStatus;

    private Long positionNo;

    private Integer enableStatus;

    private String goodsSectionStr;

    private Date modified;

    private Boolean qualityType;

    /**
     * 变更的播种数
     */
    private Integer changeMatchedNum;

    /**
     * 拣选员ids，同种商品可能是多个拣选员
     */
    private String pickerIds;

    /**
     * 拣选员名称
     */
    private String pickerNames;


    /**
     * 播种结束时间
     */
    private Date seedEndTime;


    /**
     * 播种时间列表
     */
    private List<Date> seedTimeList;

    /**
     * 唯一码
     */
    private String uniqueCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getSortingId() {
        return sortingId;
    }

    public void setSortingId(Long sortingId) {
        this.sortingId = sortingId;
    }

    public Integer getSuitType() {
        return suitType;
    }

    public void setSuitType(Integer suitType) {
        this.suitType = suitType;
    }

    public Long getCombineId() {
        return combineId;
    }

    public void setCombineId(Long combineId) {
        this.combineId = combineId;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Integer getMatchedNum() {
        return matchedNum;
    }

    public void setMatchedNum(Integer matchedNum) {
        this.matchedNum = matchedNum;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Integer getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(Integer printStatus) {
        this.printStatus = printStatus;
    }

    public Integer getMatchedStatus() {
        return matchedStatus;
    }

    public void setMatchedStatus(Integer matchedStatus) {
        this.matchedStatus = matchedStatus;
    }

    public Long getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(Long positionNo) {
        this.positionNo = positionNo;
    }

    public Boolean getTradeMatched() {
        return tradeMatched;
    }

    public void setTradeMatched(Boolean tradeMatched) {
        this.tradeMatched = tradeMatched;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public String getPropertiesName() {
        return propertiesName;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSysItemId() {
        return sysItemId;
    }

    public void setSysItemId(Long sysItemId) {
        this.sysItemId = sysItemId;
    }

    public Long getSysSkuId() {
        return sysSkuId;
    }

    public void setSysSkuId(Long sysSkuId) {
        this.sysSkuId = sysSkuId;
    }

    public String getPropertiesAlias() {
        return propertiesAlias;
    }

    public void setPropertiesAlias(String propertiesAlias) {
        this.propertiesAlias = propertiesAlias;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getPickedNum() {
        return pickedNum;
    }

    public void setPickedNum(Integer pickedNum) {
        this.pickedNum = pickedNum;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getGoodsSectionStr() {
        return goodsSectionStr;
    }

    public void setGoodsSectionStr(String goodsSectionStr) {
        this.goodsSectionStr = goodsSectionStr;
    }

    public Long getWaveId() {
        return waveId;
    }

    public void setWaveId(Long waveId) {
        this.waveId = waveId;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Boolean getQualityType() {
        return qualityType;
    }

    public void setQualityType(Boolean qualityType) {
        this.qualityType = qualityType;
    }

    public Integer getChangeMatchedNum() {
        return changeMatchedNum;
    }

    public void setChangeMatchedNum(Integer changeMatchedNum) {
        this.changeMatchedNum = changeMatchedNum;
    }

    public String getPickerIds() {
        return pickerIds;
    }

    public void setPickerIds(String pickerIds) {
        this.pickerIds = pickerIds;
    }

    public String getPickerNames() {
        return pickerNames;
    }

    public void setPickerNames(String pickerName) {
        this.pickerNames = pickerName;
    }

    public Integer getShortageNum() {
        return shortageNum;
    }

    public void setShortageNum(Integer shortageNum) {
        this.shortageNum = shortageNum;
    }

    public Date getSeedEndTime() {
        return seedEndTime;
    }

    public void setSeedEndTime(Date seedEndTime) {
        this.seedEndTime = seedEndTime;
    }

    public List<Date> getSeedTimeList() {
        return seedTimeList;
    }

    public void setSeedTimeList(List<Date> seedTimeList) {
        this.seedTimeList = seedTimeList;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

}
