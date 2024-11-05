package com.udacity.timezones.service;

import java.util.List;

import com.udacity.timezones.common.StudentCommon;
import com.udacity.timezones.dto.Student;

public class StudentMangement {

	private StudentCommon studentCommon;

	public StudentMangement(StudentCommon studentCommon) {
		this.studentCommon = studentCommon;
	}

	public List<Student> init(int size) {
		System.out.println("Size " + size);
		return studentCommon.init(size);
	}
}
