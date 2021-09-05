package com.ultramain.um21.javaacitivity;

import java.util.HashMap;
import java.util.Map;

public class StudentsMedal {
	HashMap<Integer, String> h1 = new HashMap<>();

	public static void main(String[] args) {
		HashMap<Integer, Integer> hash = new HashMap<>();
		hash.put(101, 95);
		hash.put(102, 85);
		hash.put(103, 75);

		StudentsMedal st = new StudentsMedal();
		HashMap<Integer, String> stu = st.getStudents(hash);
		System.out.println(stu);

	}

	public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> stud) {

		for (Map.Entry<Integer, Integer> hash1 : stud.entrySet()) {

			int val = hash1.getValue();
			int key = hash1.getKey();

			if (val > 90) {
				h1.put(key, "Gold");
			}
			if (val >= 80 && val < 90) {
				h1.put(key, "Silver");
			}
			if (val >= 70 && val < 80) {
				h1.put(key, "Bronze");
			}
		}
		return h1;

	}

}