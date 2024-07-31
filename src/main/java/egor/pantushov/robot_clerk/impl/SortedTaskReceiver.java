package egor.pantushov.robot_clerk.impl;

import egor.pantushov.robot_clerk.Task;
import egor.pantushov.robot_clerk.TaskReceiver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Component("sortedTaskReceiver")
public class SortedTaskReceiver implements TaskReceiver {
    private final List<Task> tasks;

    public SortedTaskReceiver() {
        this.tasks = Arrays.asList(
                new Task("Print docs", "Print 10 pages of document"),
                new Task("Calculate expenses", "Calculate monthly expenses"),
                new Task("Email report", "Send weekly report via email"),
                new Task("Meet with team", "Discuss project updates with team")
        );
    }


    public Stream<Task> getTasks() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getText));
    }


}
