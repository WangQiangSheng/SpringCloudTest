package com.miroslav.house.mapper;

import com.miroslav.house.model.Agency;

public interface AgencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agency
     *
     * @mbg.generated Tue Sep 25 14:35:20 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agency
     *
     * @mbg.generated Tue Sep 25 14:35:20 CST 2018
     */
    int insert(Agency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agency
     *
     * @mbg.generated Tue Sep 25 14:35:20 CST 2018
     */
    int insertSelective(Agency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agency
     *
     * @mbg.generated Tue Sep 25 14:35:20 CST 2018
     */
    Agency selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agency
     *
     * @mbg.generated Tue Sep 25 14:35:20 CST 2018
     */
    int updateByPrimaryKeySelective(Agency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agency
     *
     * @mbg.generated Tue Sep 25 14:35:20 CST 2018
     */
    int updateByPrimaryKey(Agency record);
}