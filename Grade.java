import java.util.Scanner;

class Grade {
  
  public static void main(String[] args) {
    
    int sum = 0;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total number of subjects:");
    int n = sc.nextInt();
   
    int a[] = new int[n];
    
    System.out.println("Enter marks of student in each subject:");
    for(int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    
    for(int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    System.out.println("Total marks: " + sum);
    int totalMarks = sum;
    
    float avgPercent = ((float) totalMarks / n);
    
    System.out.println("Average percentage of marks obtained is: " + avgPercent+"%");
    
   
    String grade = gradeCalculator(avgPercent);
    System.out.println("Grade obtained by the student: " + grade);
  }
  
  public static String gradeCalculator(float avgPercent) {
    String grade;
    if (avgPercent >= 90 && avgPercent < 100) {
      grade = "O";
    } else if (avgPercent >= 80 && avgPercent < 90) {
      grade = "A +";
    } else if (avgPercent >= 70 && avgPercent < 80) {
      grade = "A";
    } else if (avgPercent >= 60 && avgPercent < 70) {
      grade = "B";
    } else if (avgPercent >= 50 && avgPercent < 60) {
      grade = "C";
    } else {
      System.out.println("You have failed in the semester");
      grade = "F";
    }
    return grade;
  }
}