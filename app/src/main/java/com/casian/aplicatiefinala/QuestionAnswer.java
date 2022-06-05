package com.casian.aplicatiefinala;

public class QuestionAnswer {

    public static String question[] ={
            "Rezultatul calculului a = sin 135 + tg 45 + cos 45?",
            "Tg(a+b) în formă rescrisă este?",
            "Fie punctele A, B, C coliniare. Stiind ca raportul dintre vectorul BC și vectorul AC este  egal cu 3. C ... ?",
            "Știind că triunghiul ABC este isoscel cu AB = AC, dacă A(3,M), B(-1,1), C(2,2), M este egal cu? ",
            "Ținând cont că π/5 este în cadranul I. Valoarea calculată pentru cos π/5 și sin π/5 este: ?",
            "Se consideră mulțimea A = { radical din 6, -2, -1/3, 1/2, 2, 3}. Numărul elementelor din mulțimea A intersectat cu multimea Q este: ?"
    };

    public static String choices[][] = {
            {"1","0","radical din 2","4/3"},
            {"(1- tg a * tg b)/(tg a + tg b)","(tg a + tg b)/(a+b)","(tg a + tg b)/(1- tg a * tg b)","(tg a - tg b)/(1+ tg a * tg b)"},
            {"C este paralel cu A","C se află între B și A","C este permendicular pe AB","C este jumătate din BA"},
            {"-3","-6","2","5/2"},
            {"(1+radical din 5)/4","(1-radical din 5)/4","(1-radical din 4)/5","1"},
            {"7","2","6","5"}
    };

    public static String correctAnswers[] = {
            "1",
            "(tg a + tg b)/(1- tg a * tg b)",
            "C se află între B și A",
            "-6",
            "(1+radical din 5)/4",
            "5"
    };
    public static String question1[] ={
            "Fie numerele A = (1+radical din 3)/(1-radical din 3), B = 2/(1-radical din 2), C = -2. Ordonarea crescatoare a numerelor este: ?",
            "Având mulțimea Z, rezultatul ecuației 2x**2 + 5x - 3 = 0 este: ?",
            "Fie progresia aritmetică cu a3 = 5 și a8 = 10, a1 este egal: ?",
            "Având progresia aritmetică cu termenii 2x**2+2x+3, 4x**2+2x-1, 6x**2-1. X este: ?",
            "Fie funcția f: [-1,3] cu valori în R, f(x) = 2x-5, mulțimea valorilor A ale lui f este: ?"
    };

    public static String choices1[][] = {
            {"B<A<C","B<C<A","A<B<C","A<C<B"},
            {"-2","-1","-3","2"},
            {"2","3","1","0"},
            {"2","7","4","5"},
            {"[-7,-1]","(-9,-3]","[-1,1]","[0,4)"}
    };

    public static String correctAnswers1[] = {
            "B<A<C",
            "-3",
            "3",
            "2",
            "[-7,-1]"
    };

}
