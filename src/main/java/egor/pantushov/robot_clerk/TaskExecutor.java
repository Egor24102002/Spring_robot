package egor.pantushov.robot_clerk;

import org.springframework.stereotype.Component;


public interface TaskExecutor {
    String execute(Task task);
}
