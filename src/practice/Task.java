package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
	private String taskName;
	private LocalDate taskDay;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public LocalDate getTaskDay() {
		return taskDay;
	}

	public void setTaskDay(LocalDate taskDay) {
		this.taskDay = taskDay;
	}

	public Task(LocalDate taskDay, String taskName) {
		this.taskDay = taskDay;
		this.taskName = taskName;
	}

	public int compareTo(Task other) {
		return this.taskDay.compareTo(other.taskDay);
	}
}
