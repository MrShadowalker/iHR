package org.javaboy.vhr.mapper;

import org.javaboy.vhr.model.AdjustSalary;

/**
 * @author Shadowalker
 */
public interface AdjustSalaryMapper {
    /**
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @param record
     * @return
     */
    int insert(AdjustSalary record);

    /**
     * @param record
     * @return
     */
    int insertSelective(AdjustSalary record);

    AdjustSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdjustSalary record);

    int updateByPrimaryKey(AdjustSalary record);
}