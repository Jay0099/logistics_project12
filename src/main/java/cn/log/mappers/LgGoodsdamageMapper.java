package cn.log.mappers;

import cn.log.pojo.LgGoodsdamage;
import java.util.List;

public interface LgGoodsdamageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_goodsdamage
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer goodsdamageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_goodsdamage
     *
     * @mbggenerated
     */
    int insert(LgGoodsdamage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_goodsdamage
     *
     * @mbggenerated
     */
    LgGoodsdamage selectByPrimaryKey(Integer goodsdamageid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_goodsdamage
     *
     * @mbggenerated
     */
    List<LgGoodsdamage> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_goodsdamage
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgGoodsdamage record);
}