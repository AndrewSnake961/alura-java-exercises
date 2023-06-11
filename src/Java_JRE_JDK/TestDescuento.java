package Java_JRE_JDK;
public class TestDescuento {
    // Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.
    //Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.
    //Para compras superiores a $300.0, el descuento es del 20%.

    public static double discountConditional(double priceProduct) {
        double result =
                (priceProduct >= 100.0 && priceProduct <= 199.99) ? 0.1 :
                        (priceProduct >= 200.0 && priceProduct <= 299.99) ? 0.15 :
                                (priceProduct >= 300.0) ? 0.2 : 0;
        return result;

    }

    public static void main(String[] args) {

        double valorCompra = 300.0;
        double finalDiscount = (discountConditional(valorCompra)) * 100;
        double finalPrice = valorCompra - (valorCompra * discountConditional(valorCompra));
        System.out.println(String.format("El descuento es de: %.2f%%, y el precio final es : %.2f  ", finalDiscount,finalPrice ));

    }

}
