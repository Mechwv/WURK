package com.company;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        int s = 0;
        int p = 0;
        char ch ;
        int code = scan.next().charAt(0);
        while (code  != 'q')
        {
            code = scan.next().charAt(0);
            ch = (char) code ;
            // выйти когда нажато 'q'
            if ( 's' == ch )
            {
                System.out.println("MUD GOLEM STUNNED UR ASS FOR " + (((s * 0.3) * 10) / 10) + " SECONDS");
                s++;
            }
            if ( 'p' == ch)
            {
                System.out.println("MUD GOLEM PUNCHED UR ASS FOR " + (((p * 30) * 10) / 10) + " DAMAGE");
                p++;
            }
        }

        System.out.println("GOLEM CRIES 'HOES MAD' ");
        System.out.println("GOLEM iINFLICTED YOU 9000+ DAMAGE");
        System.out.println("GOLEM CRIES ON RUSSIAN 'МАГМА ТЕЧЕТ В НАШИХ ВЕНАХ, РАСКАЛЯЯ СЕРДЦА! БЕЗГРАНИЧНОЕ СЛИЯНИЕ! ГУРРРРРРЕН ЛАГГАААААААН!!!!!!!! ВЕДЬ Я. ВЕДЬ МЫ. ДА ЗА КОГО ВЫ НАС ДЕРЖИТЕ' ");
    }
}
