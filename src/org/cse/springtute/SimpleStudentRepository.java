package org.cse.springtute;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studDB = new HashMap<Long, Student>();

    @Override
    public void saveStudent(Student stu) {
        // TODO Auto-generated method stub
        studDB.put(stu.getRegNumber(), stu);
    }

    @Override
    public void deleteStudent(Student stu) {
        // TODO Auto-generated method stub
        studDB.remove(stu.getRegNumber());
    }

    @Override
    public Student findStudent(long regNumber) {
        // TODO Auto-generated method stub
        return studDB.get(regNumber);
    }

    @Override
    public void updateStudent(Student stu) {
        // TODO Auto-generated method stub
        if (studDB.containsKey(stu.getRegNumber())) {
            studDB.put(stu.getRegNumber(), stu);
        } else {
            studDB.put(stu.getRegNumber(), stu);
        }

    }

    @Override
    public List<Student> findAllStudents() {
        // TODO Auto-generated method stub
        List<Student> tmp=new LinkedList<Student>();
        for(long i:studDB.keySet()){
            tmp.add(studDB.get(i));
        }
        return tmp;
    }
}
