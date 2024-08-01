package egor.pantushov.unit_tests.impl;


import egor.pantushov.unit_tests.Task;
import egor.pantushov.unit_tests.TaskExecutor;
import org.springframework.stereotype.Component;

@Component("TaskExecutorImpl")
public class TaskExecutorImpl implements TaskExecutor {
    @Override
    public String execute(Task task) {
        System.out.printf("Get task: %s, details: %s%n", task.getText(), task.getComment());

        return String.format("Success execute task \"%s\"", task.getText());
    }
}
