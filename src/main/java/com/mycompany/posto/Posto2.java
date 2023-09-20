package com.mycompany.posto;

public class Posto2 {
    public double alcool, gasolina, litro, desconto, alresult, garesult;
    public double al(){
            if (litro <= 20){
            desconto = 0.03;
            while (litro <= 20){
                alresult = (alcool * litro) - (litro * desconto);
                return alresult;
            }
        } else {
            desconto = 0.06;
            alresult = (alcool * litro) - (litro * desconto);
           return alresult;
        }
            return alresult;
        }
    public double gas(){
            if (litro <= 20){
            desconto = 0.04;
            while (litro <= 20){
                garesult = (gasolina * litro) - (litro * desconto);
                return garesult;
            }
        } else {
            desconto = 0.06;
            garesult = (gasolina * litro) - (litro * desconto);
            return garesult;
            }
            return garesult;
        }
    }

