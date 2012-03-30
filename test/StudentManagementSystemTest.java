/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.cse.springtute.Student;
import org.cse.springtute.StudentManagementSystem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author  Tharindu Amila
 */
public class StudentManagementSystemTest {
    private static StudentManagementSystem sms;
    private static Student stu1;
    private static Student stu2;
    private static Student stu3;
    /**
     * 
     */
    public StudentManagementSystemTest() {
    }

    /**
     * 
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
        sms=new StudentManagementSystem();
        stu1=new Student(1, "Amila", "Perera", "address1");
        stu2=new Student(2, "Tharindu", "Perera", "address2");
        stu3=new Student(3, "Prasad", "Perera", "address3");
    }

    /**
     * 
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * 
     */
    @Before
    public void setUp() {
    }

    /**
     * 
     */
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    /**
     * 
     */
    @Test
    public void testAddNewStudent(){
        sms.registerStudent(stu1);
        sms.registerStudent(stu2);
        sms.registerStudent(stu3);
        sms.listAllStudents();
    }

}