package com.hdm.pojogroup;

import com.hdm.pojo.TbSpecification;
import com.hdm.pojo.TbSpecificationOption;

import java.io.Serializable;
import java.util.List;

/**
 * 规格组合实体类
 * @author Administrator
 *
 */
public class Specification implements Serializable{

	private TbSpecification specification;
	
	private List<TbSpecificationOption> specificationOptionList;

	public TbSpecification getSpecification() {
		return specification;
	}

	public void setSpecification(TbSpecification specification) {
		this.specification = specification;
	}

	public List<TbSpecificationOption> getSpecificationOptionList() {
		return specificationOptionList;
	}

	public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
		this.specificationOptionList = specificationOptionList;
	}
	
	
	
	
}
