package egor.pantushov.robot_clerk;

import org.springframework.stereotype.Component;


public interface ReportSender {
    void sendReport(String text);
}
