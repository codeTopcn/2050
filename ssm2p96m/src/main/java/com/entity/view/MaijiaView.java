package com.entity.view;

import com.entity.MaijiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 卖家
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 18:09:59
 */
@TableName("maijia")
public class MaijiaView  extends MaijiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MaijiaView(){
	}
 
 	public MaijiaView(MaijiaEntity maijiaEntity){
 	try {
			BeanUtils.copyProperties(this, maijiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
