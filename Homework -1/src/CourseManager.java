public class CourseManager {

        public void Add(Course course) {
            System.out.println(course.CourseName+" Kursu Daha Sonra İzlenecekler listesine eklendi.");
        }
        public void Delete(Course course) {
            System.out.println(course.CourseName+" Kursu Daha Sonra İzlenecekler listesinden silindi.");
        }
    public void watchNow(Course course) {
        System.out.println(course.CourseName+" Şimdi Seyret.");
    }
}
