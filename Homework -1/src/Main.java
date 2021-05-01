public class Main {

    public static void main(String[] args) {

                Course course1 = new Course(1, "C# + ANGULAR","Engin Demiroð");
                Course course2 = new Course(2, "JAVA + REACT","Engin Demiroð");
                Course course3 = new Course(3, "Programlamaya Giriş için Temel Kurs","Engin Demirog");
                Course[] coursies = {course1, course2, course3};

                for (Course course : coursies) {
                    System.out.println("Kurs Adı: "+ course.CourseName+ " Kurs Eğitmeni:"+ course.CourseTeacher);
                }
                System.out.println("****************************");
                Category category1 = new Category(1,"2 Mohnts","Free");
                Category category2 = new Category(2,"2 Mohnts","Free");
                Category[] categories = {category1, category2};
                for (Category category : categories) {
                    System.out.println("Course Time :" +category.detail + " Course Price : "+ category.coursePrice);
                }

              System.out.println("****************************");

              // İş( Yönetici veya yönelndirici ) Sınıfı - Manager (  work ) Class
                CourseManager courses = new CourseManager();
                courses.Add(course1);
                courses.Add(course2);
                courses.Add(course3);

                System.out.println("****************************");

                courses.Delete(course1);
                courses.Delete(course2);
                courses.Delete(course3);

               System.out.println("****************************");

               courses.watchNow(course1);
               courses.watchNow(course2);
               courses.watchNow(course3);

    }
}
