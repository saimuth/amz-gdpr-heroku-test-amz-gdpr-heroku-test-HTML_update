package com.amazon.gdpr.service;

import java.util.List;

import com.amazon.gdpr.dao.AnonymizationPatternDaoImpl;
import com.amazon.gdpr.dao.CategoryDaoImpl;
import com.amazon.gdpr.dao.CountryCodeDaoImpl;
import com.amazon.gdpr.dao.ImpactFieldDaoImpl;
import com.amazon.gdpr.dao.ImpactTableDaoImpl;
import com.amazon.gdpr.dao.UserDaoImpl;
import com.amazon.gdpr.model.AnonymizationPattern;
import com.amazon.gdpr.model.Category;
import com.amazon.gdpr.model.CountryCode;
import com.amazon.gdpr.model.ImpactField;
import com.amazon.gdpr.model.ImpactTable;
import com.amazon.gdpr.model.User;
import com.amazon.gdpr.view.InputDetailsVw;

public class DBAccessService {
		
	public static InputDetailsVw fetchInputDetails() {
		System.out.println("DBAccessService :: fetchUserDetails : Inside Service Details");
		List<User> userList = new UserDaoImpl().userList();
		List<Category> categoryList = new CategoryDaoImpl().categoryList();
		List<CountryCode> countryCodeList = new CountryCodeDaoImpl().countryCodeList()	;
		List<AnonymizationPattern> anonymizationPatternList = new AnonymizationPatternDaoImpl().AnonymizationPatternList();
		List<ImpactTable> impactTableList = new ImpactTableDaoImpl().impactTableList();
		List<ImpactField> impactFieldList = new ImpactFieldDaoImpl().impactFieldList();
		//List<Policy> policyList = new ImpactFieldDaoImpl().impactFieldList();
				return new InputDetailsVw(userList, categoryList,countryCodeList,
						anonymizationPatternList,impactTableList,impactFieldList);
		
	}
}