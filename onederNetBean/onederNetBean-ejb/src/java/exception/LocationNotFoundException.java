/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Kian Wee
 */
public class LocationNotFoundException extends Exception {

    public LocationNotFoundException() {
    }

    public LocationNotFoundException(String msg) {
        super(msg);
    }
}
