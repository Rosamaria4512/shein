package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LaptopInterface {
    public static final Target OP_lAPTOP= Target.the("Seleccionar modulo laptop").locatedBy("(//a[@href=\"#\"])[8]");
    public static final Target SELECT_PRODUCT= Target.the("Seleccionar laptop").locatedBy("(//div[@class=\"card h-100\"])[1]");
    public static final Target BUY_PRODUCT= Target.the("comprar laptop").locatedBy("(//a[@href=\"#\"])[7]");
    public static final Target TO_CARRITO= Target.the("ir al carrito ").locatedBy("(//a[@href=\"#\"])[3]");
    public static final Target VERYFY_BUY= Target.the("verificar compra ").locatedBy("//a[text()=\"Delete\"]");
}
