package com.mycompany.posto;

public class Posto2 {
    public double alcool, gasolina, litro, desconto, alresult, garesult;
    public double al(){
            if (litro <= 20){
                    desconto = litro * 0.03;
                    alresult = (alcool * litro) - (desconto);
                    return alresult;               
            } else {
            desconto = litro * 0.06;
            alresult = (alcool * litro) - (desconto);
           return alresult;
            }
        }
    public double gas(){
            if (litro <= 20){
                    desconto = litro * 0.04;
                    garesult = (gasolina * litro) - (desconto);
                    return garesult;
            } else {
                desconto = litro * 0.05;
                garesult = (gasolina * litro) - (desconto);
                return garesult;
                }
        }
    }

