package cn.log.mappers;

import cn.log.pojo.LgCompany;
import java.util.List;

public interface LgCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_company
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer companyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_company
     *
     * @mbggenerated
     */
    int insert(LgCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_company
     *
     * @mbggenerated
     */
    LgCompany selectByPrimaryKey(Integer companyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_company
     *
     * @mbggenerated
     */
    List<LgCompany> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lg_company
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LgCompany record);
}