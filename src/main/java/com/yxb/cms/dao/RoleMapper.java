
package com.yxb.cms.dao;

import com.yxb.cms.domain.vo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 角色DAO
 */
@Mapper
public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int updateByPrimaryKey(Role record);

    /**
     * 更改角色状态
     * @param params
     */
    void updateRoleByStatus(Map<String, Object> params);
    /**
     * 查询角色总记录数
     * @param role 角色实体
     * @return
     */
    Long selectCountRole(Role role);

    /**
     * 角色信息分页列表显示
     * @param role 角色实体
     * @return
     */
    List<Role> selectRoleListByPage(Role role);

    /**
     * 角色信息列表
     * @param role 角色实体
     * @return
     */
    List<Role> selectRoleList(Role role);


    /**
     * 验证角色名称唯一性
     * @param roleName 角色名称
     * @param roleId   角色Id
     * @return
     */
    Long selectRoleNameCheck(@Param("roleName") String roleName,@Param("roleId") Integer roleId);
    /**
     * 根据用户Id查询用户所对应的角色信息
     * @param userId 用户Id
     * @return
     */
    List<Role> selectUserRolesByUserId(@Param("userId") Integer userId);

    /**
     * 查询状态为有效的所有角色信息
     * @return
     */
     List<Role>selectRoleListByStatus();

    /**
     *  查询状态为有效的待分配角色信息(已分配的角色信息除外)
     *  @param roleId 角色Id
     */
    List<Role> selectUserRoleByRoleIdList(Integer[] roleId);

    /**
     * 查询状态为有效的已分配角色信息
     * @param roleId 角色Id
     * @return
     */
    List<Role> selectDeceasedUserRoleByRoleIdList(Integer[] roleId);


}