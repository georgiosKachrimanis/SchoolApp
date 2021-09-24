package com.georgioskachrimanis;


public class SearchMethods {
    private static Admin findAdmin(int loginID) {
        for (Admin checkedAdmin: Main.adminList ) {
            if (checkedAdmin.getLoginID() == loginID){
                return checkedAdmin;
            }
        }
        return null;
    }

    private static Student findStudent(int loginID) {
        for (Student checkedStudent: Main.studentList ) {
            if (checkedStudent.getLoginID() == loginID){
                return checkedStudent;
            }
        }
        return null;
    }

}
