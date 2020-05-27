package com.company;

public class Student {
    private int id;
    private static int nextId = 0;
    private String name;
    private String surname;
    private String group;

    public class Subject {
        private subject nameSubject;
        private float mark;
        private boolean passed;

        {
            this.mark = (float)Math.random()*5f;
            this.passed = mark > 2 ? true : false;
        }

        public Subject(subject nameSubject) {
            this.nameSubject = nameSubject;
        }

        public float getMark() {
            return mark;
        }

        public boolean isPassed() {
            return passed;
        }

        public String getNameSubject() {
            return nameSubject.toString();
        }
    }

    private Subject[] subjects;

    public Student(){

    }

    public Student(String name, String surname, String group) {
        nextId++;
        this.id = nextId;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.subjects = new Subject[5];
        for(int i=0;i<this.subjects.length;i++){
            switch (i) {
                case 0: this.subjects[0] = new Subject(subject.Java);
                    break;
                case 1: this.subjects[1] = new Subject(subject.BD);
                    break;
                case 2: this.subjects[2] = new Subject(subject.TSPP);
                    break;
                case 3: this.subjects[3] = new Subject(subject.WebSecurity);
                    break;
                case 4: this.subjects[4] = new Subject(subject.Linux);
                    break;
            }
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = new Subject[5];
        this.subjects = subjects;
    }

    public float avgMark(){
        float avgMark = 0;
        for(int i=0;i<subjects.length;i++){
            avgMark += this.subjects[i].getMark()/subjects.length;
        }
        return  avgMark;
    }

    public void passedSub(){
        for(int i=0;i<subjects.length;i++){
            System.out.println("Сдал ли это студент предмет "+this.subjects[i].getNameSubject() + "?: " + this.subjects[i].isPassed());
            System.out.println("И его оценка равна: "+this.subjects[i].getMark());
        }
    }

}
