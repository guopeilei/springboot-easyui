package com.service.impl;

import com.domain.entity.Menu;
import com.domain.mapper.MenuMapper;
import com.domain.mapper.UserMapper;
import com.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenu() {
        List<Menu> menus = menuMapper.getAllMenu();
        return menus;
    }
}
