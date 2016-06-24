package com.mns.blog.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.ui.Model;

public class ControllerTest {
	
	@InjectMocks
	Model model;

	@Test
	public void test() {
		
		
		
		Mockito.when("return x").thenReturn("y");
		assertEquals("y", model);
		fail("Not yet implemented");
	}

}
