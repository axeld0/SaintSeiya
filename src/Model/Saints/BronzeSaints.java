package Model.Saints;

import Model.Exceptions.TooWeakToFightException;

import java.util.HashSet;
import java.util.Objects;

public class BronzeSaints < T > {

    private HashSet < T > bronzeSaints;

    public BronzeSaints(HashSet<T> bronzeSaints) {
        this.bronzeSaints = bronzeSaints;
    }

    public BronzeSaints() {
        bronzeSaints = new HashSet<>();
    }

    public HashSet<T> getBronzeSaints() {
        return bronzeSaints;
    }

    public void setBronzeSaints(HashSet<T> bronzeSaints) {
        this.bronzeSaints = bronzeSaints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BronzeSaints<?> that = (BronzeSaints<?>) o;

        return Objects.equals(bronzeSaints, that.bronzeSaints);
    }

    @Override
    public int hashCode() {
        return bronzeSaints != null ? bronzeSaints.hashCode() : 0;
    }




    public boolean addSaint (T saint) throws TooWeakToFightException {
        boolean added = false;
        if(saint instanceof AthenaSaint)
        {
            if(((AthenaSaint) saint).getHp() <= 0 || ((AthenaSaint) saint).getPower() <= 0)
            {
                throw new TooWeakToFightException("No!");
            }
            bronzeSaints.add(saint);
            added = true;
        }
        return  added;
    }

    public boolean delete (T saint) throws NoSuchFieldException
    {
        boolean deleted = false;
        if(saint instanceof AthenaSaint)
        {
            if(bronzeSaints.contains(saint) == false)
            {
                throw new NoSuchFieldException("Not found, sory.");
            }
            bronzeSaints.remove(saint);
            deleted = true;
        }
        return  deleted;
    }

   public String toString()
   {
       StringBuilder sb = new StringBuilder();

       for (T saints : bronzeSaints)
       {
           sb.append(saints);
       }
       return "Bronze saints : " + sb.toString();
   }

}
