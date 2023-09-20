package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ContactUserInterface {
    public static final Target BTN_CONTACT = Target.the("Ir al modulo contactos").locatedBy("(//a[@href='#'])[1]");
    public static final Target TXT_EMAIL_DIR = Target.the("Escribir el correo").locatedBy("//input[@id='recipient-email']");
    public static final Target TXT_NAME_DIR = Target.the("Escribir el receptor").locatedBy("//input[@id='recipient-name']");
    public static final Target TT_MESAGGE = Target.the("Escribir el mensaje").locatedBy("//textarea[@id='message-text']");
    public static final Target BTN_SEND = Target.the("Enviar el mensaje").locatedBy("(//button[@type='button'])[3]");
}
