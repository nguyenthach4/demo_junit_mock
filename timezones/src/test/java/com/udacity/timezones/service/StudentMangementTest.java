package com.udacity.timezones.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.udacity.timezones.common.StudentCommon;
import com.udacity.timezones.dto.Student;

@ExtendWith(MockitoExtension.class)
public class StudentMangementTest {

	private StudentMangement studentMangement;

	@Mock
	private StudentCommon studentCommon;

	@BeforeEach
	public void init() {
		// studentCommon = new StudentCommon();
		studentMangement = new StudentMangement(studentCommon);
	}

	@Test
	void testInit() {

		int size = 10;
		List<Student> studentLst = new ArrayList<Student>();
		Mockito.doReturn(studentLst).when(studentCommon).init(Mockito.anyInt());
		List<Student> students = this.studentMangement.init(size);

		Assertions.assertEquals(size, students.size());
	}
}
