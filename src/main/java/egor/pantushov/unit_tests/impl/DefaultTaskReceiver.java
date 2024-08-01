package egor.pantushov.unit_tests.impl;



import egor.pantushov.unit_tests.Task;
import egor.pantushov.unit_tests.TaskReceiver;
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
