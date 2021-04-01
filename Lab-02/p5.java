import java.util.Scanner;

class student {
    int roll_no;
    String name;
    int marks[] = new int[5];

    student() {

    }

    student(int roll_no, String name, int marks[]) {
        this.roll_no = roll_no;
        this.name = name;
        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }

    }

    double findAverage(int marks[]) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return (sum / marks.length);
    }

    void findAverage(student s[]) {
        student t = new student();
        double avg;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < 5; i++) {
            sum1 += s[0].marks[i];
            sum2 += s[1].marks[i];
            sum3 += s[2].marks[i];
        }
        if ((sum1 / 5) > (sum2 / 5)) {

            if ((sum1 / 5) > (sum3 / 5)) {
                avg = (sum1 / 5);
                System.out.println("Name : "+s[0].name);
                System.out.println("Roll No. : "+s[0].roll_no);
                System.out.println("Average : "+avg);

            } else {
                if ((sum2 / 5) > (sum3 / 5)) {
                    avg = (sum2 / 5);

                    System.out.println("Name : "+s[1].name);
                    System.out.println("Roll no. "+s[1].roll_no);
                    System.out.println("Average : "+avg);
                }
            }
        } else {
            if ((sum2 / 5) > (sum3 / 5)) {
                avg = (sum2 / 5);

                System.out.println("Name : " + s[1].name);
                System.out.println("Roll no. " + s[1].roll_no);
                System.out.println("Average" + avg);
            } else {
                avg = (sum3 / 5);

                System.out.println("Name : " + s[2].name);
                System.out.println("Roll no. : " + s[2].roll_no);
                System.out.println("Average : " + avg);
            }
        }

    }
}

class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll_no;
        String name;
        int marks[] = new int[5];
        System.out.println("-----------(A)--------------");
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Roll No. : ");
        roll_no = sc.nextInt();
        System.out.println("Enter Marks of 5 Subjects : ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        student s1 = new student(roll_no, name, marks);
        System.out.println("Roll No. : " + s1.roll_no);
        System.out.println("Name : " + s1.name);
        System.err.println("Average : " + s1.findAverage(marks));


        System.out.println("-----------(B)--------------");
        student s[] = new student[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Name for student " + (i + 1) + " : ");
            name = sc.next();
            System.out.print("Enter Roll No. for student " + (i + 1) + " : ");
            roll_no = sc.nextInt();
            System.out.print("Enter Marks for student " + (i + 1) + " : ");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }
            s[i] = new student(roll_no, name, marks);
        }
        student demo = new student();
        System.out.println("----------O/P----------");
        demo.findAverage(s);

    }
}
