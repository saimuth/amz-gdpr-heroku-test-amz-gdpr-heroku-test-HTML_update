package com.amazon.gdpr.view;

import java.util.List;

import com.amazon.gdpr.dao.ImpactTableDaoImpl;
import com.amazon.gdpr.model.AnonymizationPattern;
import com.amazon.gdpr.model.Category;
import com.amazon.gdpr.model.CountryCode;
import com.amazon.gdpr.model.ImpactField;
import com.amazon.gdpr.model.ImpactTable;
import com.amazon.gdpr.model.User;

public class InputDetailsVw {
	public List<User> userList;
	public List<Category> categoryList;
	public List<CountryCode> countryCodeList;
	public List<AnonymizationPattern> anonymizationPattern;
	public List<ImpactTable> impactTableList ;
	public List<ImpactField> impactFieldList;
	public InputDetailsVw(List<User> userList, List<Category> categoryList,List<CountryCode> countryCodeList,List<AnonymizationPattern> anonymizationPattern,
			List<ImpactTable> impactTableList, List<ImpactField> impactFieldList ) {
		super();
		this.userList = userList;
		this.categoryList = categoryList;
		this.countryCodeList = countryCodeList;
		this.impactTableList = impactTableList;
		this.impactFieldList = impactFieldList;
		
	}
}