package egor.pantushov.unit_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


 class TaskExeptionExecutorTest {
     private Task task;
     @BeforeEach
     void setTask() {
          task = new Task("dgd", "dgfddg");
     }
@Test
     void executeSuccess() {
        int count = 0;
         String text;
         if (count < 5) {
              text= String.format("Success execute task \"%s\"", task.getText());
         } else {
             text= String.format("Failure execute task.The robot overheated \"%s\"", task.getText());
         }
         Assertions.assertEquals("Success execute task \"dgd\"",text);

     }

     @Test
     void executeFaild() {
         int count = 5;
         String text;
         if (count < 5) {
             text= String.format("Success execute task \"%s\"", task.getText());
         } else {
             text= String.format("Failure execute task \"%s\".The robot overheated", task.getText());
         }
         Assertions.assertEquals("Failure execute task \"dgd\".The robot overheated",text);

     }

 }
