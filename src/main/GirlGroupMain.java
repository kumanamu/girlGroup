package main;

import view.ViewProcess;

import java.util.Scanner;

public class GirlGroupMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ViewProcess viewProcess = new ViewProcess();


        while (true) {
            System.out.println("소속사 정보");
            //service 에서 소속사 정보 가져오기
            //view 호출하기
            viewProcess.getEntertaimnet();

            System.out.println("소속 그룹 정보를 보려면 id를 입력하세요, 종료 : 0");
            int num = sc.nextInt();

            if (num == 0) {
                return;

            } else {
                //서비스에서 해당 소속사의 그룹 정보 가져오기
                //뷰를 통해서 기능 호출하기
                viewProcess.findByEnterID(num);

            }


        }
    }
}
