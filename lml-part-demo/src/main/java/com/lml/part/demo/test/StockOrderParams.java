package com.lml.part.demo.test;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author shuishan
 * @Date 2019-09-02
 **/
public class StockOrderParams {

    /**
     * 成品dbNo
     */
    private Integer goodDbNo;

    public Integer getGoodDbNo() {
        return goodDbNo;
    }

    public void setGoodDbNo(Integer goodDbNo) {
        this.goodDbNo = goodDbNo;
    }


    /**==============================批量查询、更新、删除时的Where条件设置==================================**/

    /**
     * 主键id
     **/
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    /**
     * 创建时间
     **/
    private Date createdStart;

    public Date getCreatedStart() {
        return createdStart;
    }

    public void setCreatedStart(Date created) {
        this.createdStart = created;
    }

    private Date createdEnd;

    public Date getCreatedEnd() {
        return createdEnd;
    }

    public void setCreatedEnd(Date created) {
        this.createdEnd = created;
    }

    private Date createdEqual;

    public Date getCreatedEqual() {
        return createdEqual;
    }

    public void setCreatedEqual(Date created) {
        this.createdEqual = created;
    }

    /**
     * 修改时间
     **/
    private Date modifiedStart;

    public Date getModifiedStart() {
        return modifiedStart;
    }

    public void setModifiedStart(Date modified) {
        this.modifiedStart = modified;
    }

    private Date modifiedEnd;

    public Date getModifiedEnd() {
        return modifiedEnd;
    }

    public void setModifiedEnd(Date modified) {
        this.modifiedEnd = modified;
    }

    private Date modifiedEqual;

    public Date getModifiedEqual() {
        return modifiedEqual;
    }

    public void setModifiedEqual(Date modified) {
        this.modifiedEqual = modified;
    }

    /**
     * enableStatus
     **/
    private Integer enableStatus;

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    /**
     * 公司id
     **/
    private Long companyId;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 加工单code
     **/
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 加工单状态
     **/
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 加工日期
     **/
    private Date productTime;

    public Date getProductTime() {
        return productTime;
    }

    public void setProductTime(Date productTime) {
        this.productTime = productTime;
    }

    private Date productTimeStart;

    public Date getProductTimeStart() {
        return productTimeStart;
    }

    public void setProductTimeStart(Date productTime) {
        this.productTimeStart = productTime;
    }

    private Date productTimeEnd;

    public Date getProductTimeEnd() {
        return productTimeEnd;
    }

    public void setProductTimeEnd(Date productTime) {
        this.productTimeEnd = productTime;
    }

    private Date productTimeEqual;

    public Date getProductTimeEqual() {
        return productTimeEqual;
    }

    public void setProductTimeEqual(Date productTime) {
        this.productTimeEqual = productTime;
    }

    /**
     * 完成日期
     **/
    private Date finishedTimeStart;

    public Date getFinishedTimeStart() {
        return finishedTimeStart;
    }

    public void setFinishedTimeStart(Date finishedTime) {
        this.finishedTimeStart = finishedTime;
    }

    private Date finishedTimeEnd;

    public Date getFinishedTimeEnd() {
        return finishedTimeEnd;
    }

    public void setFinishedTimeEnd(Date finishedTime) {
        this.finishedTimeEnd = finishedTime;
    }

    private Date finishedTimeEqual;

    public Date getFinishedTimeEqual() {
        return finishedTimeEqual;
    }

    public void setFinishedTimeEqual(Date finishedTime) {
        this.finishedTimeEqual = finishedTime;
    }

    /**
     * 原料仓库id
     **/
    private Long materialWarehouseId;

    public Long getMaterialWarehouseId() {
        return materialWarehouseId;
    }

    public void setMaterialWarehouseId(Long materialWarehouseId) {
        this.materialWarehouseId = materialWarehouseId;
    }

    /**
     * 原料仓库ids
     **/
    private List<Long> materialWarehouseIds;

    public List<Long> getMaterialWarehouseIds() {
        return materialWarehouseIds;
    }

    public void setMaterialWarehouseIds(List<Long> materialWarehouseIds) {
        this.materialWarehouseIds = materialWarehouseIds;
    }

    /**
     * 原料仓库名称
     **/
    private String materialWarehouseName;

    public String getMaterialWarehouseName() {
        return materialWarehouseName;
    }

    public void setMaterialWarehouseName(String materialWarehouseName) {
        this.materialWarehouseName = materialWarehouseName;
    }

    /**
     * 加工仓库id
     **/
    private Long productWarehouseId;

    public Long getProductWarehouseId() {
        return productWarehouseId;
    }

    public void setProductWarehouseId(Long productWarehouseId) {
        this.productWarehouseId = productWarehouseId;
    }

    /**
     * 加工仓库ids
     **/
    private List<Long> productWarehouseIds;

    public List<Long> getProductWarehouseIds() {
        return productWarehouseIds;
    }

    public void setProductWarehouseIds(List<Long> productWarehouseIds) {
        this.productWarehouseIds = productWarehouseIds;
    }

