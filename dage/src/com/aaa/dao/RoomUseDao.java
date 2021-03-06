/**
 * 
 */
package com.aaa.dao;

import java.util.List;
import java.util.Map;



/***
 *@className:UserDao.java
 *@Discriptron:
 *@author:chenMin
 *@createTime:2018-9-27上午10:42:03
 *@version:
 */
@SuppressWarnings("all")
public interface RoomUseDao {
	/**
	 * 添加
	 * @param map
	 * @return
	 */
	int addUser(Map<String,Object> map);
	/**
	 * 更新
	 * @param map
	 * @return
	 */
	int updateUser(Map<String,Object> map);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int delUser(int id);
	/**
	 * 获取分页数据
	 * @param start 开始值
	 * @param rows	每页显示数量
	 * @param map	其他参数
	 * @return
	 */
	List<Map<String,Object>> getPage(int start,int rows,Map map);
	/**
	 * 获取分页数据的总数量
	 * @param map
	 * @return
	 */
	List<Map<String,Object>> getPageCount(Map map);
	/**
	 * 获取每日财务收入数据
	 */
	List<Map<String,Object>> getDayFinance(Map map);
	
}
