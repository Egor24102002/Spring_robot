package egor.pantushov.robot_clerk;


import egor.pantushov.robot_clerk.annotation.InjectRandomInt;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component

public class RobotClerk {
    @Qualifier("sortedTaskReceiver")
    private final TaskReceiver taskReceiver;
    private final TaskExecutor taskExecutor;
    private final ReportSender reportSender;

    private String name;

    @InjectRandomInt(min = 1, max = 3)
    private  int repeat = 1;

    public RobotClerk(@Qualifier("sortedTaskReceiver") TaskReceiver taskReceiver, TaskExecutor taskExecutor, ReportSender reportSender) {
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
