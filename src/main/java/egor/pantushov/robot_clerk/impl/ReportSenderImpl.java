package egor.pantushov.robot_clerk.impl;


import egor.pantushov.robot_clerk.ReportSender;
import org.springframework.stereotype.Component;

@Component
public class ReportSenderImpl implements ReportSender {
    //@Benchmark
    @Override
    public void sendReport(String text) {
        System.out.printf("Task result: %s%n", text);
    }
}
