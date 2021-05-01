public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setFirstName("Tarik kaan");
        student.setLastName("koç");
        student.setAge(19);
        student.setId(11);
        // ***  GET = OKU --- SET = YAZ.  -- (( get = getir ))
        student.setUserName("koc7");
        student.setEmail("Tarikaan1koc@gmail.com");
        student.setEpsiode("Software Eng");

        Instructor egitmen = new Instructor();

        egitmen.setFirstName("engin");
        egitmen.setLastName("Demirog");
        egitmen.setEmail("deneme@gmail.com");
        egitmen.setBranch("programmer");
        egitmen.setUserName("engin7");
        egitmen.setTeacherPass("4129774Eng");
        egitmen.setId(10);

        System.out.println("*************");

        UserManager usermanager = new UserManager();
        usermanager.add(student);

        System.out.println("*************");

        InstructorManager InstructorManager = new InstructorManager();
        InstructorManager.addTeacher(egitmen);

        System.out.println("*************");

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);

    }
}
