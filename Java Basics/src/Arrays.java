public class Arrays {
    public static void main(String[] args){

        String[] student = new String[4];

        student[0]="Tarik";
        student[1]="Abdulhakim";
        student[2]="Kaan";
        student[3]="Ahmet";

        for(String students: student){
             System.out.println(students);
        }
    }
}
