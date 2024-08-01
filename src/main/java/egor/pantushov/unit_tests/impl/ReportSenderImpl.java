package egor.pantushov.unit_tests.impl;


import egor.pantushov.unit_tests.ReportSender;
import org.springframework.stereotype.Component;

@Component
public class ReportSenderImpl implements ReportSender {
    //@Benchmark
    @Override
    public void sendReport(String text) {
        System.out.printf("Task result: %s%n", text);
    }
}
