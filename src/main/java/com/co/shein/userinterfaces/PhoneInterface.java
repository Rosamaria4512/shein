package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PhoneInterface {
    public static final Target BTN_CELULARES=Target.the("ir al modulo de celulares").locatedBy("//a[@id='itemc'][1]");
    public static final Target OP_CELULARES=Target.the("seleccionar producto").locatedBy("(//a[@href='prod.html?idp_=3'])[1]");
    public static final Target BUY_CELULARES=Target.the("boton seleccionar").locatedBy("(//a[@href='#'])[7]");
    public static final Target TO_CARRITO= Target.the("ir al carrito ").locatedBy("//a[@href='cart.html']");
    public static final Target TEXT_DELETE= Target.the("eliminar compra ").locatedBy("(//a[@href='#'])[8]");

}
