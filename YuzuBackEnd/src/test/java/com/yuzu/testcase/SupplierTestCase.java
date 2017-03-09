package com.yuzu.testcase;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yuzu.dao.SupplierDAO;
import com.yuzu.domain.Supplier;

public class SupplierTestCase {

	@Autowired
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static Supplier supplier;
	@Autowired
	private static SupplierDAO supplierDAO;

	@BeforeClass
	public static void initialize() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.yuzu.*");
		context.refresh();
		supplier = (Supplier) context.getBean("supplier");

		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}

	@Test
	public void createSupplierTestCase() {
		supplier.setId("S3002");
		supplier.setName("ECameras");

		supplier.setAddress("Ayodhya322,Noida");

		boolean flag = supplierDAO.save(supplier);
		Assert.assertEquals("createSupplierTestCase", true, flag);
	}

	/*
	 * @Test public void deleteSupplierTestCase() { Supplier supplier =
	 * (Supplier) supplierDAO.getSupplierByID("IDC3002"); boolean flag =
	 * supplierDAO.delete(product); Assert.assertEquals(true, flag);}
	 */

	/*
	 * @Test public void updateSupplierTestCase() { supplier.setId("S3002");
	 * supplier.setName("ECameras");
	 * 
	 * supplier.setAddress("Ayodhya322,Noida");
	 * 
	 * boolean flag = supplierDAO.update(supplier);
	 * 
	 * Assert.assertEquals("update product test case",true, flag);}
	 */

}
