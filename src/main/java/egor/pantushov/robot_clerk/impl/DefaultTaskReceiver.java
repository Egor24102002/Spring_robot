package egor.pantushov.robot_clerk.impl;



import egor.pantushov.robot_clerk.Task;
import egor.pantushov.robot_clerk.TaskReceiver;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
@Component("Default")
public class DefaultTaskReceiver implements TaskReceiver {
    @Override
    //@Benchmark
    public Stream<Task> getTasks() {
        return Stream.of(
            new Task("Print docs", "Print 10 pages of document"),
            new Task("Calculate expenses", "Calculate monthly expenses"));
    }
}
