package com.imooc.mapper;

import java.util.List;

import com.imooc.pojo.SysUser;
import com.imooc.utils.MyMapper;

public interface SysUserMapperCustom extends MyMapper<SysUser> {

	List<SysUser> queryUserSimplyInfoById(String id);
}
