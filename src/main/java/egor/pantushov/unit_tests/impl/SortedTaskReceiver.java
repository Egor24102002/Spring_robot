package egor.pantushov.unit_tests.impl;

import egor.pantushov.unit_tests.Task;
import egor.pantushov.unit_tests.TaskReceiver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Component("sortedTaskReceiver")
public class SortedTaskReceiver implements TaskReceiver {

    public Stream<Task> getTasks() {
        return Stream.of(
                new Task("Print docs", "Print 10 pages of document"),
                new Task("Calculate expenses", "Calculate monthly expenses"),
                new Task("Email report", "Send weekly report via email"),
                new Task("Meet with team", "Discuss project updates with team")) .sorted(Comparator.comparing(Task::getText));
    }


}
