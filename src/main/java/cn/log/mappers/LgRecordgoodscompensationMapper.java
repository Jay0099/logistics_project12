package cn.log.mappers;

import cn.log.pojo.LgRecordgoodscompensation;
import java.util.List;

public interface LgRecordgoodscompensationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_recordgoodscompensation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer recordgoodsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_recordgoodscompensation
     *
     * @mbggenerated
     */
    int insert(LgRecordgoodscompensation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_recordgoodscompensation
     *
     * @mbggenerated
     */
    LgRecordgoodscompensation selectByPrimaryKey(Integer recordgoodsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_recordgoodscompensation
     *
     * @mbggenerated
     */
    List<LgRecordgoodscompensation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_recordgoodscompensation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgRecordgoodscompensation record);
}