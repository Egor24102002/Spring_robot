package egor.pantushov.robot_clerk.impl;


import egor.pantushov.robot_clerk.Task;
import egor.pantushov.robot_clerk.TaskExecutor;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutorImpl implements TaskExecutor {
    @Override
    public String execute(Task task) {
        System.out.printf("Get task: %s, details: %s%n", task.getText(), task.getComment());

        return String.format("Success execute task \"%s\"", task.getText());
    }
}
