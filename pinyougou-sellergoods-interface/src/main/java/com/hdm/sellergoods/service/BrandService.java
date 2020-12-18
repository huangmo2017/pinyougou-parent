package com.hdm.sellergoods.service;

import com.hdm.entity.PageResult;
import com.hdm.pojo.TbBrand;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author HDM
 * @Date 2020-12-13 19:48
 */
public interface BrandService {
    /*
     *@Description 返回全部列表
     *@param
     *@return java.util.List<com.hdm.pojo.TbBrand>
     *@date 2020/12/13 20:05
     *@author HDM
    */
    List<TbBrand> findAll();

    /*
     *@Description 返回分页列表
     *@param 
     * @param pageNum
     * @param pageSize
     *@return com.hdm.entity.PageResult
     *@date 2020/12/14 19:44
     *@author HDM
    */
    PageResult findPage(int pageNum, int pageSize);

    /*
     *@Description 增加品牌
     *@param 
     * @param brand
     *@return void
     *@date 2020/12/14 20:06
     *@author HDM
    */
    void add(TbBrand brand);

    /*
     *@Description 修改品牌
     *@param 
     * @param brand
     *@return void
     *@date 2020/12/14 20:24
     *@author HDM
    */
    void update(TbBrand brand);

    /*
     *@Description 根据ID获取品牌
     *@param 
     * @param id
     *@return com.hdm.pojo.TbBrand
     *@date 2020/12/14 20:25
     *@author HDM
    */
    TbBrand findOne(Long id);

    /*
     *@Description 批量删除品牌
     *@param 
     * @param ids
     *@return void
     *@date 2020/12/14 20:34
     *@author HDM
    */
    void delete(Long[] ids);

    /*
     *@Description 分页查询
     *@param 
     * @param brand
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     *@return com.hdm.entity.PageResult
     *@date 2020/12/14 20:41
     *@author HDM
    */
    PageResult findPage(TbBrand brand, int pageNum, int pageSize);

    List<Map> selectOptionList();
}
