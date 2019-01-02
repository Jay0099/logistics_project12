package cn.log.mappers;

import cn.log.pojo.LgWarehouse;
import java.util.List;

public interface LgWarehouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_warehouse
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer warehouseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_warehouse
     *
     * @mbggenerated
     */
    int insert(LgWarehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_warehouse
     *
     * @mbggenerated
     */
    LgWarehouse selectByPrimaryKey(Integer warehouseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_warehouse
     *
     * @mbggenerated
     */
    List<LgWarehouse> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_warehouse
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgWarehouse record);
}