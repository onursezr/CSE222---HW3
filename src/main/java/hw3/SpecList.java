/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.*;

/**
 *
 * @author Onur Sezer
 */
public class SpecList<E extends Comparable<E>> extends LinkedList<E>{


    /**
     * Parametre olarak aldigi listeyi kendi listesinin basina ekler
     * @param c : Listenin basina eklenecek olan list objesi
     * @return boolean 
     */
    public boolean addAllAtHead(Collection<? extends E> c)
    {
        int i = 0;
        Iterator<E> iter = (Iterator<E>) c.iterator();
        while(iter.hasNext()) {
            listIterator(i).add(iter.next());
            i++;
        }
        return true;
    }
    /**
     * Parametre olarak aldigi listeyle kendi listesinin intersectini alir
     * Sonucu list olarak return eder
     * @param c : Intersecti alinicak olan list objesi
     * @return 
     */
    public List<E> getIntersectList (Collection<? extends E> c)
    {
        if(c.size() == 0)
            throw new InputMismatchException("Empty list !");
        List<E> list = new LinkedList<E>();
        ListIterator ite = listIterator();
        while(ite.hasNext())
        {
            E temp = (E) ite.next();
            if(c.contains(temp))
                list.add(temp);
        }
        return list;
    }
    /**
     * Cocktail sort kullanarak siralama islemi yapar.
     * Increasing ya da decreasing olarak listeyi siralar
     * @param status : decreasing ya da increasing olmasini saglar
     * @return : List,  siralanmis listedir
     */
    public List<E> sortList(String status)
    {
        boolean swap;
        ListIterator<E> ite1, ite2, ite3;
        ite1 = listIterator();
        ite2 = listIterator();
        if(status.equals("increasing"))
        {
            do {
                swap = false;
                while (ite1.hasNext()){
                    E el1 = ite1.next();
                    ite2 = listIterator(ite1.nextIndex());
                    if(ite2.hasNext()){
                        E el2 = ite2.next();
                        if(el1.compareTo(el2) > 0)
                        {
                            E temp = el1;
                            ite1.set(el2);
                            ite2.set(temp);
                            swap = true;
                        }
                    }
                }
                if(!swap)
                    break;
                swap = false;
                while(ite1.hasPrevious()) {
                    E el1 = ite1.previous();
                    ite2 = listIterator(ite1.nextIndex());
                    if(ite2.hasPrevious()){
                        E el2 = ite2.previous();
                        if(el1.compareTo(el2) < 0)
                        {
                            E temp = el1;
                            ite1.set(el2);
                            ite2.set(temp);
                            swap = true;
                        }
                    }
                }
            }while(swap);
        }
        else if(status.equals("decreasing"))
        {
            do {
                swap = false;
                while (ite1.hasNext()){
                    E el1 = ite1.next();
                    ite2 = listIterator(ite1.nextIndex());
                    if(ite2.hasNext()){
                        E el2 = ite2.next();
                        if(el1.compareTo(el2) < 0)
                        {
                            E temp = el1;
                            ite1.set(el2);
                            ite2.set(temp);
                            swap = true;
                        }
                    }
                }
                if(!swap)
                    break;
                swap = false;
                while(ite1.hasPrevious()) {
                    E el1 = ite1.previous();
                    ite2 = listIterator(ite1.nextIndex());
                    if(ite2.hasPrevious()){
                        E el2 = ite2.previous();
                        if(el1.compareTo(el2) > 0)
                        {
                            E temp = el1;
                            ite1.set(el2);
                            ite2.set(temp);
                            swap = true;
                        }
                    }
                }
            }while(swap);
        }
        else
            throw new InputMismatchException("Illegal input.You must enter 'decreasing' or 'increasing'.");
        List<E> list = new LinkedList<E>();
        for (int i = 0; i < size(); i++)
            list.add(get(i));

        return list;
    }
}

