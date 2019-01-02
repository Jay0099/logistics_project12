package cn.log.mappers;

import cn.log.pojo.LgOrder;
import java.util.List;

public interface LgOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_order
     *
     * @mbggenerated
     */
    int insert(LgOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_order
     *
     * @mbggenerated
     */
    LgOrder selectByPrimaryKey(Integer orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_order
     *
     * @mbggenerated
     */
    List<LgOrder> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgOrder record);
}