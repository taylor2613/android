package com.example.hyoseok.life;

import android.app.Activity;



public class thirdscreen {
    private String mQuestion[]={

            "1. 2백만명 이상의 인구를 가진 도시 지역에 살고 있습니까? ",
            "2. 만명 이하의 읍이나 농지에서 사십니까?",
            "3. 한명의 조부모가 85세까지 사셨습니까?",
            "4. 외가,친가 합쳐서 조부모 4명이 모두 80세까지 사셨습니까?",
            "5. 부모가 50이전에 뇌졸중이나 심장마비로 사망하신적이 있습니까? ",
            "6. 부모나 형제,혹은 누이가 50세 이하에 암이나 심장병이 있거나, 아동기 이후 당뇨병이 있습니까? ",
            "7. 일년에 6000천만원 이상을 법니까?",
            "8. 대학을 졸업했습니까?",
            "9. 대학원 학위나 전문직 자격증이 있습니까?",
            "10. 65세 또는 그 이상이고 아직 일을 하고 있습니까? ",
            "11. 배우자나 친구와 함께 살고 있습니까? ",
            "12. 책상에서 일하십니까? ",
            "13. 일이 정규적이고, 무거운 육체 노동을 요구하십니까?",
            "14. 일주일에 다섯 번을 적어도 30분씩 지속적으로 운동하십니까?",
            "15. 일주일에 두 번 혹은 3 번 운동하십니까?",
            "16. 매일 10시간 이상씩 잡니까?",
            "17. 성격이 감정적이고, 공격적이고 쉽게 화를 냅니까?",
            "18. 편안히 생각하고 쉽니까?",
            "19. 행복합니까? ",
            "20. 작년에 속도 위반 딱지를 땠습니까? ",
            "21. 여성이고 일년에 한번 산부인과 의사를 찾으십니까?",
            "22. 40세 이상이고 매년 건강 체크를 하십니까?",
            "결과를 보시겠습니까?"
    };

    private String mChoice [][] ={
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"YES" , "NO"},
            {"RESULT", "EXIT"}

            //{"두갑이상", "한갑~두갑", "반갑~한갑", "피우지 않음"}   //담배체크
    };

    private int mScore [][] ={
            {-2 , 0},
            {2  , 0},
            {2,0},
            {6,0} ,
            {-4,0} ,
            {-3,0},
            {-2,0},
            {1,0},
            {2,0},
            {3,0} ,
            {5,0} ,
            {-3,3},
            {3,0},
            {4,0},
            {2,0},
            {-4,0},
            {-3,0},
            {-3,0},
            {1,0},
            {-2,0},
            {2,0},
            {2,0},
            {0,0}
    };

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    //네
    public String getChoice0(int a){
        String choice0 = mChoice[a][0];
        return choice0;
    }

    //아니오
    public String getChoice1(int a){
        String choice1 = mChoice[a][1];
        return choice1;
    }

    public int getscore_yes(int a){
        int score1 = mScore[a][0];
        return score1;
    }
    public int getscore_no(int a){
        int score2 = mScore[a][1];
        return score2;
    }

}