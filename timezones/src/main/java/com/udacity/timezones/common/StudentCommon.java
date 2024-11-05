package com.udacity.timezones.common;

import java.util.ArrayList;
import java.util.List;

import com.udacity.timezones.dto.Student;

public class StudentCommon {

	public StudentCommon() {

	}

	public List<Student> init(int size) {

		List<Student> studentLst = new ArrayList<Student>();
		for (int i = 0; i < size; i++) {
			Student student = new Student();
			student.setCode("ST" + i);
			student.setName("Student " + i);
			student.setAge(i);
			studentLst.add(student);
		}
		return studentLst;
	}

}
