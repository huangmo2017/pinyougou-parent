package com.hdm.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hdm.entity.PageResult;
import com.hdm.entity.Result;
import com.hdm.pojo.TbBrand;
import com.hdm.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Description 品牌 Controller
 * @Author HDM
 * @Date 2020-12-13 20:08
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    /*
     *@Description 返回全部列表
     *@param
     *@return java.util.List<com.hdm.pojo.TbBrand>
     *@date 2020/12/13 20:10
     *@author HDM
     */
    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }

    /*
     *@Description 返回分页列表
     *@param
     * @param page
     * @param rows
     *@return com.hdm.entity.PageResult
     *@date 2020/12/14 19:50
     *@author HDM
     */
    @RequestMapping("/findPage")
    public PageResult findPage(int page, int rows) {
        return brandService.findPage(page, rows);
    }

    /*
     *@Description 增加品牌
     *@param
     * @param brand
     *@return com.hdm.entity.Result
     *@date 2020/12/14 20:26
     *@author HDM
     */
    @RequestMapping("/add")
    public Result add(@RequestBody TbBrand brand) {
        try {
            brandService.add(brand);
            return new Result(true, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "增加失败");
        }
    }

    /*
     *@Description 修改品牌
     *@param
     * @param brand
     *@return com.hdm.entity.Result
     *@date 2020/12/14 20:28
     *@author HDM
     */
    @RequestMapping("/update")
    public Result update(@RequestBody TbBrand brand) {
        try {
            brandService.update(brand);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /*
     *@Description 根据ID获取品牌
     *@param
     * @param id
     *@return com.hdm.pojo.TbBrand
     *@date 2020/12/14 20:29
     *@author HDM
    */
    @RequestMapping("/findOne")
    public TbBrand findOne(Long id) {
        return brandService.findOne(id);
    }

    /*
     *@Description 批量删除品牌
     *@param
     * @param ids
     *@return com.hdm.entity.Result
     *@date 2020/12/14 20:37
     *@author HDM
    */
    @RequestMapping("/delete")
    public Result delete(Long[] ids) {
        try {
            brandService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    /*
     *@Description 查询+分页
     *@param
     * @param brand
     * @param page
     * @param rows
     *@return com.hdm.entity.PageResult
     *@date 2020/12/14 22:50
     *@author HDM
    */
    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand, int page, int rows) {
        return brandService.findPage(brand, page, rows);
    }

    @RequestMapping("/selectOptionList")
    public List<Map> selectOptionList() {
        return brandService.selectOptionList();
    }

}
