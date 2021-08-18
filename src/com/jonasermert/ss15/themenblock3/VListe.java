package com.jonasermert.ss15.themenblock3;

import java.util.Iterator;

public class VListe<T> implements Iterable<T> {
    private Listenelement<T> start;
    private Listenelement<T> end;

    private void setStart(Listenelement<T> elt) {
        start = elt;
    }

    Listenelement<T> getStart() {
        return start;
    }

    private Listenelement<T> getEnd() {
        return end;
    }

    private void setEnd(Listenelement<T> end) {
        this.end = end;
    }

    private Listenelement<T> find(Listenelement<T> find) {
        Listenelement<T> elt = start;
        while (elt != null) {
            if (elt.getData().equals((find.getData())))
                return elt;
            elt = elt.getSuccessor();
        }
        return null;
    }

    public T find(T data) {
        Iterator<T> it = new VListeIterator<T>(this);
        while (it.hasNext()) {
            T t = it.next();
            if (t.equals(data))
                return t;
        }
        return null;
    }

    public boolean contains(T data) {
        return find(data) == null ? false : true;
    }

    private void insertAfter(Listenelement<T> wo, Listenelement<T> elt) {
        elt.setSuccessor(wo.getSuccessor());
        wo.setSuccessor(elt);
    }

    private Listenelement<T> findBefore(Listenelement<T> wo) {

        Listenelement<T> lastCurrent = start;
        Listenelement<T> current = start;

        while (current != null) {

            if (current.getData().equals(wo.getData())) {
                return lastCurrent;
            }

            lastCurrent = current;
            current = current.getSuccessor();
        }

        return null;

    }

    private void insertBefore(Listenelement<T> wo, Listenelement<T> elt) {
        Listenelement<T> woBefore = findBefore(wo);
        if (woBefore == start) {
            elt.setSuccessor(start);
            start = elt;
        } else {
            insertAfter(woBefore, elt);
        }

    }

    public void insertBefore(T wo, T obj) {
        insertBefore(new Listenelement<T>(wo), new Listenelement<T>(obj));
    }

    public void insertAfter(T wo, T obj) {
        Listenelement<T> element = find(new Listenelement<T>(wo));
        Listenelement<T> elt = new Listenelement<>(obj);
        this.insertAfter(element, elt);
    }

    @Override
    public String toString() {
        String str = " ";
        Listenelement<T> elt = start;
        while (elt != null) {
            str = str + " " + elt.toString();
            elt = elt.getSuccessor();
        }
        return str;
    }

    private void append(Listenelement<T> neuelt) {
        if (start == null) {
            setStart(neuelt);
            setEnd(neuelt);
        } else {
            end.setSuccessor(neuelt);
            setEnd(neuelt);
            // Listenelement<T> elt = start;
            // while (elt.getSuccessor() != null)
            // elt = elt.getSuccessor();
            // elt.setSuccessor(neuelt);
        }
    }

    public void append(T data) {
        // Listenelement le = new Listenelement();
        // le.setData(data);
        append(new Listenelement<T>(data));
    }

    @Override
    public Iterator<T> iterator() {
        return new VListeIterator<>(this);
    }

    public void delete(T elt) {
        if (start == null)
            return;
        if (this.start.getData().equals(elt))
            start = start.getSuccessor();
        else {
            Listenelement<T> x = start;
            Listenelement<T> pred_elt;
            do {
                pred_elt = x;
                x = x.getSuccessor();
            } while ((x != null) && (!x.getData().equals(elt)));
            if (x != null)
                pred_elt.setSuccessor(x.getSuccessor());
        }
    }

}