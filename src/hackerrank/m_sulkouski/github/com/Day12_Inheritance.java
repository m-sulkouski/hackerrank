


package hackerrank.m_sulkouski.github.com;

import java.util.Scanner;

public class Day12_Inheritance {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        String firstName = input.nextLine();
//        String lastName = input.nextLine();
//        int id = Integer.parseInt(input.nextLine());
//        int numScores = Integer.parseInt(input.nextLine());
//        int[] testScores = new int[numScores];
//        for(int i = 0; i < numScores; i++){
//            testScores[i] = Integer.parseInt(input.nextLine());
//        }
        Student s = new Student("Maxim", "Soolkovskiy", 13, new int[]{100,100,100});
        s.printPerson();
        System.out.println("Grade: " + s.getGrade());

//        input.close();
    }
}

class Student extends Person {
    private int[] scores;
    private char grade;

    public Student(String firstName, String lastName, int id, int[]scores) {
        super(firstName, lastName, id);
        this.scores = scores;
        calculateGrade();
    }

    private void calculateGrade() {
        int averageGrade;
        int sum = 0;
        for (int i : scores) {
            sum+= i;
        }
        averageGrade = sum/scores.length;
        if (averageGrade < 40) {
            grade = 'T';
        }
        else if(averageGrade < 55) {
            grade = 'D';
        }
        else if(averageGrade < 70) {
            grade = 'P';
        }
        else if(averageGrade < 80) {
            grade = 'A';
        }
        else if(averageGrade < 90) {
            grade = 'E';
        }

        else if (averageGrade <= 100) {
            grade = 'O';
        }
        else {
            grade = 'Z';
        }
    }

    public char getGrade() {
        return grade;
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void printPerson() {
        System.out.printf("Name: %s, %s\n", this.getFirstName(), this.getLastName());
        System.out.printf("ID: %d\n", this.getId());
    }
}
