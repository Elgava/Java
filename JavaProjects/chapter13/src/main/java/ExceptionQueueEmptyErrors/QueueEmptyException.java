/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionQueueEmptyErrors;

/**
 *
 * @author elgin
 */
public class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty.";
    }
}
