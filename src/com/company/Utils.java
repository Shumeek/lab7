package com.company;

public class Utils {
    public static String getTheBestSubject(Student[] students){
        float avgMarks[] = {0,0,0,0,0};
        float maxAvg;
        subject bestS = subject.Java;

        for(int i=0 ; i < students.length; i++){
            for(int j=0 ; j < students[i].getSubjects().length; j++){
                avgMarks[j]+= students[i].getSubjects()[j].getMark()/students.length;
            }
        }

        maxAvg = avgMarks[0];
        for(int i=1; i<avgMarks.length; i++){
            if(avgMarks[i] > maxAvg){
                maxAvg = avgMarks[i];
                switch (i) {

                    case 1: bestS=subject.BD;
                        break;
                    case 2: bestS=subject.TSPP;
                        break;
                    case 3: bestS=subject.WebSecurity;
                        break;
                    case 4: bestS=subject.Linux;
                        break;
                }
            }
        }

        return bestS.toString();
    }
    public static String getTheBestStudent(Student[] students){
        float bestAvgMark = 0,
                avgM;
        String bestStudent = students[0].getName() + ' ' + students[0].getSurname();

        for(int j=0 ; j < students[0].getSubjects().length; j++){
            bestAvgMark+= students[0].getSubjects()[j].getMark()/students[0].getSubjects().length;
        }

        for(int i=1 ; i < students.length; i++){
            avgM=0;
            for(int j=0 ; j < students[i].getSubjects().length; j++){
                avgM+= students[i].getSubjects()[j].getMark()/students[i].getSubjects().length;
            }
            if(avgM > bestAvgMark){
                bestAvgMark = avgM;
                bestStudent = students[i].getName() + ' ' + students[i].getSurname();
            }
        }

        return bestStudent;
    }
}
