package com.company;

public class Main {

    public static void main(String[] args) {

        Student students[] = new Student[5];
        students[0] = new Student("Yehor", "Shum", "Kb-71");
        students[1] = new Student("Max", "Basov", "Kb-71");
        students[2] = new Student("Svyat", "Lotsko", "Kb-71");
        students[3] = new Student("Oleh", "Tsubin", "Kb-71");
        students[4] = new Student("Tema", "Menyak", "Kb-71");



        P.rintln("Лучший студент " + Utils.getTheBestStudent(students));
        P.rintln("Лучший предмет " + Utils.getTheBestSubject(students));

        for(int i=0;i < students.length;i++){
            P.rintln("Студент " + students[i].getSurname() + " имеет среднюю по всем предметам оценку: " + students[i].avgMark());
            if(students[i].avgMark() == 5f)
                P.rintln("У тебя есть повышенная степендия");
            else if(students[i].avgMark() >= 3f)
                P.rintln("Степения есть но можно и лучше");
            else if(students[i].avgMark() < 3f )
                P.rintln("Ты без степендии дружище");
        }

        for(int i = 0 ; i< students.length;i++){
            P.rintln(students[i].getName() + ' ' + students[i].getSurname() + ':');
            students[i].passedSub();
        }
    }
}
