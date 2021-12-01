package Exceptional_handling;

import java.io.IOException;

//user defined exception
public class B8 {
    public static void main(String[] args) throws NoHelmetException {
        throw new NoHelmetException();
    }
}
class NoHelmetException extends Exception{}
