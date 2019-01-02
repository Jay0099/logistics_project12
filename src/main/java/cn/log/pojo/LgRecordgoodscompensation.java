package cn.log.pojo;

import java.io.Serializable;

public class LgRecordgoodscompensation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_recordgoodscompensation.recordGoodsId
     *
     * @mbggenerated
     */
    private Integer recordgoodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_recordgoodscompensation.compensationType
     *
     * @mbggenerated
     */
    private Integer compensationtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_recordgoodscompensation.compensationAmount
     *
     * @mbggenerated
     */
    private Double compensationamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_recordgoodscompensation.compensationStatus
     *
     * @mbggenerated
     */
    private Integer compensationstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_recordgoodscompensation.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_recordgoodscompensation.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_recordgoodscompensation
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_recordgoodscompensation.recordGoodsId
     *
     * @return the value of lg_recordgoodscompensation.recordGoodsId
     *
     * @mbggenerated
     */
    public Integer getRecordgoodsid() {
        return recordgoodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_recordgoodscompensation.recordGoodsId
     *
     * @param recordgoodsid the value for lg_recordgoodscompensation.recordGoodsId
     *
     * @mbggenerated
     */
    public void setRecordgoodsid(Integer recordgoodsid) {
        this.recordgoodsid = recordgoodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_recordgoodscompensation.compensationType
     *
     * @return the value of lg_recordgoodscompensation.compensationType
     *
     * @mbggenerated
     */
    public Integer getCompensationtype() {
        return compensationtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_recordgoodscompensation.compensationType
     *
     * @param compensationtype the value for lg_recordgoodscompensation.compensationType
     *
     * @mbggenerated
     */
    public void setCompensationtype(Integer compensationtype) {
        this.compensationtype = compensationtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_recordgoodscompensation.compensationAmount
     *
     * @return the value of lg_recordgoodscompensation.compensationAmount
     *
     * @mbggenerated
     */
    public Double getCompensationamount() {
        return compensationamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_recordgoodscompensation.compensationAmount
     *
     * @param compensationamount the value for lg_recordgoodscompensation.compensationAmount
     *
     * @mbggenerated
     */
    public void setCompensationamount(Double compensationamount) {
        this.compensationamount = compensationamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_recordgoodscompensation.compensationStatus
     *
     * @return the value of lg_recordgoodscompensation.compensationStatus
     *
     * @mbggenerated
     */
    public Integer getCompensationstatus() {
        return compensationstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_recordgoodscompensation.compensationStatus
     *
     * @param compensationstatus the value for lg_recordgoodscompensation.compensationStatus
     *
     * @mbggenerated
     */
    public void setCompensationstatus(Integer compensationstatus) {
        this.compensationstatus = compensationstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_recordgoodscompensation.remarks1
     *
     * @return the value of lg_recordgoodscompensation.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_recordgoodscompensation.remarks1
     *
     * @param remarks1 the value for lg_recordgoodscompensation.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_recordgoodscompensation.remarks2
     *
     * @return the value of lg_recordgoodscompensation.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_recordgoodscompensation.remarks2
     *
     * @param remarks2 the value for lg_recordgoodscompensation.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_recordgoodscompensation
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordgoodsid=").append(recordgoodsid);
        sb.append(", compensationtype=").append(compensationtype);
        sb.append(", compensationamount=").append(compensationamount);
        sb.append(", compensationstatus=").append(compensationstatus);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}