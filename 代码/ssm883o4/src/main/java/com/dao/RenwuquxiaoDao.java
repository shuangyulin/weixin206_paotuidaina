package com.dao;

import com.entity.RenwuquxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwuquxiaoVO;
import com.entity.view.RenwuquxiaoView;


/**
 * 任务取消
 * 
 * @author 
 * @email 
 * @date 2022-03-07 17:04:49
 */
public interface RenwuquxiaoDao extends BaseMapper<RenwuquxiaoEntity> {
	
	List<RenwuquxiaoVO> selectListVO(@Param("ew") Wrapper<RenwuquxiaoEntity> wrapper);
	
	RenwuquxiaoVO selectVO(@Param("ew") Wrapper<RenwuquxiaoEntity> wrapper);
	
	List<RenwuquxiaoView> selectListView(@Param("ew") Wrapper<RenwuquxiaoEntity> wrapper);

	List<RenwuquxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<RenwuquxiaoEntity> wrapper);
	
	RenwuquxiaoView selectView(@Param("ew") Wrapper<RenwuquxiaoEntity> wrapper);
	

}
