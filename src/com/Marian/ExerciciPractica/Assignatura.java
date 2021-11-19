package com.Marian.ExerciciPractica;

import java.util.ArrayList;

public class Assignatura {

  private String name;
  private ArrayList<Alumne> students = new ArrayList<Alumne>();

  public Assignatura(String name, ArrayList<Alumne> students){

      this.name = name;
      this.students = students;
  }
  public Assignatura(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Alumne> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Alumne> students) {
        this.students = students;
    }

    public void newStudent(Alumne student){

      students.add(student);
    }

    public void unsucribeStudent(Alumne student){

      students.remove(student);
    }
    public Alumne bestStudent(){

        Alumne alumne = new Alumne();
        double bestMedian = 0;

        for (int i = 0; i < students.size(); i++) {

            if(students.get(i).medianNote() > bestMedian){

                bestMedian = students.get(i).medianNote();
                alumne = students.get(i);
            }
        }
        return alumne;
    }
}
