package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target  BTN_ICON = Target.the("click en el icono sing up")
            .locatedBy("//*[@id='signin2']");
    public static final Target TXT_NAME= Target.the("CAMPO PARA NOMBRE")
            .locatedBy("//*[@id='sign-username']");
    public static final Target TXT_PASSWORD = Target.the("CAMPO PARA CONTRASENA")
            .locatedBy("//*[@id='sign-password']");
    public static final Target BTN_SING_UP = Target.the("Boton SINGUP")
            .locatedBy("//*[@id='signInModal']/div/div/div[3]/button[2]");
    public static final Target VALIDATION_REGISTER = Target.the("validacion para registrpo exitoso")
            .locatedBy(" //*[@id='signInModalLabel']");


}
