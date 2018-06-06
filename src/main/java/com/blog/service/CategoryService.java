package com.blog.service;


import com.blog.condition.CategoryCondition;
import com.blog.domain.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CategoryService {

    /**
     * 分页查询
     * @param categoryCondition
     * @return
     */
    Page<Category> listByCondition(CategoryCondition categoryCondition);

    /**
     * 添加类目
     */
    void save (Category category);

    /**
     * 主键查询
     * @param id
     */
    Category getById(Long id);

    /**
     * 主键删除
     * @param id
     */
    void deleteById(Long id);

}