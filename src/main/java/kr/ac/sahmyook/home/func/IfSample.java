package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);
    public void maxNumber() {
        System.out.print("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int b = sc.nextInt();
        System.out.println((a > b) ? a : b);
    }
    public void minNumber() {
        System.out.print("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int b = sc.nextInt();
        System.out.println((a > b) ? b : a);
    }
    public void threeMaxMin() {
        System.out.print("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int b = sc.nextInt();
        System.out.print("세번째 정수 : ");
        int c = sc.nextInt();
        int max, min;
        max = (a > b) ? a : b;
        max = (c > max) ? c : max;
        min = (a < b) ? a : b;
        min = (c < min) ? c : min;
        System.out.println("가장 큰수 : " + max + "\n가장 작은수 : " + min);
    }
    public void checkEven() {
        int a = sc.nextInt();
        System.out.println((a % 2 == 0) ? "짝수" : "홀수");
    }
    public void isPassFail() {
        System.out.print("국어 점수 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수 : ");
        int math = sc.nextInt();
        int total = kor + eng + math;
        int avg = total / 3;
        System.out.println((avg > 60) ? "합격입니다." : "불합격입니다.");
    }
    public void scoreGrade() {
        System.out.println("과목 점수 확인 : ");
        float score = sc.nextFloat();
        if(score == 4.5) System.out.println("A+");
        else if(score == 4f) System.out.println("A");
        else if(score == 3.5) System.out.println("B+");
        else if(score == 3f) System.out.println("B");
        else if(score == 2.5) System.out.println("C+");
        else if(score == 2f) System.out.println("C");
        else if(score < 2f) System.out.println("F");



    }
    public void checkPlusMinusZero() {
        int a = sc.nextInt();
        if(a > 0) System.out.println("양수입니다.");
        else if(a < 0) System.out.println("음수입니다.");
        else if(a == 0) System.out.println("0입니다.");
    }
    public void whatCaracter() {
        char x = sc.next().charAt(0);
        if(x >= 48 && x <= 57) System.out.println("숫자문자입니다.");
        else if(x >= 65 && x <= 90) System.out.println("엉어대문자입니다.");
        else if(x >= 97 && x <= 122) System.out.println("엉어소문자입니다.");
        else System.out.println("기타문자입니다.");
    }

}
