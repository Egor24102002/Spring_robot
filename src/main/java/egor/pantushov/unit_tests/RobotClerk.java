package egor.pantushov.unit_tests;


import egor.pantushov.unit_tests.annotation.InjectRandomInt;
import egor.pantushov.unit_tests.impl.TaskExeptionExecutor;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component

public class RobotClerk {

    private final TaskReceiver taskReceiver;
    private final TaskExecutor taskExecutor;
    private final ReportSender reportSender;

    private String name;

    @InjectRandomInt(min = 1, max = 3)
    private  int repeat = 1;

    public RobotClerk(@Qualifier("sortedTaskReceiver") TaskReceiver taskReceiver, @Qualifier("TaskExeptionExecutor") TaskExecutor taskExecutor, ReportSender reportSender) {
        this.taskReceiver = taskReceiver;
        this.taskExecutor = taskExecutor;
        this.reportSender = reportSender;
    }

    public void doWork() {
        for (int i = 0; i < repeat; i++) {
            taskReceiver.getTasks()
                .map(task -> taskExecutor.execute(task))
                .forEach(result -> reportSender.sendReport(result));
        }
    }

    @PostConstruct
    public void init() {
        this.name = "Jack";
        System.out.println("Hello, my name is " + this.name);
    }
}
