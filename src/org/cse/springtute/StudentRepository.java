package org.cse.springtute;

import java.util.List;

/**
 * 
 * @author Tharindu Amila
 */
public interface StudentRepository {

    /**
     * 
     * @param stu
     */
    void saveStudent(Student stu);

        /**
         * 
         * @param stu
         */
        void deleteStudent(Student stu);

        /**
         * 
         * @param regNumber
         * @return
         */
        Student findStudent(long regNumber);

        /**
         * 
         * @param stu
         */
        void updateStudent(Student stu);

        /**
         * 
         * @return
         */
        List<Student> findAllStudents();
}
