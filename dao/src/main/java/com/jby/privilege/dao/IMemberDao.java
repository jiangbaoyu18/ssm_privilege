package com.jby.privilege.dao;

import com.jby.privilege.domain.Members;
import org.apache.ibatis.annotations.Select;

public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    public Members findById(String id) throws Exception;
}
