package bugreport;

import org.modelmapper.ModelMapper;

public class App {
    public static void main(String[] args) {
        new ModelMapper().typeMap(A.class, A.class).validate();
        System.out.println("Validation done");
    }
}
