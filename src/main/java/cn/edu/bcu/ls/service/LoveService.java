package cn.edu.bcu.ls.service;

import java.util.List;

import cn.edu.bcu.ls.entity.Love;

public interface LoveService {
	int insert(Love record);

	int deleteLove(Love love);
	
	List<Love> queryLove(Love love);
}
