public class Main {
    public static void main(String[] args) {

        //creating class instances
        student std1=new student("John",21,21.1,"Software Engineering");
        student std2=new student("James",22,20.2,"Software Engineering");
        student std3=new student("Alex",20,20.1,"Computer Networks");
        student std4=new student("Sam",21,21.1,"Computer Security");

        //displaying the data of instance 1
        System.out.println(std1.StdName);
        System.out.println(std1.StdAge);
        System.out.println(std1.StdBatch);
        System.out.println(std1.StdDegree+"\n");

        //displaying the data of instance 2
        System.out.println(std2.StdName);
        System.out.println(std2.StdAge);
        System.out.println(std2.StdBatch);
        System.out.println(std2.StdDegree+"\n");

        //displaying the data of instance 3
        System.out.println(std3.StdName);
        System.out.println(std3.StdAge);
        System.out.println(std3.StdBatch);
        System.out.println(std3.StdDegree+"\n");

        //displaying the data of instance 4
        System.out.println(std4.StdName);
        System.out.println(std4.StdAge);
        System.out.println(std4.StdBatch);
        System.out.println(std4.StdDegree);
    }
}