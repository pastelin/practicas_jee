package section.lambda.mini_challenges;

import java.util.function.Supplier;

public class MiniChallenge3 {

    public static void main(String[] args) {

        Supplier<String> iLoveJava = () -> "I Love java";
        Supplier<String> iLoveJava2 = () -> {
            return "I Love java";
        };

        // Se utiliza el método get() para obtener el valor almacenado en el Supplier
        System.out.println(iLoveJava2.get());

        String supplierResult = iLoveJava(iLoveJava);
        System.out.println(supplierResult);

    }

    public static String iLoveJava(Supplier<String> s) {
        return s.get();
    }

}
