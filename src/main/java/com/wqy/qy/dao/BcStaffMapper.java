package com.wqy.qy.dao;

import com.wqy.qy.pojo.po.BcStaff;
import com.wqy.qy.pojo.po.BcStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcStaffMapper {
    int countByExample(BcStaffExample example);

    int deleteByExample(BcStaffExample example);

    int deleteByPrimaryKey(String id);

    int insert(BcStaff record);

    int insertSelective(BcStaff record);

    List<BcStaff> selectByExample(BcStaffExample example);

    BcStaff selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BcStaff record, @Param("example") BcStaffExample example);

    int updateByExample(@Param("record") BcStaff record, @Param("example") BcStaffExample example);

    int updateByPrimaryKeySelective(BcStaff record);

    int updateByPrimaryKey(BcStaff record);
}