    /**
     * 加工仓库名称
     **/
    private String productWarehouseName;

    public String getProductWarehouseName() {
        return productWarehouseName;
    }

    public void setProductWarehouseName(String productWarehouseName) {
        this.productWarehouseName = productWarehouseName;
    }

    /**
     * 波次号
     **/
    private Long waveId;

    public Long getWaveId() {
        return waveId;
    }

    public void setWaveId(Long waveId) {
        this.waveId = waveId;
    }

    /**
     * 波次号waveIds
     **/
    private List<Long> waveIds;

    public List<Long> getWaveIds() {
        return waveIds;
    }

    public void setWaveIds(List<Long> waveIds) {
        this.waveIds = waveIds;
    }

    /**
     * 拣选状态
     **/
    private String waveStatus;

    public String getWaveStatus() {
        return waveStatus;
    }

    public void setWaveStatus(String waveStatus) {
        this.waveStatus = waveStatus;
    }

    /**
     * 制单人id
     **/
    private Long createId;

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 制单人姓名
     **/
    private String createName;

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 加工人id
     **/
    private Long productId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 加工人ids
     **/
    private List<Long> productIds;

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    /**
     * 加工人姓名
     **/
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 加工工厂
     **/
    private String factory;

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    /**
     * 加工费用
     **/
    private String amount;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 备注
     **/
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * ==============================批量查询时的Order条件顺序设置==================================
     **/
    public class OrderField {
        public OrderField(String fieldName, String order) {
            super();
            this.fieldName = fieldName;
            this.order = order;
        }

        private String fieldName;
        private String order;

        public String getFieldName() {
            return fieldName;
        }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }
    }

    /**==============================批量查询时的Order条件顺序设置==================================**/
    /**
     * 排序列表字段
     **/
    private List<OrderField> orderFields = new ArrayList<>();

//    public void setOrderById(boolean isAsc) {
//        orderbyId(isAsc);
//    }

    /**
     * 设置排序按属性：主键id
     *
     * @param isAsc 是否升序，否则为降序
     */
    @JSONField(name = "orderbyId")
    public void orderbyId(boolean isAsc) {
        orderFields.add(new OrderField("id", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：创建时间
     *
     * @param isAsc 是否升序，否则为降序
     */
    @JSONField(name = "orderbyCreated")
    public void orderbyCreated(boolean isAsc) {
        orderFields.add(new OrderField("created", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：修改时间
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyModified(boolean isAsc) {
        orderFields.add(new OrderField("modified", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：enableStatus
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyEnableStatus(boolean isAsc) {
        orderFields.add(new OrderField("enable_status", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：公司id
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyCompanyId(boolean isAsc) {
        orderFields.add(new OrderField("company_id", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工单code
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyCode(boolean isAsc) {
        orderFields.add(new OrderField("code", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工单状态
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyStatus(boolean isAsc) {
        orderFields.add(new OrderField("status", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工日期
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyProductTime(boolean isAsc) {
        orderFields.add(new OrderField("product_time", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：完成日期
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyFinishedTime(boolean isAsc) {
        orderFields.add(new OrderField("finished_time", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：原料仓库id
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyMaterialWarehouseId(boolean isAsc) {
        orderFields.add(new OrderField("material_warehouse_id", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：原料仓库名称
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyMaterialWarehouseName(boolean isAsc) {
        orderFields.add(new OrderField("material_warehouse_name", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工仓库id
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyProductWarehouseId(boolean isAsc) {
        orderFields.add(new OrderField("product_warehouse_id", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工仓库名称
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyProductWarehouseName(boolean isAsc) {
        orderFields.add(new OrderField("product_warehouse_name", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：波次号
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyWaveId(boolean isAsc) {
        orderFields.add(new OrderField("wave_id", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：拣选状态
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyWaveStatus(boolean isAsc) {
        orderFields.add(new OrderField("wave_status", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：制单人id
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyCreateId(boolean isAsc) {
        orderFields.add(new OrderField("create_id", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：制单人姓名
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyCreateName(boolean isAsc) {
        orderFields.add(new OrderField("create_name", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工人id
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyProductId(boolean isAsc) {
        orderFields.add(new OrderField("product_id", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工人姓名
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyProductName(boolean isAsc) {
        orderFields.add(new OrderField("product_name", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工工厂
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyFactory(boolean isAsc) {
        orderFields.add(new OrderField("factory", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：加工费用
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyAmount(boolean isAsc) {
        orderFields.add(new OrderField("amount", isAsc ? "ASC" : "DESC"));
    }

    /**
     * 设置排序按属性：备注
     *
     * @param isAsc 是否升序，否则为降序
     */
    public void orderbyRemark(boolean isAsc) {
        orderFields.add(new OrderField("remark", isAsc ? "ASC" : "DESC"));
    }

    public List<OrderField> getOrderFields() {
        return orderFields;
    }

    public void setOrderFields(List<OrderField> orderFields) {
        this.orderFields = orderFields;
    }

    public StockOrderParams() {
    }
}

