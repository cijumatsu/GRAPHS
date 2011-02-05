/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author cijumatsu
 */
public class PrintDataStructure {

    //when instantiating this class call the instance print -> so then it will be print.stack(stack)
    public void stack(Stack stack){
        //System.out.println( "Non-destructively enumerate the Stack." );
        Enumeration e = stack.elements();
        while ( e.hasMoreElements() ){
            System.out.print( e.nextElement() + " ");
        }
        System.out.println();
    }

    //when instantiating this class call the instance print -> so then it will be print.queue(queue)
    public void queue(Queue queue){
    //System.out.println("CONTENTS OF QUEUE : ");
        //access via Iterator
        Iterator iterator = queue.iterator();
            while(iterator.hasNext()){
                String element = (String) iterator.next();
                        System.out.print(element + " ");
            }
        System.out.println();
    }

}
