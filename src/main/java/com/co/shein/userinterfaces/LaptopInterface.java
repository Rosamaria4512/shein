package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LaptopInterface {
    public static final Target TXT_SROLL=Target.the("Boton Home").locatedBy("//*[text()=\"CATEGORIES\"]");
    public static final Target OP_lAPTOP= Target.the("Seleccionar modulo laptop").locatedBy("(//a[@id=\"itemc\"])[2]");
    public static final Target SELECT_PRODUCT= Target.the("Seleccionar laptop").locatedBy("(//a[@href=\"prod.html?idp_=8\"])[1]");
    public static final Target BUY_PRODUCT= Target.the("comprar laptop").locatedBy("(//a[@href=\"#\"])[7]");
    public static final Target TO_CARRITO= Target.the("ir al carrito ").locatedBy("//a[@href='cart.html']");
    public static final Target CONTENEDOR_PRODUCTS=Target.the("Cobtenedor de productos").locatedBy("//tr[@class=\"success\"]");
    public static final Target TEXT_DELETE= Target.the("eliminar compra ").locatedBy("//a[text()=\"Delete\"]");
}
