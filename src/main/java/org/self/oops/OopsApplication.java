package org.self.oops;

import org.self.oops.Polymorphism.A;
import org.self.oops.Polymorphism.B;
import org.self.oops.Polymorphism.C;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OopsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OopsApplication.class, args);
        A a = new A();
        A b = new B();
        A c = new C();
        System.out.println(b.a1);

        b.Print();
        b.Print(8);



    }

}
