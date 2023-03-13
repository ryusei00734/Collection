package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		List<Task> task = new ArrayList<>();

		LocalDate localDate1 = LocalDate.of(2021, 10, 21);
		LocalDate localDate2 = LocalDate.of(2021, 9, 15);
		LocalDate localDate3 = LocalDate.of(2021, 12, 04);
		LocalDate localDate4 = LocalDate.of(2021, 8, 10);
		LocalDate localDate5 = LocalDate.of(2021, 11, 9);

		Task task1 = new Task(localDate1, "牛乳を買う。");
		Task task2 = new Task(localDate2, "○○社面談。");
		Task task3 = new Task(localDate3, "手帳を買う。");
		Task task4 = new Task(localDate4, "散髪に行く。");
		Task task5 = new Task(localDate5, "スクールの課題を解く。");

		task.add(task1);
		task.add(task2);
		task.add(task3);
		task.add(task4);
		task.add(task5);

		Collections.sort(task);

		for (int number = 0; number < task.size(); number++) {
			System.out.println(task.get(number).getTaskDay() + ":" + task.get(number).getTaskName());
		}

	}
}