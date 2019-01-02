package cn.log.mappers;

import cn.log.pojo.LgDriver;
import java.util.List;

public interface LgDriverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_driver
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer driverid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_driver
     *
     * @mbggenerated
     */
    int insert(LgDriver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_driver
     *
     * @mbggenerated
     */
    LgDriver selectByPrimaryKey(Integer driverid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_driver
     *
     * @mbggenerated
     */
    List<LgDriver> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_driver
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgDriver record);
}