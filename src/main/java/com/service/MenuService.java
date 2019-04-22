package com.service;

import com.domain.entity.Menu;
import com.domain.entity.User;

import java.util.List;

public interface MenuService {
    /**
     * 查询所有正常的菜单
     * @return
     */
    public List<Menu> getAllMenu() ;
}
