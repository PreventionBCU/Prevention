package cn.edu.bcu.ls.mapper;

import cn.edu.bcu.ls.entity.Report;

public interface ReportMapper {
    int deleteByPrimaryKey(Integer reportId);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(Integer reportId);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}