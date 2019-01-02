package cn.log.pojo;

import java.io.Serializable;

public class LgGoodstype implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goodstype.goodsTypeId
     *
     * @mbggenerated
     */
    private Integer goodstypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goodstype.goodsTypeName
     *
     * @mbggenerated
     */
    private String goodstypename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goodstype.goosTypeAttribute
     *
     * @mbggenerated
     */
    private Integer goostypeattribute;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goodstype.remarks1
     *
     * @mbggenerated
     */
    private String remarks1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_goodstype.remarks2
     *
     * @mbggenerated
     */
    private String remarks2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_goodstype
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goodstype.goodsTypeId
     *
     * @return the value of lg_goodstype.goodsTypeId
     *
     * @mbggenerated
     */
    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goodstype.goodsTypeId
     *
     * @param goodstypeid the value for lg_goodstype.goodsTypeId
     *
     * @mbggenerated
     */
    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goodstype.goodsTypeName
     *
     * @return the value of lg_goodstype.goodsTypeName
     *
     * @mbggenerated
     */
    public String getGoodstypename() {
        return goodstypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goodstype.goodsTypeName
     *
     * @param goodstypename the value for lg_goodstype.goodsTypeName
     *
     * @mbggenerated
     */
    public void setGoodstypename(String goodstypename) {
        this.goodstypename = goodstypename == null ? null : goodstypename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goodstype.goosTypeAttribute
     *
     * @return the value of lg_goodstype.goosTypeAttribute
     *
     * @mbggenerated
     */
    public Integer getGoostypeattribute() {
        return goostypeattribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goodstype.goosTypeAttribute
     *
     * @param goostypeattribute the value for lg_goodstype.goosTypeAttribute
     *
     * @mbggenerated
     */
    public void setGoostypeattribute(Integer goostypeattribute) {
        this.goostypeattribute = goostypeattribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goodstype.remarks1
     *
     * @return the value of lg_goodstype.remarks1
     *
     * @mbggenerated
     */
    public String getRemarks1() {
        return remarks1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goodstype.remarks1
     *
     * @param remarks1 the value for lg_goodstype.remarks1
     *
     * @mbggenerated
     */
    public void setRemarks1(String remarks1) {
        this.remarks1 = remarks1 == null ? null : remarks1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_goodstype.remarks2
     *
     * @return the value of lg_goodstype.remarks2
     *
     * @mbggenerated
     */
    public String getRemarks2() {
        return remarks2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_goodstype.remarks2
     *
     * @param remarks2 the value for lg_goodstype.remarks2
     *
     * @mbggenerated
     */
    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2 == null ? null : remarks2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_goodstype
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodstypeid=").append(goodstypeid);
        sb.append(", goodstypename=").append(goodstypename);
        sb.append(", goostypeattribute=").append(goostypeattribute);
        sb.append(", remarks1=").append(remarks1);
        sb.append(", remarks2=").append(remarks2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}