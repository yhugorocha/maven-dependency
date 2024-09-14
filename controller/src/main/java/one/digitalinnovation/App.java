package one.digitalinnovation;

import one.digitalinnovation.core.Core;

/**
 * Hello Modules!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello Modulo controller!" );

        Core core = new Core();
        System.out.println(core.HelloCore());

        Service service = new Service();
        System.out.println(service.HelloService());
    }
}
