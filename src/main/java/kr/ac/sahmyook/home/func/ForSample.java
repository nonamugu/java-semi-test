package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    Scanner sc = new Scanner(System.in);
    public void sum1To10() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10까지 정수들의 합계 : " + sum);
    }
    public void sumEven1To100() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) sum += i;
        }
        System.out.println("1~100사이의 짝수들의 합계 구하기");
    }
    public void oneGugudan() {
        System.out.print("정수 하나를 입력해주세요 : ");
        int a = sc.nextInt();
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(a == i) System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
    public void sumMinToMax() {
        int sum = 0;
        System.out.println("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.println("두번째 정수 : ");
        int b = sc.nextInt();
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("작은 값에서 큰 값까지의 합 : " + sum);
    }
    public void printStar() {
        System.out.print("줄수 : ");
        int width = sc.nextInt();
        System.out.print("칸수 : ");
        int height = sc.nextInt();
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void printNumberStar() {
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                if(i == j) System.out.print(i);
                else System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void printTriangleStar() {

    }
    public void guguDan() {

    }
}
