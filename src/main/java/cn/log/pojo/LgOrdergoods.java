package cn.log.pojo;

import java.io.Serializable;

public class LgOrdergoods implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_ordergoods.orderGoodsId
     *
     * @mbggenerated
     */
    private Integer ordergoodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_ordergoods.orderId
     *
     * @mbggenerated
     */
    private Integer orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lg_ordergoods.goodsId
     *
     * @mbggenerated
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lg_ordergoods
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_ordergoods.orderGoodsId
     *
     * @return the value of lg_ordergoods.orderGoodsId
     *
     * @mbggenerated
     */
    public Integer getOrdergoodsid() {
        return ordergoodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_ordergoods.orderGoodsId
     *
     * @param ordergoodsid the value for lg_ordergoods.orderGoodsId
     *
     * @mbggenerated
     */
    public void setOrdergoodsid(Integer ordergoodsid) {
        this.ordergoodsid = ordergoodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_ordergoods.orderId
     *
     * @return the value of lg_ordergoods.orderId
     *
     * @mbggenerated
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_ordergoods.orderId
     *
     * @param orderid the value for lg_ordergoods.orderId
     *
     * @mbggenerated
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lg_ordergoods.goodsId
     *
     * @return the value of lg_ordergoods.goodsId
     *
     * @mbggenerated
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lg_ordergoods.goodsId
     *
     * @param goodsid the value for lg_ordergoods.goodsId
     *
     * @mbggenerated
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_ordergoods
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordergoodsid=").append(ordergoodsid);
        sb.append(", orderid=").append(orderid);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}