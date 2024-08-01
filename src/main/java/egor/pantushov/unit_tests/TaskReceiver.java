package egor.pantushov.unit_tests;

import java.util.stream.Stream;


public interface TaskReceiver {
    Stream<Task> getTasks();
}
