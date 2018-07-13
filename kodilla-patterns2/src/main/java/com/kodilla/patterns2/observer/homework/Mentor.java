package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        long number = student.getTasks().size();
        System.out.println(mentorName + ": You have new" + getMessage(number) + " from student: " +
                student.getStudentName() + " to check" + "\n" +
                "(total: " + number + getMessage(number) + ")");
        updateCount++;
    }

    private String getMessage(long number) {
        if (number == 1) {
            return " task";
        } else {
            return " tasks";
        }
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
