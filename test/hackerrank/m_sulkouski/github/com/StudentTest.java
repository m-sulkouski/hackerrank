package hackerrank.m_sulkouski.github.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getGradeTTest() {
        Student student = new Student("Maxim","Soolkovskiy",13,new int[]{100,0,100});
        assertEquals('O',student.getGrade());
    }
}