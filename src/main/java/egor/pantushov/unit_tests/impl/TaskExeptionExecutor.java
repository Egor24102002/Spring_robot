package egor.pantushov.unit_tests.impl;

import egor.pantushov.unit_tests.Task;
import egor.pantushov.unit_tests.TaskExecutor;
import org.springframework.stereotype.Component;

@Component("TaskExeptionExecutor")
public class TaskExeptionExecutor implements TaskExecutor
{
    private int count=0;
    @Override
        public String execute(Task task) {
        System.out.printf("Get task: %s, details: %s%n", task.getText(), task.getComment());
        if (count<5) {
            count++;
            return String.format("Success execute task \"%s\"", task.getText());
        }else
        count=0;
            return String.format("Failure execute task \"%s\".The robot overheated ", task.getText());
        }
}
