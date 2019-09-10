package com.mare.utils;

import org.junit.Assert;
import org.junit.Test;

public class CommonUtilsTest {
	
	@Test
	public void testNullEmptyCheck() {
		Assert.assertTrue(CommonUtils.nullEmptyCheck(""));
		Assert.assertTrue(CommonUtils.nullEmptyCheck(null));
		Assert.assertFalse(CommonUtils.nullEmptyCheck("1"));
		Assert.assertFalse(CommonUtils.nullEmptyCheck("234"));
		Assert.assertFalse(CommonUtils.nullEmptyCheck("   "));
		Assert.assertFalse(CommonUtils.nullEmptyCheck("   fjadk488"));
	}
	
	@Test
	public void testEquals() {
		Assert.assertFalse(CommonUtils.equal(new String("1"), null));
		Assert.assertFalse(CommonUtils.equal(null, new String("1")));
		Assert.assertTrue(CommonUtils.equal(null, null));
		Assert.assertTrue(CommonUtils.equal(new String("12"), new String("12")));
		Assert.assertFalse(CommonUtils.equal(new String("12"), new String("123")));
	}
}
