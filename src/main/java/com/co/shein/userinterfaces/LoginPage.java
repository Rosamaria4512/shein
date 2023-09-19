package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {



    public static final Target TXT_USER = Target.the("campo para user")
            .locatedBy("//input[@id='loginusername']");
    public static final Target TXT_PASS= Target.the("campo para pass")
            .locatedBy("//input[@id='loginpassword']");
    public static final Target BTN_LOGIN = Target.the("Boton login")
            .locatedBy("//button[@onclick='logIn()']");
    public static final Target BTN_CLOSE = Target.the("Boton Cerrar")
            .locatedBy("(//button[@class=\"btn btn-secondary\"])[4]");






}


