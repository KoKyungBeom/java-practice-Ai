package com.codestates.seb.Ai.V3;

import java.util.Scanner;

public class Ai {
  public static void main(String[] args) {
    //TODO:
    /*
     * 프로그램에 필요한 변수 선언
     * xy_lists       : 데이터를 담을 2차원 배열
     * diff           : 편차
     * diff_pow       : 편차의 제곱(double)
     * diff_pow_float : 편차의 제곱(float)
     * sum_diff_pow   : 편차 제곱의 합
     * */
    // 프로그램 안내 문구 출력
    // 1단계 2차원 배열 데이터 생성
    // 데이터 출력 안내 문구 생성
    // 2단계, 3단계
    // 배열 속 값을 호출하며 편차 -> 제곱 -> 합산 과정을 수행합니다.
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    double[] adCostArray = new double[4];
    double[] aiPredictionArray = new double[4];
    double[] actualValueArray = new double[4];
    double[] diff = new double[4];
    double[] diff_pow = new double[4];
    double sum_diff_pow = 0;

    System.out.println("[인공지능 프로그램 V3]\n" +
            "==============================");
    System.out.println("a의 값을 입력해주세요");
    a = Integer.parseInt(sc.nextLine());
    System.out.println("b의 값을 입력해주세요");
    b = Integer.parseInt(sc.nextLine());
    System.out.println("==============================\n");
    System.out.println("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원)");

    for (int i = 0; i < adCostArray.length; i++) {
      adCostArray[i] = Integer.parseInt(sc.nextLine());
      System.out.println("광고비가 추가 되었습니다.");
    }

    System.out.printf("[안내] 입력된 '광고비'는 다음과 같습니다.\n" +
            "1 번째) %.1f원\t2 번째) %.1f원\t3 번째) %.1f원\t4 번째) %.1f원\n",adCostArray[0],adCostArray[1],adCostArray[2],adCostArray[3]);

    for(int i = 0; i < aiPredictionArray.length; i++){
      aiPredictionArray[i] = adCostArray[i] * a + b;
    }

    System.out.printf("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.\n" +
            "1 번째 예측) %.1f회 방문\n" +
            "2 번째 예측) %.1f회 방문\n" +
            "3 번째 예측) %.1f회 방문\n" +
            "4 번째 예측) %.1f회 방문\n",aiPredictionArray[0],aiPredictionArray[1],aiPredictionArray[2],aiPredictionArray[3]);

    System.out.println("실제 웹페이지 방문자 수를 입력해 주세요");

    for (int i = 0; i < adCostArray.length; i++) {
      actualValueArray[i] = Integer.parseInt(sc.nextLine());
      System.out.println("방문자 수가 추가 되었습니다.");
    }

    System.out.printf("[안내] 인공지능 프로그램에 할당된 데이터\n" +
            "1번 째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f\t[인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n" +
            "2번 째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f\t[인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n" +
            "3번 째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f\t[인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n" +
            "4번 째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f\t[인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n" +
            "==============================\n",actualValueArray[0],aiPredictionArray[0],actualValueArray[1],aiPredictionArray[1],actualValueArray[2],aiPredictionArray[2],actualValueArray[3],aiPredictionArray[3]);

    for(int i = 0; i < diff.length; i++){
      diff[i] = actualValueArray[i] - aiPredictionArray[i];
    }

    for(int i = 0; i < diff_pow.length; i++){
      diff_pow[i] = Math.pow(diff[i],2);
      sum_diff_pow += diff_pow[i];
    }

    System.out.printf("[1 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n" +
            "[안내] 오차의 제곱 : %.1f\n" +
            "\n" +
            "[2 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n" +
            "[안내] 오차의 제곱 : %.1f\n" +
            "\n" +
            "[3 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n" +
            "[안내] 오차의 제곱 : %.1f\n" +
            "\n" +
            "[4 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n" +
            "[안내] 오차의 제곱 : %.1f\n" +
            "==============================\n",diff[0],diff_pow[0],diff[1],diff_pow[1],diff[2],diff_pow[2],diff[3],diff_pow[3]);
    System.out.printf("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) %.1f:",sum_diff_pow);
  }
}

