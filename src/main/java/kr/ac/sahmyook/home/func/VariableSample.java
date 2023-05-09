package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile() {
        String name = "김재현";
        int age = 24;
        String phone = "010-8512-3948";
        System.out.println("이름 : " + name +
                "\n나이 : " + age +
                "\n전화번호 : " + phone);
    }
    public void empInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사원의 이름 : ");
        String name = sc.nextLine();
        System.out.print("사원의 나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("사원의 부서 : ");
        String job = sc.nextLine();
        System.out.println("이름 : " + name +
                "\n나이 : " + age +
                "\n부서 : " + job);
    }
}
