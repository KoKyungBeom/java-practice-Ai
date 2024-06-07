package com.codestates.seb.Ai.V1;

import java.util.Scanner;

public class Ai {
  public static void main(String[] args) {
    //TODO:
    // 사용자의 입력을 받기 위한 Scanner 객체를 생성합니다.
    // 시스템 프로그램 안내 출력문을 정의합니다.
    // 수식에 필요한 변수를 먼저 정의하여 줍니다. (※ 수식과 똑같은 변수명으로 정의 )
    // 안내 사항에 나온 것 처럼 임의의 값으로 정의합니다.
    // 웹 페이지 방문자 수를 예측하기 위한 수식을 코드로 정의합니다.
    // 결과로 나온 값은 printf()를 통해 출력합니다.
    Scanner sc = new Scanner(System.in);
    int adCost = 1;
    int unpredictableValue = 1;
    int result;

    System.out.println("[인공지능 프로그램 V1]\n" +
            "==============================\n" +
            "[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원)");
    adCost = Integer.parseInt(sc.nextLine());
    result = adCost * 2 + unpredictableValue ;
    System.out.printf("[안내] 입력된 광고비는 %d 입니다.\n",adCost);
    System.out.printf("[안내] AI의 예측(클릭 수)은 %d회 입니다.",result);
  }
}

