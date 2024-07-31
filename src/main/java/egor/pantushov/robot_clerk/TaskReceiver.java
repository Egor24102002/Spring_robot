package egor.pantushov.robot_clerk;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;


public interface TaskReceiver {
    Stream<Task> getTasks();
}
