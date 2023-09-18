package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {



    public static final Target TXT_EMAIL = Target.the("campo para email")
            .locatedBy("(//input[@class='sui-input__inner sui-input__inner-suffix'])[1]");
    public static final Target BTN_CONTINUED = Target.the("click para cerrar alerta")
            .locatedBy("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div[3]/div/button");

    public static final Target TXT_PASSWORD = Target.the("campo para contrasena")
            .locatedBy(" /html/body/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div/input");
    public static final Target BTN_ID = Target.the("CLICK EN IDENTIFICARSE")
            .locatedBy("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div[8]/div[1]/button");
    public static final Target BTN_ACCEPT = Target.the("CLICK EN ACEPTAR")
            .locatedBy("/html/body/div[13]/div[2]/div/div[3]/div/div/div[1]/button");
    public static final Target BTN_HOP = Target.the("CLICK EN HOP")
            .locatedBy("//span[text()='Saltar']");
    public static final Target BTN_GAMIL = Target.the("CLICK EN HOP")
            .locatedBy("//em[text()='Continuar con Google']");
    public static final Target VERIFICATION = Target.the("CLICK EN HOP")
            .locatedBy("//span[text()='Hola, rmquilindo8']");






}


