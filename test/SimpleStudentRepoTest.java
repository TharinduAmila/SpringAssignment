/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import org.cse.springtute.SimpleStudentRepository;
import org.cse.springtute.Student;
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
public class SimpleStudentRepoTest {
    private static Student s;
    private static SimpleStudentRepository testrepo;
    /**
     * 
     */
    public SimpleStudentRepoTest() {
    }

    /**
     * 
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
        s = new Student();
        s.setFirstName("Tharindu");
        s.setLastName("Perera");
        s.setAddress("Bandarawela, Badulla");
        s.setRegNumber(1);
        testrepo = new SimpleStudentRepository();
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

    /** Test of saveStudent method */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        Student stu = s;
        testrepo.saveStudent(stu);
        Student a = testrepo.findStudent(s.getRegNumber());
        System.out.println(s.getFirstName()+s.getLastName()+s.getRegNumber()+s.getAddress());
    }

    /** Test of deleteStudent method*/
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student stu = s;
        testrepo.deleteStudent(stu);
        Assert.assertEquals("Null excepted", null, testrepo.findStudent(s.getRegNumber()));
    }

    /**Test of findStudent method*/
    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        Student stu = s;
        testrepo.saveStudent(stu);
        long regNumber = s.getRegNumber();
        Student expResult = s;
        Student result = testrepo.findStudent(regNumber);
        assertEquals(expResult, result);
    }

    /** Test of updateStudent method*/
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        s.setAddress("address1");
        Student stu = s;
        testrepo.updateStudent(stu);
        Assert.assertEquals("address1", testrepo.findStudent(s.getRegNumber()).getAddress());
    }

    /**Test of findAllStudents method*/
    @Test
    public void testFindAllStudents() {
        System.out.println("findAllStudents");
        List result = testrepo.findAllStudents();
        Iterator it = result.iterator();
        while(it.hasNext()){
            Student b = (Student)it.next();
            System.out.println(b.getFirstName()+b.getLastName()+b.getRegNumber()+b.getAddress());
        }
    }

}