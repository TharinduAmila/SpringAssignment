package org.cse.springtute;

import org.springframework.context.support.*;

public class SmsStarter {

    public static void main(String[] args) {
        StudentManagementSystem sms;

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-content.xml");
        context.start();
        Student stu1=(Student)context.getBean("student1");
        Student stu2=(Student)context.getBean("student2");
        Student stu3=(Student)context.getBean("student3");
        sms= (StudentManagementSystem)context.getBean("sms");
        sms.listAllStudents();
        sms.registerStudent(stu1);
        sms.registerStudent(stu2);
        sms.registerStudent(stu3);
        sms.listAllStudents();
    }
}
